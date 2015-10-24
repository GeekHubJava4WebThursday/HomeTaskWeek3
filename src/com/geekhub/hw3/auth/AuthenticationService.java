package com.geekhub.hw3.auth;

import com.geekhub.hw3.auth.exceptions.*;
import com.sun.istack.internal.NotNull;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuthenticationService {

    private static final String STORAGE_FILENAME = "users.txt";

    public static void main(String[] args) {
        AuthenticationService authService = new AuthenticationService();

        try {
            User ivan = authService.auth("IvAn", "blah");
            successLoginMessage(ivan);
        } catch (AuthException e) {
            onAuthException(e);
        }

        try {
            User batman = authService.auth("Batman", "catwoman");
            successLoginMessage(batman);
        } catch (AuthException e) {
            onAuthException(e);
        }
    }

    /**
     * Authorizing user with specified login and password
     * @param login user's login
     * @param password user's password
     * @return user's data object
     * @throws AuthException
     */
    private User auth(String login, String password) throws AuthException {
        if (login == null || Objects.equals(login, "")) {
            throw new WrongCredentialsException("User can not have empty login");
        }
        if (password == null || Objects.equals(password, "")) {
            throw new WrongCredentialsException("User can not have empty password");
        }

        List<User> users;
        try {
            users = getUsersList(STORAGE_FILENAME);
        } catch (FileNotFoundException e) {
            throw new AuthException("Can not connect to storage: " + e.getMessage());
        } catch (IOException e) {
            throw new AuthException("Error while reading storage: " + e.getMessage());
        }
        //System.out.println(users.toString());

        for (User user : users) {
            if (login.equals(user.getLogin())) {
                if (getMd5Hash(password).equals(user.getPasswordMd5())) {
                    return user;
                } else {
                    throw new WrongPasswordException("Wrong password for " + login);
                }
            }
        }
        throw new UserNotFoundException("User with '" + login + "' login does not exist");
    }

    /**
     * Reads information about users from storage
     * @param usersFilename name of file, which contains information about users
     * @return list of all users
     * @throws IOException
     * @throws StorageDataStructureException
     */
    private static List<User> getUsersList(String usersFilename)
            throws IOException, StorageDataStructureException {
        List<User> users = new ArrayList<>();

        File usersFile = new File(usersFilename);
        if (! usersFile.exists()) {
            throw new FileNotFoundException("Storage had been moved or deleted");
        }

        BufferedReader usersFileBufferedReader = new BufferedReader(new FileReader(usersFile));
        String line;
        while ( (line = usersFileBufferedReader.readLine()) != null) {
            if (Objects.equals(line, "")) {
                continue;
            }
            if (line.charAt(0) == '#') {
                continue;
            }

            Pattern userRecordPattern = Pattern.compile("^\\s*(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s*$");
            Matcher matcher = userRecordPattern.matcher(line);
            if (! matcher.matches()) {
                throw new StorageDataStructureException("Wrong record in storage");
            }

            String surname = matcher.group(1);
            String name = matcher.group(2);
            String login = matcher.group(3);
            String passwordMd5 = matcher.group(4);
            User userData = new User(surname, name, login, passwordMd5);
            users.add(userData);
        }

        return users;
    }

    /**
     * Gets md5 hash from incoming string and returns his hash string in hex format
     * @param input string for hashing
     * @return md5 hash in hex format
     */
    private static String getMd5Hash(@NotNull String input) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        md.update(input.getBytes());

        byte byteData[] = md.digest();

        StringBuilder hexStringBuilder = new StringBuilder();
        for (int i = 0; i < byteData.length; i++) {
            String hex = Integer.toHexString(0xff & byteData[i]);
            if (hex.length() == 1) hexStringBuilder.append('0');
            hexStringBuilder.append(hex);
        }

        return hexStringBuilder.toString();
    }

    private static void onAuthException(AuthException e) {
        System.out.println("Authorization failed: " + e.getMessage());
    }

    private static void successLoginMessage(User user) {
        System.out.println(user.getSurname() + " " + user.getName() + " successfully authorized");
    }

}

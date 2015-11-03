package com.geekhub.hw3.auth;

public class AuthenticationService {

    public static void main(String[] args) {
        AuthenticationService authService = new AuthenticationService();

        try {
            User blah = authService.auth("blah", "blah");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            User batman = authService.auth("Batman", "catwoman");
        } catch (Exception e) {
            //TODO: react
            e.printStackTrace();
        }
        try {
            User testing = authService.auth("", "");
        } catch (Exception e) {
            //TODO: react
            e.printStackTrace();
        }
        try {
            User bambala = authService.auth("Batman", "catwssdoman");
        } catch (Exception e) {
            //TODO: react
            e.printStackTrace();
        }
    }

    private User[] users = {
        new User("Geekhub", "qwe123"),
        new User("Batman", "catwoman")
    };

    private User auth(String login, String password) throws AuthException, WrongPasswrodException, WrongCredentialsException, UserNotFoundException {
        //TODO: Implement me

        for(int i = 0; i < users.length; i++){
            User user = users[i];
            if(user.getLogin().equals(login) && user.getPassword().equals(password)){
                return user;
            } else if(user.getLogin().equals(login) && user.getPassword().equals("")){
                throw new WrongPasswrodException ("Password is incorrect");
            }
            else if(user.getLogin().equals("") && user.getPassword().equals("")){
                throw new WrongCredentialsException ("You have entered wrong credentials");
            }
            else {
                throw new UserNotFoundException ("User does not exists");
            }
        }
            return null;
    }
}

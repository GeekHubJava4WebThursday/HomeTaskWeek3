package com.geekhub.hw3.auth;

/**
 * Class for WrongPasswrodException
 */
public class WrongPasswrodException extends AuthException{

  public WrongPasswrodException(){
      super();
  }

  public WrongPasswrodException(String exeption){
      super(exeption);
  }

}

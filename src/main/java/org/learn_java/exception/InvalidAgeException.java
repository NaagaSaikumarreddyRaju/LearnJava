package org.learn_java.exception;

public class InvalidAgeException extends RuntimeException{
    //default constructor

    InvalidAgeException(String msg){
        super(msg);
    }
}

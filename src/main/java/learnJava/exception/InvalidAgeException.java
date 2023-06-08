package learnJava.exception;

public class InvalidAgeException extends RuntimeException{
    //default constructor

    InvalidAgeException(String msg){
        super(msg);
    }
}

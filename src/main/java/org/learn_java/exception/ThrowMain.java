package org.learn_java.exception;

public class ThrowMain {

    // throw keyword : To handle user defined exceptions (own exceptions)
    // 1. User Defined checked exception
    // class InvalidAgeException extends RuntimeException{}
    // a. default constructor approach  : displaying exception without description
    // b. params constructor approach : displaying exception with description


    // a. default constructor approach  : displaying exception without description
    static void validate(int age){
        if(age > 18){
            System.out.println("eligible for mrg");
        }else{
            //throw new ArithmeticException("compiler throw arithmetic exception,we don't need this ");
            throw new InvalidAgeException("you are not eligible");
        }
    }

    public static void main(String[] args) {
        ThrowMain.validate(17);
    }


    // b. params constructor approach : displaying exception with description

//    static void validate(int age){
//        if(age > 18){
//            System.out.println("eligible for mrg");
//        }else{
//            //throw new ArithmeticException("compiler throw arithmetic exception,we don't need this ");
//            throw new InvalidAgeException();
//        }
//    }
//
//    public static void main(String[] args) {
//        ThrowMain.validate(17);
//    }





    // 2. User Defined Unchecked Exception
    // class InvalidAgeException extends Exception{}

//    static void validate(int age) throws InvalidAgeException{
//        if(age > 18){
//            System.out.println("eligible for mrg");
//        }else{
//            //throw new ArithmeticException("compiler throw arithmetic exception,we don't need this ");
//            throw new InvalidAgeException();
//        }
//    }
//
//    public static void main(String[] args) throws InvalidAgeException{
//        ThrowMain.validate(17);
//    }

}

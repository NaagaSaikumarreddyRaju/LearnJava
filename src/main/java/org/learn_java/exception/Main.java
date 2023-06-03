package org.learn_java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

// Exception can be Handled two ways
// 1. using try-catch
// 2. using throws

    public static void main(String[] args) {

        //Case 1:
        System.out.println("Hi Sai");
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println(10/2);
        }
        System.out.println("Continued Code Flow");

        //Case 2: If the catch block is not matched then program terminated Abnormally
//        try{
//            System.out.println(10/0);
//        }catch(NullPointerException e){
//            System.out.println(10/2);
//        }
//        System.out.println("Terminated Abnormally");

        //Case 3: If there is no exception in try block, catch block not checked
        try{
            System.out.println("Sai");
        }catch(NullPointerException e){
            System.out.println(10/2);
        }

        //Case 4: Independent try block not allowed it should have catch block
        //Case 5: try immediately followed by catch or finally. no blocks between try and catch
        //Case 6: If we have exception in try it will be handled in catch.
        // if the exception is raised in catch then it is abnormal execution

        //Case 7: If we encounter the exception first,then the following code in try block won't be executed
        try{
            System.out.println(10/0);
            System.out.println("Sai");
            System.out.println("kumar");
        }catch(ArithmeticException e){
            System.out.println(10/2);
        }

        //Case 8: catch block order will child to parent
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter division value");
        try{
            int num = sc.nextInt();
            System.out.println(10/num);
            System.out.println("sai".charAt(10));
        }catch(InputMismatchException e){
            System.out.println("Enter Valid Data");
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        //Case 8: Unchecked exceptions and checked exceptions using Pipe Symbol
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter division value");
        try{
            int num = sc1.nextInt();
            System.out.println(10/num);
            System.out.println("sai".charAt(10));
        }catch(InputMismatchException | ArithmeticException | StringIndexOutOfBoundsException e){
            System.out.println("Enter Valid Data");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        //Case 9:
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter division value");
        try{
            int num = sc2.nextInt();
            System.out.println(10/num);
            System.out.println("sai".charAt(10));
        }catch(InputMismatchException | ArithmeticException | StringIndexOutOfBoundsException e){
            System.out.println("Enter Valid Data");
        }catch(Exception e){
           e.printStackTrace();
        }

        // Case 10: finally block. Code in finally will be executed if we have normal and abnormal conditions
        // Mostly we will use that for connection like databases or any cleanup activity to be closed.

        //Case 11: Declare the resource using try block, once the try block is completed the resource is automatically released.
        // How it is released? It uses internally AutoClosable Interface
        //eg: try(FileInputStream fis = new FileInputStream("abc.txt")){}

    }
}

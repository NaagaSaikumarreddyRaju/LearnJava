package org.learn_java.exception;

public class ThrowsMain {
    //case1:
    void studentDetails() throws InterruptedException {
        System.out.println("sai is sleeping");
        Thread.sleep(3000);
        System.out.println("do not disturb");
    }
    void hod() throws InterruptedException {
        studentDetails();
    }
    void principal() {
        try {
            hod();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    void officeBoy() {
        principal();
    }
    public static void main(String[] args) {
        ThrowsMain throwsMain = new ThrowsMain();
        throwsMain.officeBoy();
    }

    //case2: JVM to handle exception if no one wants to handle exception
//    void studentDetails() throws InterruptedException {
//        System.out.println("sai is sleeping");
//        Thread.sleep(3000);
//        System.out.println("do not disturb");
//    }
//    void hod() {
//        studentDetails();
//    }
//    void principal() {
//        hod()
//    }
//    void officeBoy() {
//        principal();
//    }
//    public static void main(String[] args) throws InterruptedException{
//        ThrowsMain throwsMain = new ThrowsMain();
//        throwsMain.officeBoy();
//    }







}

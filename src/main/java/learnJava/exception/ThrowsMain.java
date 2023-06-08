package learnJava.exception;

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


// Note: only the unchecked exceptions are propagated automatically but not checked.
// The checked exceptions are propagated using throws keyword

// Note: Using throws can we delegate unchecked exception?
//yes possible but not recommended, because unchecked exceptions are automatically propagated
}

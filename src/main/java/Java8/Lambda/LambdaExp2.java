package Java8.Lambda;
@FunctionalInterface
interface loginPage{
    String Service(String username, String password);
}
public class LambdaExp2 {
    public static void main(String[] args) {

        loginPage loginPage = (username,password) -> {return username.equalsIgnoreCase("sai") &&
                                             password.equals("sai@123") ? "Login Successful" : "Login Unsuccessful";};

        String str = loginPage.Service("sai","sai@123");

        System.out.println("MessageDisplayed.."+str);

        loginPage loginPage1 = (username,password) -> username.equalsIgnoreCase("sai") &&
                password.equals("sai@123") ? "Login Successful" : "Login Unsuccessful";

        String str1 = loginPage1.Service("sai","sai321");

        System.out.println("MessageDisplayed.."+str1);

        //While writing the lambda expression, return statement is optional
    }
}

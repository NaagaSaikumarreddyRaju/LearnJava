package Java8;
@FunctionalInterface
interface Operations{
    void add(int num1,int num2);
}
public class LambdaExp1 {
    public static void main(String[] args) {

        Operations op1 = (int a,int b) -> System.out.println("Addition of given numbers="+(a+b));
        op1.add(10,20);

        Operations op2 = (a,b) -> System.out.println("Addition of given numbers="+(a+b));
        op2.add(40,30);

        //No need of giving type of arguments is not needed

    }
}

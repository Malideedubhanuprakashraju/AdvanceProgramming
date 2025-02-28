package Lambdas_Streams;

public class Lambdas
{
    public static void main(String[] args)
    {
        // 1) Hello World Runnable
        // Traditional Approach

        Runnable r=new Runnable()
        {
            public void run()
            {
                System.out.println("Hello World");
            }

        };
        Thread t=new Thread(r);
        t.start();

        // Lambda Expression
        Runnable r1=()->System.out.println("Hello World By Lambdas--->");
        Thread t1=new Thread(r1);
        t1.start();

        // 2) Add Numbers

        MathOperation m=new MathOperation()
        {

            @Override
            public int operate(int a, int b) {
                return a+b;
            }
        };
        System.out.println(m.operate(10,20));

        // 2) Using Lambda Expression

        MathOperation m1=(x,y)->x+y;
        System.out.println("Using Lambda Expression "+m1.operate(10,20));

        // Lambda expressions can take parameters, making them versatile for various use cases.
        // 3) Lambda Expressions with Parameters

        NumberChecker n=new NumberChecker()
        {

            @Override
            public boolean check(int number)
            {
                return number%2==0;
            }
        };
        System.out.println(n.check(20));











    }
}

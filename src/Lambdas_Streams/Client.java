package Lambdas_Streams;

public class Client
{
    public static void main(String[] args)
    {
        //We can't create an object of Interface, because interfaces are incomplete.
        // 1. Create a class that implements the interface and provide the method body to all the methods.

        // 2. Anonymous Class

        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        Thread t=new Thread(r);
        t.start();

        // 3.Lambdas introduced in Java-8
        // () : Method input params
        // {} : Method body / implementation.

        Runnable r1=()->{
            System.out.println(Thread.currentThread().getName());
        };
        Thread t1=new Thread(r1);
        t1.start();

        Thread t2=new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        t2.start();



    }
}

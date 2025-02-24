package Lambdas;

public class Client
{
    public static void main(String[] args)
    {
        // We can't create an object of Interface, because interfaces are incomplete.
        // 1. Create a class that implements the interface and provide the method body to all the methods.
        Student s=new Student();
        Thread thread=new Thread(s);
        thread.start();

        // Way-2
        // Anonymous Class
        Runnable r=new Runnable()
        {
            @Override
            public void run()
            {
                System.out.println("Anonysmus Class"+Thread.currentThread().getName());
            }
        };
        Thread thread1=new Thread(r);
        thread1.start();

        // Way-3
        // Lambdas

        Runnable runnable=()->{
            System.out.println("Lambda Class"+Thread.currentThread().getName());
        };
        Thread thread2=new Thread(runnable);
        thread2.start();

        Thread t=new Thread(()->{
            System.out.println("ShortCut for Lambda Class"+Thread.currentThread().getName());
        });
        t.start();


        Thread s1=new Thread(()->
        {
            System.out.println("Sample Interface Class"+Thread.currentThread().getName());
        });
        s1.start();

    }
}

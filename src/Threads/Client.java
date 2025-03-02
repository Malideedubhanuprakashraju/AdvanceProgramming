package Threads;
/*
        Print Hello world from a new Thread.

        1. Create a task that you want to execute in a separate thread.
        2. Create a new Thread.
        3. Assign the task to the thread.
        4. Start the thread.
 */

public class Client
{
    public static void main(String[] args)
    {
        System.out.println("Hello World,Printed By Malideedu Bhanu: "+Thread.currentThread().getName());

        // Way-1 : Subclassing a Thread Class
        // Create a Task class and extends Thread an give implementation of Run Method()

        NewThread n=new NewThread();
        n.setName("MyThread-1");
        n.start();
        NewThread n2=new NewThread();
        n2.setName("MyThread-2");
        n2.start();

        // Way -2 : Using Runnable (Preferred Way)

        // 1) Create a task Object.
        HelloWorld h=new HelloWorld();

        // 2) Create a Thread.
        // 3) Assign task to the Thread.
        Thread t=new Thread(h);

        // 4) Start The Thread
        t.start();

        System.out.println("Hello World, Printed By Malideedu Bhanu: "+Thread.currentThread().getName());


        Helper.doSomething();

        // Number Printer by Extends Thread Class
        NumberPrinterExtends np=new NumberPrinterExtends();
        np.start();

        // Number Printer by implements Runnable Interface
        NumberPrinterImplements npi=new NumberPrinterImplements();
        Thread ti=new Thread(npi);
        ti.start();









    }
}

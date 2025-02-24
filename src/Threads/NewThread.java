package Threads;

public class NewThread extends Thread
{
    public void run()
    {
        System.out.println("New Thread : "+Thread.currentThread().getName());

    }
}

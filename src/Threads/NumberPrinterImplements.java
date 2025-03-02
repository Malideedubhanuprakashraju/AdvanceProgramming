package Threads;

public class NumberPrinterImplements implements Runnable
{

    @Override
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println(i);
        }

    }
}

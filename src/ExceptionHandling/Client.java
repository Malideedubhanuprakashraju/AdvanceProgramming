package ExceptionHandling;

public class Client
{
    public static void main(String[] args) throws Throwable
    {
        System.out.println("Hello World");
        Thread.sleep(5000);
        System.out.println("Hello World-2");
        caller();

    }

    private static void caller()throws Throwable
    {
        System.out.println("Hello World");
        Thread.sleep(2000);
        System.out.println("Hello World-2");
    }
}

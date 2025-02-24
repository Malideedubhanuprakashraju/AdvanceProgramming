package ExceptionHandling;

public class ExceptionClass
{
//    public static void main(String[] args)
//    {
//        System.out.println("Main Starts");
//        try
//        {
//            int x=10;
//            int y=0;
//            int z=x/y;
//            System.out.println(z);
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println(e.getMessage());
//        }
//
//    }

    public static void main(String[] args)
    {
        System.out.println("Main Starts");
        try
        {
            int x=10;
            int y=0;
            int z=x/y;
            System.out.println(z);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Main Ends");

    }
}

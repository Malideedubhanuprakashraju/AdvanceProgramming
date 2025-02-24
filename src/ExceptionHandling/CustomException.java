package ExceptionHandling;

public class CustomException
{
    public static void main(String[] args)
    {
        try {
            legalAge(16);
        } catch (Exception e)
        {
             System.out.println(e.getMessage());
        }

    }

    private static void legalAge(int age) throws Exception
    {
        if(age>18)
        {
            System.out.println("You are legal");
        }
        else
        {
            throw new Exception("Age is Not Legal");
        }
    }
}

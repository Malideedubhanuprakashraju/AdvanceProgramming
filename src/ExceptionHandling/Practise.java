package ExceptionHandling;


import java.rmi.RemoteException;
import java.util.Scanner;

public class Practise
{
    public static void main(String[] a) throws  RemoteExceptions
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = in.nextInt();
        if(num==0)
        {
            throw new RemoteExceptions();

        }
        System.out.println(num);


    }
}

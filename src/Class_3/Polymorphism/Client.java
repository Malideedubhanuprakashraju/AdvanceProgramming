package Class_3.Polymorphism;

public class Client
{
    public static void main(String[] args)
    {
        MethodOverloading m = new MethodOverloading();
      //  m.printm();
        m.printm("Bhanu");
        m.printm("Raju",25);


        // Method Overriding

        Mr2 m2 = new Mr2();
        m2.printm();

    }
}

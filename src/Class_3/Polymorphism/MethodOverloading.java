package Class_3.Polymorphism;

public class MethodOverloading
{
    private String name;
    private String email;

    public void printm()
    {
        System.out.println("Empty Parameters Method Overloading");
    }
    public void printm(String name)
    {
        System.out.println("Single Parameters Method Overloading");
    }
    public void printm(String name, int age)
    {
        System.out.println("Multiple Parameters Method Overloading");
    }
}

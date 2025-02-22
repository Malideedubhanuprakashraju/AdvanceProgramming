package Class_1;

public class Client
{
    public static void main(String[] args)
    {
        AccessModifiers a=new AccessModifiers(1,"Bhanu","25",300000,"TCS");

        System.out.println(a.getId());
        System.out.println(a.getName());
        System.out.println(a.age);
        System.out.println(a.salary);
        System.out.println(a.company);

        a.setId(100);
        System.out.println(a.getId());
        System.out.println(a.getName());
        System.out.println(a.age);
        System.out.println(a.salary);
        System.out.println(a.company);

    }
}

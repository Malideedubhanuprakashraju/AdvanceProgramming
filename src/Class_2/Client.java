package Class_2;

public class Client
{
    public static void main(String[] args)
    {
        GettersAndSetters c=new GettersAndSetters(1,"Bhanu");
        System.out.println(c);
        System.out.println(c.getId());
        System.out.println(c.setId(10000));
        System.out.println(c.getId());
        System.out.println(" ");
        System.out.println(c.getName());

        // Constructors Main
        Constructors obj=new Constructors();
        System.out.println(obj);
        Constructors obj2=new Constructors("Prakash","banu@gmail.com");
        System.out.println(obj2);

        // Copy Constructor

        CopyCon cp=new CopyCon();
        System.out.println(cp);
        CopyCon cp2=new CopyCon(cp);
        System.out.println(cp2);

        // Shallow Copy

        ShallowCopy s=new ShallowCopy(1,"Raju");
        System.out.println(s);
        ShallowCopy s1=s;
        System.out.println(s1);







    }
}

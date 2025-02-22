package Class_3;

public class A
{
    private int id;
    private String name;
    public String age;
    double salary;


    public void setId(int id)
    {
         this.id = id;
    }
    public int getId()
    {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Aprint()
    {
        System.out.println("A is Super Class To All Classes");
    }
}

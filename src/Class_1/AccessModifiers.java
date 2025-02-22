package Class_1;

public class AccessModifiers
{
    private int id;
    private String name;
    protected String age;
    double salary;
    public String  company;

    public AccessModifiers(int id, String name, String age, double salary, String company)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.company = company;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        if(id>15)
        {
            this.id = id;
        }
        else 
        {
            System.out.println("id is too big");
        }
    }

    public String getName() {
        return name;
    }
}

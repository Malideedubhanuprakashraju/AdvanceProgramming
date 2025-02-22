package Class_2;

public class GettersAndSetters
{
    private int id;
    private String name;

    public GettersAndSetters(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
    public int setId(int id)
    {
        if(id>1000)
        {
            this.id=id;
        }
        return id;
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
}

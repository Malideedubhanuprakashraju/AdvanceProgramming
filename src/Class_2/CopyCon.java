package Class_2;

public class CopyCon
{
    private int id;
    private String name;

    public CopyCon()
    {

    }

    public CopyCon(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public CopyCon(CopyCon student)
    {
        this.id = student.id;
        this.name = student.name;
    }
}

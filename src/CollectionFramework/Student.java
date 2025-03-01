package CollectionFramework;

public class Student implements Comparable<Student>
{
    int id;
    String name;
    int age;
    String gender;

    public Student(int id, String name, int age, String gender)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }



    @Override
    public int compareTo(Student o)
    {
        if(this.id<o.id)
        {
            return -1;
        }
        else if(this.id>o.id)
        {
            return 1;
        }
        return 0;
    }
}

package CollectionFramework;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting
{
    public static void main(String[] args)
    {
        Student s1=new Student(1,"Bhanu",25,"Male");
        Student s2=new Student(2,"Rani",35,"Female");
        Student s3=new Student(3,"raju",45,"Male");
        Student s4=new Student(4,"Boomi",20,"Female");

        List<Student> list=new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        Collections.sort(list);
        for(Student s:list)
        {
            System.out.print(s.name);
        }
        System.out.println("");
        Collections.sort(list,new AgeComparator());
        for(Student s:list)
        {
            System.out.println(s.name);
        }

        System.out.println("");

        Collections.sort(list,new NameComparator());
        for(Student ss:list)
        {
            System.out.println(ss.name);
        }


    }
}

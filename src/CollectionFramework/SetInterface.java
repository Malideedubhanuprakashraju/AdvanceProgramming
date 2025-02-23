package CollectionFramework;

import java.util.*;

public class SetInterface
{
    public static void main(String[] args)
    {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(8);

        System.out.println(set);

        Set<String> s=new LinkedHashSet<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s.add("e");
        s.add("f");
        System.out.println(s);

        SortedSet<String> ss=new TreeSet<>();
        ss.add("a");
        ss.add("b");
        ss.add("c");
        ss.add("d");
        ss.add("e");
        ss.add("f");
        System.out.println(ss);



    }
}

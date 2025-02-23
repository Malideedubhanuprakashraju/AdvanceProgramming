package CollectionFramework;

import java.util.*;

public class ListInterface
{
    public static void main(String[] args)
    {
        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.contains(5));

        List<Integer> l2=new LinkedList<>();
        l2.add(11);
        l2.add(22);
        l2.add(33);
        l2.add(44);
        l2.add(55);
        System.out.println(l2);

        List<String> l3 = new Vector<>();
        l3.add("aa");
        l3.add("bb");
        l3.add("cc");
        l3.add("dd");
        System.out.println(l3);
        System.out.println(l3.size());

        List<Double> l4=new Stack<>();
        l4.add(1.1);
        l4.add(2.2);
        l4.add(3.3);
        l4.add(4.4);
        System.out.println(l4);


    }


}

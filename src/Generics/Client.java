package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Client
{
    public static void main(String[] args)
    {
//        Pair p=new Pair();
//        p.first=1.2345;
//        p.second="1.234455";
//
//        double x= (double) p.first;
//        double y= (double) p.second;

        Pair<Integer,String> p=new Pair<>();
        p.first=10;
        p.second="Bhanu";
        System.out.println(p.getFirst());
        System.out.println(p.getSecond());

        Pair<String,Integer> p1=new Pair<>();
        p1.first="Hello";
        p1.second=30;
        System.out.println(p1.getFirst());
        System.out.println(p1.getSecond());

        List<Pair> ps=new ArrayList<>();
        ps.add(p);
        ps.add(p1);
        System.out.println(ps);

        // Raw types
        // Before Java 5

        HashMap h=new HashMap();
        h.put("hello","world");
        h.put(1,3);
        System.out.println(h);

        List<Integer> n = new ArrayList<>();
        n.add(10);
        n.add(20);
        n.add(30);
        System.out.println(n);

        Pair.doSomething("Bhanu",5.9);
        p.doSomethingElse("Bhanu");
    }
}

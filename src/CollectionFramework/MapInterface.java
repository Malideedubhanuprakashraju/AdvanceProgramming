package CollectionFramework;

import java.util.*;


public class MapInterface
{
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("ten", 10);
        System.out.println(map);

        Map<Integer,Integer> lh=new LinkedHashMap<>();
        lh.put(1,1);
        lh.put(2,2);
        lh.put(3,3);
        lh.put(4,4);
        lh.put(5,5);
        lh.put(6,6);
        lh.put(7,7);
        lh.put(8,8);
        lh.put(9,9);
        lh.put(10,10);
        lh.put(11,11);
        lh.put(12,12);
        lh.put(13,13);
        lh.put(14,14);
        lh.put(15,15);
        System.out.println(lh);
        Map<Integer,String> ht=new Hashtable<>();
        ht.put(1,"one");
        ht.put(2,"two");
        ht.put(3,"three");
        ht.put(4,"four");
        ht.put(5,"five");
        ht.put(6,"six");
        System.out.println(ht);

        SortedMap<Integer,String> sm=new TreeMap<>();
        sm.put(1,"one");
        sm.put(2,"two");
        sm.put(3,"three");
        sm.put(4,"four");
        sm.put(5,"five");
        sm.put(6,"six");
        System.out.println(sm);

    }
}

package Lambdas_Streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams
{
    public static void main(String[] args)
    {
        List<Integer> numbers= List.of(10,2,3,4,5,6,7,8,9,10);
       // numbers.forEach(System.out::println);

       // Streams -Part-1
//       Stream<Integer> s=numbers.stream();
//       List<Integer> odd=s.filter((x)->x%2==1).toList();
//       System.out.println(odd);
//       Stream<Integer> s1=numbers.stream();
//       List<Integer> even=s1.filter((y)->y%2==0).toList();
//       System.out.println(even);
//
//       Stream<Integer> s2=numbers.stream();
//       List<Integer> mapp=s2.filter((x)->x%2==1).map((y)->y*y).toList();
//       System.out.println(mapp);
//
//       //Stream<Integer> s3=numbers.stream();
//       Optional<Integer> ans=numbers.stream().filter((x)->x%2==1).map((y)->y*y).findFirst();
//       System.out.println(ans);
//       if(ans.isPresent())
//       {
//           System.out.println(ans.get());
//       }
        // Part-2
        List<String> names= List.of("Bhanu","Prakash","Raju","Malideedu");
        Stream<String> nameStream=names.stream();
       // nameStream.forEach(System.out::println);

        // Intermediate Operations - Lazy
        // eg : filter(),map(),sorted(),distinct(),limit(),skip()
        // Filtering and Mapping Example:
        // Filtering fruits starting with 'A' and converting to uppercase :


        List<String> result=nameStream.filter(fruit->fruit.startsWith("B")).map(String::toLowerCase).collect(Collectors.toList());
        System.out.println(result);


        // Even Numbers
        Stream<Integer> n=numbers.stream();
        List<Integer> result1=n.filter((x)->x%2==0).toList();
        System.out.println(result1);








    }
}

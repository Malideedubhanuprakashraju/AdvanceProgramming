//////package Lambdas_Streams;
//////
//////public class Client
//////{
//////    public static void main(String[] args)
//////    {
//////        //We can't create an object of Interface, because interfaces are incomplete.
//////        // 1. Create a class that implements the interface and provide the method body to all the methods.
//////
//////        // 2. Anonymous Class
//////
//////        Runnable r=new Runnable() {
//////            @Override
//////            public void run() {
//////                System.out.println(Thread.currentThread().getName());
//////            }
//////        };
//////        Thread t=new Thread(r);
//////        t.start();
//////
//////        // 3.Lambdas introduced in Java-8
//////        // () : Method input params
//////        // {} : Method body / implementation.
//////
//////        Runnable r1=()->{
//////            System.out.println(Thread.currentThread().getName());
//////        };
//////        Thread t1=new Thread(r1);
//////        t1.start();
//////
//////        Thread t2=new Thread(()->{
//////            System.out.println(Thread.currentThread().getName());
//////        });
//////        t2.start();
//////
//////
//////
//////    }
//////}
////
////package Streams;
////
////import java.util.stream.Collector;
////import java.util.stream.Collectors;
////import java.util.stream.Stream;
////import java.util.*;
////import java.util.function.BinaryOperator;
////
////public class Client
////{
////
////    public static void main(String[] args)
////    {
//////		List<Integer> n=Arrays.asList(1,2,3,4,5,6,7,8,9);
//////		System.out.println(n);
//////
//////		// Normal Approach
//////		List<Integer> l1=new ArrayList<>();
//////		for(Integer n1:n)
//////		{
//////			if(n1%2==1)
//////				l1.add(n1);
//////		}
//////		System.out.println(l1);
//////		// Streams
//////		Stream<Integer> s=n.stream();
//////		List<Integer> oddn=s.filter((x)->x%2==1).toList();
//////		System.out.println(oddn);
//////		Stream<Integer> evens=n.stream();
//////		List<Integer> even=evens.filter((x)->x%2==0).toList();
//////		System.out.println(even);
//////
//////		//Print Squres Of a Given Number
//////		Stream<Integer> sq=n.stream();
//////		List<Integer> ns=sq.filter((x)->x%2==0).map((x)->x*x*x).toList()
//////;
//////		System.out.println(ns);
//////
//////
//////		Stream<Integer> sq1=n.stream();
//////		List<Integer> ns1=sq1.map((x)->x*x).toList();
//////		System.out.println(ns1);
//////
//////		// Student Object
//////		//Student obj=new Student("Bhanu",1,200);
//////		List<Student> st=Arrays.asList(new Student("Bhanu",1,65),
//////									   new Student("Raju",2,80),
//////									   new Student("Mali",3,90));
//////		System.out.println(st.stream().filter((student)->student.marks>80).toList());
//////
//////		System.out.println(st.stream().map(student->student.name).toList());
//////		System.out.println(st.stream().map(student->student.id).toList());
//////
//////		List<String> l=Arrays.asList("Bhanugg","Prakash","Raju","Mali","a","b","c");
//////		// Count The No of Words Greter Than >5
//////		System.out.println(l.stream().filter(len-> len.length()>5).count());
//////
//////		List<String> up=l.stream().map(String::toLowerCase).toList();
//////		System.out.println(up);
////
////        List<String> names=List.of("Bhanu","Apple","Boll","Cat");
////
////        List<String> ans=names.stream().filter(fruit->fruit.startsWith("B")).map(String::toUpperCase).collect(Collectors.toList());
////        System.out.println(ans);
////
////        List<Integer> num=List.of(12,54,56,76,86);
////        Stream<Integer> s1=num.stream();
////
//////		List<Integer> ans1=s1.filter(n->n%2==0).toList();
//////		System.out.println(ans1);
////
//////		List<Integer> squres=s1.map((x)->x-x+1).toList();
//////		System.out.println(squres);
////
//////		Stream<Integer> sortt=s1.sorted();
//////		System.out.println(sortt);
////        List<Integer> sl=Stream.of(5,1,8,3,2).sorted().collect(Collectors.toList());
////        System.out.println(sl);
////
////// Alternative Approach
////        Stream<Integer> sll = Stream.of(5, 1, 8, 3, 2);
////
////        // Sort the stream
////        Stream<Integer> sortedStream = sll.sorted();
////
////        // Print the sorted values
////        sortedStream.forEach(System.out::println);
////
////        //Iterating
////        Stream<Integer> st=Stream.of(1,2,3,4,5);
////        st.forEach(n->System.out.println(n));
////
////        //reduce()
////        Stream<Integer> sr=Stream.of(1,2,3,4,5);
////        int sum=sr.reduce(0,(n1,n2)->n1+n2);
////        System.out.println(sum);
////
////        BinaryOperator<Integer> add = (number1, number2) -> number1 + number2;
////        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
////        int sum1 = stream.reduce(0, add);
////        System.out.println(sum1);
////
////        List<Integer> ne=List.of(6,4,5,3,4,6,7,9);
////        System.out.println(ne);
////        Stream<Integer> sss=ne.stream();
////
////        List<Integer> ress=sss.filter((x)->x%2==1).collect(Collectors.toList());
////        System.out.println(ress);
////
////        // Streams into a Collection
////        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
////        List<Integer> numbers = stream1.collect(Collectors.toList());
////        System.out.println(numbers);
////
////        //You can now use the toList() method on streams to collect the elements in a stream into a list.
////        Stream<Integer> streams = Stream.of(1, 2, 3, 4, 5);
////        List<Integer> numbers1 = streams.toList();
////        System.out.println(numbers1);
//// For example, let's find the first even number in a stream of numbers:
//Stream<Integer> strr=Stream.of(8,2,4,65,82);
//Optional<Integer> firstEvenNo=strr.filter(n->n%2==0).map(x->x*x).findFirst();
//		System.out.println(firstEvenNo.get());
//
////Example1: Collecting into a List
//List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango");
//
//// Collecting filtered fruits into a new list
//List<String> result = fruits.stream()
//        .filter(fruit -> fruit.length() > 5)
//        .toList();// .collect(Collectors.toList());
//
//		System.out.println(result); // Output: [Banana, Orange]
//
//// Example2: Counting Elements
//
//long count=fruits.stream().filter(fruit->fruit.length()>5).count();
//		System.out.println("Number of fruits: " + count);
//
//// Example3: Joining Strings
//List<String> words = Arrays.asList("Hello", " ", "Stream", " ", "API");
//
//// Concatenating strings
//String result1 = words.stream()
//        .collect(Collectors.joining());
//
//		System.out.println("Concatenated String: " + result1); // Output: Concatenated String: Hello
//
//
//
//	}
//
//
//            }
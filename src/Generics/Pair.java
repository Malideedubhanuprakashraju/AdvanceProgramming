package Generics;

import Class_3.C;

public class Pair<A,B>
{
//    Object first;
//    Object second;

    A first;
    B second;



    public void setFirst(A first)
    {
        this.first = first;
    }
    public A getFirst()
    {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public void setSecond(B second)
    {
        this.second = second;
    }
    public static<A,B> void doSomething(A a,B b)
    {
        System.out.println(a+" "+b);
    }
    public void doSomethingElse(B a)
    {
        System.out.println(a);
    }
}

//Task 38 : Declare a class name ‘A’ with some methods and one parameterised constructor.
// Derive another class ‘B’ from
// ‘class A’. In class B have some methods and parameterized constructor.
// Derive Class C from class B Demonstrate how base class parameterised constructor gets call from child
// class constructor in multilevel inheritance.....//
import java.util.*;
class Apple
{
    int a;
    public Apple(int a)
    {
        System.out.println("from class Apple, a = " + a);
    }
}
class Banana extends Apple
{
    int b;
    public Banana(int a,int b)
    {
        super(a);
        System.out.println("from class Banana, b = "+b);

    }

}
class Carrot extends Banana
{
    int c;
    public Carrot(int a,int b,int c)
    {
        super(a,b);
        System.out.println("from class Carrot , c = "+c);

    }
    public void sum(int a,int b,int c){
        System.out.println("\n");
        System.out.println("square of a= "+a*a);
        System.out.println("square of b = "+b*b);
        System.out.println("square of c = "+c*c);

    }
}
public class Task38
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter three numbers to find squares : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Carrot add = new Carrot(a,b,c);
        add.sum(a,b,c);

    }
}
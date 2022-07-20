 // 14 - Find factor of a given number//
import java.util.Scanner;
public class Task14
{
    public static void main(String[] args)
    {
        int n;
        System.out.println("welcome to the terminal");
        System.out.println("enter the number :");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        System.out.println("The factors are :");
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i+"");

            }
        }

    }
}

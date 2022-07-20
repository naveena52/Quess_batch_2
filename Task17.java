// 17 java program for finding sum of digits of a given number//
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args)
    {
        int n,r,sum=0;
        System.out.println("Enter any digit :");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        System.out.println("The sum of the given digits is :");
        while(n>0)
        {
            r=n%10;
            sum=sum + r;
            n=n/10;

        }
        System.out.println(sum);

    }
}
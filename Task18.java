// java program for reverse the given number//
import java.util.Scanner;

public class Task18{
    public static void main(String[] args)
    {
        int n,r;
        System.out.println("Please enter  any number:");
        Scanner ref=new Scanner(System.in);
        n=ref.nextInt();
        System.out.println("The reverse order of the given number is :");
        while(n>0)
        {
            r=n%10;
            System.out.println("Reverse order"+r);
            n=n/10;

        }
    }
}
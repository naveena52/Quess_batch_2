// 12- Java program for showing PrimeNumber Between intervals//

import java.util.Scanner;
public class Task12
{
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter lower interval :");
        int low = reader.nextInt();
        System.out.println("Enter the upper interval :");
        int  upper = reader.nextInt();
        System.out.println("the prime numbers are :");
        while(low<=upper)
        {
            boolean check=true;
            for(int i=2;i<=low/2;i++)
            {
                if(low%i==0)
                {
                    check=false;
                    break;
                }
            }
            if(check)
            {
                System.out.println(low + " ");
            }
            ++low;
        }
    }
}
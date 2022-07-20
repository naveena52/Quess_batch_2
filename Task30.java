// 30 java program for to find the sum and avg of array elements//
import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        float a[],sum= 0,avg ,num;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of array elements :");
        num = in.nextInt();
        a = new float [(int) num];
        System.out.println("enter the array elements :");
        for (int i =0;i<num;i++)
        {
            System.out.println(" enter the "+(i+1)+" element :");
            a[i]=in.nextInt();



        }
        for(int i =0;i<num;i++)
        {
            sum=sum+a[i];
        }
        avg = sum/num;
        System.out.println("sum of array elements is :"+sum);
        System.out.println("Average of array elements is : "+avg);

    }
}
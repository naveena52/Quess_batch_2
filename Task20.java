// 20 - java program for displaying the armstrong numbers between the intervals//
import java.util.Scanner;

public class Task20
{
    public static void main(String[] args) {
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lower range :");
        num1 = sc.nextInt();
        System.out.println("enter the upper range");
        num2  = sc.nextInt();
        for (int i = num1;i<num2;i++)
        {
            int check,rem,sum=0;
            check =i;
            while (check != 0)
            {
                rem = check %10;
                sum = sum+(rem*rem*rem);
                check =check/10;


            }
            if(sum ==i){
                System.out.println(""+i+" is an armstrong number .");
            }
        }
    }

}



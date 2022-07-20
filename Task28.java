// 28 - java program to find the sum of 1 to n numbers using recursion//
import java.util.Scanner;
public class Task28 {
    public static void main(String[] args)

    {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter the number :");
        int number = reader.nextInt();
        int sum = sum(number);
        System.out.println("The sum of numbers up to " + number + " is " + sum);

    }
    public static int sum(int number){
        if(number == 0){
            return number;
        }
        else {
            return number + sum(number-1);

        }
    }
}

// 27 - java program to find the table of given number using recursion //
import java.util.Scanner;

public class Task27
{
    static void MultiplicationTable(int num, int i) {
        System.out.print("\n");
        System.out.print(num + " X " + i + " = " + num * i);
        if (i < 10)
            MultiplicationTable(num, i + 1);
    }

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int num;
        System.out.print("Enter a number:");
        num = cs.nextInt();
        System.out.print("Multiplication Table of " + num + " is:");
        MultiplicationTable(num, 1);
        cs.close();
    }
}
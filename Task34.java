// 34 - java program for to input n number of elements in an array and separate them into even and odd two
// different aTask 34 :      JAVA program to input n number of elements in an array and separate them into even and odd two different array
//Task 34 :JAVA program to input n number of elements in an array and separate them into even and
// odd two different arrays.//
import java.util.Scanner;
public class Task34 {
    public static void main(String[] args) {


        int num, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the no. of elements in an array : ");
        num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("enter all the elements :");
        for (i = 0; i < num; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("even numbers are :");
        for (i = 0; i < num; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);

            }
        }
        System.out.println("Odd numbers are :");
        for (i = 0; i < num; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}


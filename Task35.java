// 35 - write a java program to find maximum and minimum number from given array by parsing array to the
// function//
import java.util.Arrays;
import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the element :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements :");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        minmax(arr);
        sc.close();
    }

    private static void minmax(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Minimum number in an array is ==> "+arr[0]);
        System.out.println("Maximum number in an array is ==>"+arr[arr.length-1]);

    }
}

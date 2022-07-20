// 32 - java program to count total number of unique elements in an array//
import java.util.Scanner;
public class Task32
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter the length of an array :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.printf("enter the elements of an array :");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();

        }
        int count = 0;
        boolean rs[] = new boolean[n];
        for (int i = 0; i < n; i++)
        {
            if (rs[i] == false)
            {
                for (int j = i + 1; j < n; j++)
                {
                    if (arr[i] == arr[j])
                    {
                        rs[j] = true;
                    }
                }
                count++;
                rs[i] = true;
            }

        }
        System.out.println("Elements in an array are :");
        for (int i=0;i<n;i++){
            System.out.println(arr[i]+" ");

        }
        System.out.println();
        System.out.println("Unique elements in an array "+count);
        sc.close();
    }
}

import java.util.*;
import java.util.Scanner;
public class Task36
{
    public int[] insert(int[] arr, int n, int pos, int val)
    {
        int[] newarr;
        if (pos > n)
        {
            newarr = new int[pos + 1];
            for (int i = 0; i < pos + 1; i++)
            {
                if (i < n)
                    newarr[i] = arr[i];
                if (i == pos)
                {
                    newarr[pos] = val;
                }
            }
        }
        else
        {
            newarr = new int[n + 1];
            for (int i = 0; i <= n; i++)
            {
                if (i < pos)
                    newarr[i] = arr[i];
                else if (i == pos)
                {
                    newarr[i] = val;
                }
                else
                {
                    newarr[i] = arr[i - 1];
                }
            }
        }
        return newarr;
    }

    public static int[] removeTheElement(int[] arr, int index)
    {
        if (arr == null || index < 0 || index >= arr.length)
        {
            System.out.println("Deleting is not possible ");
            return arr;
        }
        int[] anotherArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++)
        {
            if (i == index)
            {
                continue;
            }
            anotherArray[k++] = arr[i];

        }

        return anotherArray;
    }


    public int Search(int[] num, int k)
    {
        for (int i = 0; i < num.length; i++)
        {
            if (num[i] == k)
            {
                return i;
            }
        }
        return -1;
    }

    public void Display(int[] arr)
    {
        System.out.print("[");

        for (int val : arr)
        {
            System.out.print(val + " ");
        }

        System.out.println("]");
    }

    public void Input(int[] arr, int n) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

    }

    public void sum(int[] arr) {
        int s = 0;
        for (int j : arr) {
            s = s + j;
        }
        System.out.println(s);
    }

    static void average(int[] arr) {
        float s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        System.out.println(s / arr.length);
    }

    static void reverse(int[] a) {
        int[] b = new int[a.length];
        int j = a.length;
        for (int i = 0; i < a.length; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        System.out.println("Reversed array is: [");
        for (int k = 0; k < a.length; k++) {
            System.out.print(b[k] + " ");
        }
        System.out.print("]");

    }

    public static int findSecLar(int[] num)
    {
        Arrays.sort(num);
        int n = num.length;
        int res = num[n - 1];
        for (int i = n - 2; i >= 0; i--)
        {
            if (res > num[i])
            {
                res = num[i];
                break;
            }
        }
        return res;
    }


    static void power(int[] a, float n) {
        double arr[] = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = Math.pow(a[i], n);
        }
        System.out.println("power of array : [");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(arr[i] + " ");
            ;
        }
        System.out.print("]");
    }

    static void div(int[] a, float n) {
        float arr[] = new float[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = (float) (a[i] / n);
        }
        System.out.print("After dividing with " + n + " array : [ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(arr[i] + " ");
            ;
        }
        System.out.print("]");
    }

    static void multi(int[] a, int n) {
        int arr[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = (a[i] * n);
        }
        System.out.print("After multiplication with " + n + " array : [ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(arr[i] + " ");
            ;
        }
        System.out.print("]");
    }

    static void add(int[] a, int n) {
        int arr[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = (a[i] + n);
        }
        System.out.print("After addition with " + n + " array : [ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(arr[i] + " ");
            ;
        }
        System.out.print("]");
    }

    public int max(int arr[])
    {
        int maxnum = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > maxnum)
            {
                maxnum = arr[i];
            }
        }
        return maxnum;

    }

    public int min(int arr[])
    {
        int minnum = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < minnum)
            {
                minnum = arr[i];
            }
        }
        return minnum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Task36 obj = new Task36();
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements into the array :");
        obj.Input(arr, n);
        while (true)
        {
            System.out.println("\n");
            System.out.println(".......................................................");
            System.out.println("""
                    Enter 1 --> For Element  SEARCH .
                    Enter 2 --> For Element  INSERTION 
                    Enter 3 --> For Element  DELETE.
                    Enter 4 --> For Element  DISPLAY .
                    Enter 5 --> For Element  SUM OF ARRAY  .
                    Enter 6 --> For Element  AVERAGE OF ARRAY .
                    Enter 7 --> For Element  SORTING DESCENDING OF ARRAY .
                    Enter 8 --> For SECOND LARGEST number in Array.
                    Enter 9 --> For small and Large Elements in an array.
                         Press - 1 For Dispalying small element in an array.
                         Press - 2 For Displaying Large Element  in an array.
                    Enter 10 --> For EXIT . """);
            System.out.println("........................................................");

            System.out.println("Enter  your choice");
            int ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                {
                    System.out.println("Enter the number to search: ");
                    int p = sc.nextInt();
                    int search = obj.Search(arr, p);
                    if (search == -1)
                    {
                        System.out.println(" sorry ---> element is not found ");
                    }
                    else
                    {
                        System.out.println("element " + p + " found at " + (search + 1) + " position ");
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("This is the current array element ");
                    obj.Display(arr);
                    System.out.println("length of array is " + arr.length);
                    System.out.println("enter position where do you want to insert : ");
                    int index1 = sc.nextInt();
                    n = arr.length;
                    if (index1 < 0 || index1 > n)
                    {
                        System.out.println("Sorry --> Choose valid position : insertion is not possible for given position ,because index is  out off range");
                    }
                    else
                    {
                        System.out.println("Enter the value");
                        int value = sc.nextInt();
                        arr = obj.insert(arr, n, index1-1, value);

                        System.out.println("\nArray with " + value + " inserted at position " + (index1 - 1) +
                                ":\n" + Arrays.toString(arr));
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the index position ");
                    int p = sc.nextInt();
                    arr = removeTheElement(arr, p);
                    System.out.println("Orginal array elements ");
                    obj.Display(arr);
                    System.out.println("After deletion array is : ");
                    System.out.println(Arrays.toString(arr));
                    break;
                }
                case 4:
                {
                    System.out.println("Current Array elements : ");
                    obj.Display(arr);
                    break;

                }
                case 5:
                    if (arr.length > 1)
                    {
                        System.out.println(" sum of array elements : ");
                        obj.sum(arr);
                    }
                    else
                    {
                        System.out.println(" Current array elements :");
                        obj.Display(arr);
                        System.out.println("sum of the array elements :");
                    }
                    break;
                case 6:
                    if (arr.length > 1)
                    {
                        System.out.println("Current array elements");
                        obj.Display(arr);
                        System.out.println("Average of array is :");
                        average(arr);
                    }
                    else
                    {
                        System.out.println("Average calculation not possible for Given(empty Array)");
                    }
                    break;
                case 7:
                    if (arr.length > 1)
                    {
                        reverse(arr);
                    }
                    else
                    {
                        System.out.println("Reverse of array is  not possible for given array length");
                    }
                    break;
                case 8:
                    System.out.println("Current array elements");
                    obj.Display(arr);
                    System.out.println("Second largest number in array " + findSecLar(arr));
                    break;
                case 9:
                    System.out.println(" Press-1 For small number");
                    System.out.println(" Press-2 for large number ");
                    int c = sc.nextInt();
                    if (c == 1)
                    {
                        System.out.println("current arrray elements ");
                        obj.Display(arr);
                        System.out.println("small number in Array " + obj.min(arr));
                    }
                    else if (c == 2)
                    {
                        System.out.println("current array elements ");
                        obj.Display(arr);
                        System.out.println("large number in Array " + obj.max(arr));
                    }
                    else
                    {
                        System.out.println("!! Wrong choice,choose correct option !!");
                    }
                    break;
                case 10:

                    System.exit(0);
                    break;


                default:
                    System.out.println("!! Wrong input ,Please choose any one of above choice only !!  ");
            }
        }
    }
}
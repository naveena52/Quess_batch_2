// 31 - java program for sorting the names//
import java.util.Scanner;
public class Task31
{
    public static void main(String[] args)
    {
        int number_of_strings;
        String temp;
        Scanner input = new Scanner(System.in);
        System.out.println("how many names you need to sort ?:");
        number_of_strings = input.nextInt();
        String str[]=new String[number_of_strings];
        Scanner StringInput = new Scanner(System.in);
        System.out.println("enter the names :");
        for (int i=0;i<number_of_strings;i++)
        {
            str[i]=StringInput.nextLine();

        }
        for (int i=0;i<number_of_strings;i++)
        {
            for (int j = i+1;j < number_of_strings; j++)
            {
            if(str[i].compareTo(str[j])>0)
            {
                temp = str[i];
                str[i]=str[j];
                str[j]=temp;
            }

            }
        }
        System.out.println("Strings in sorted order :");
        for (int i = 0; i <= number_of_strings-1;i++)
        {
            System.out.printf(i+1+ "." +str[i]);
        }
    }
}

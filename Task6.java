// 1 - java program for String demo//
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        String inp ="";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string :");
        inp=s.nextLine();
        String res="";
        for(int i=0;i<inp.length();i++)
        {
            char c=inp.charAt(i);
            int b=Integer.parseInt(String.valueOf(c));
            if(b<5)
                res+='0';
            else
                res+='1';
        }
        System.out.println(res);
    }
}

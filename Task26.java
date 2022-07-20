// 26 - calculate total electricity bill//
import java.util.Scanner;

public class Task26 {
    public static void main(String[] args)
    {
        int unit;
        double amount,total_amt,sur_charge;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units :");
        unit = sc.nextInt();
        if(unit<=50)
        {
            amount = unit*0.50;

        }
        else if (unit<=150)
        {
            amount = 25 + ((unit-50)*0.75);


        } else if (unit<=250) {
            amount = 100 +((unit-150)*1.20);

        }
        else {
            amount = 220 +((unit-250)*1.50);
        }
        sur_charge=amount*0.20;
        total_amt=amount+sur_charge;
        System.out.println("Electricity bill = "+total_amt);
    }

}
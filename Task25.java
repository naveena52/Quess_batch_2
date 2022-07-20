//java program for bonus calculation//
import java.util.Scanner;

public class Task25
{
    public static void main(String[] args)
    {
        double basic_sal,HRA,TA,PF,DA,gross_sal,bonus;
        System.out.println("Enter your Basic Salary :");
        Scanner sc = new Scanner(System.in);
        basic_sal =sc.nextDouble();
        HRA = basic_sal*0.20;
        PF = basic_sal*0.12;
        DA = basic_sal*0.15;
        TA = basic_sal*0.10;
        System.out.println( "House rent Alowance is : "+HRA);
        System.out.println("Provident Fund is : "+PF);
        System.out.println("Dearness Allowance is : "+DA);
        System.out.println("Travelling Allowance is : "+TA);
        if(basic_sal>=20000)
        {
            bonus = basic_sal*0.1;

        }
        else {
            bonus = basic_sal*0.2;

        }
        gross_sal = (basic_sal+DA+TA+HRA+bonus)-PF;
        System.out.println("Gross Salary of an Employee is: "+gross_sal);
    }

}

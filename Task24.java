// 24 -java program for company insurance policy//
import java.util.*;

public class Task24 {
    public static void main(String[] args) {
        char mar_status;
        Scanner sc = new Scanner(System.in);
        System.out.println("Are u married? (Y/N): ");
        mar_status = sc.next().charAt(0);
        if (mar_status == 'Y') {
            System.out.println("Heartly congrats  you got insurance ");
        } else {
            System.out.println("Enter the gender? (M/F):");
            char gender = sc.next().charAt(0);
            System.out.println("Enter your age :");
            int age = sc.nextInt();
            if (gender == 'M' && age > 30 || gender == 'F' && age > 25) {
                System.out.println("Congrats you got insurance");
            } else {

                System.out.println("Sorry to say This --> you can not be insured");
            }
        }
    }
}

package DSAjavatraning;

import java.util.*;

public class Eligibleforvoting {
    public static void main(String[] agrs) {

        System.out.println("Enter age..!");
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        if (n >= 18) {
            System.out.println("Eligible for vote");
            System.out.println("thanks");

        } else {
            System.out.println("you are not eligible for vote");
            System.out.println("you are wait few year for eligible and thank you");
        }
    }

}

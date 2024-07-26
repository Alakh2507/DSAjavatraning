package DSAjavatraning;

import java.util.*;

public class currencyconvertor {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.println("Welcome to the Currency Converter!");
        System.out.println(" 1. convert INR to USA");
        System.out.println("2.Convert USA to INR");
        System.out.println("3.Quit");
        System.out.println("Enter your choice :");
        int choice = r.nextInt();
        switch (choice) {
            case 1:
                ConvertinrTousd();
                break;
            case 2:
                ConvertUsdToUnr();
            case 3:
                r.close();
            default:
                System.out.println("Invalid choice .Please try again .");
        }
    }

    private static void ConvertinrTousd() {
        Scanner p = new Scanner(System.in);
        System.out.print("Enter your amout in USA:" + " ");
        double at = p.nextInt();
        double inrAmount = at * 83.5;
        System.out.println(inrAmount + "USA is equivalent to" + inrAmount + "INR");

    }

    private static void ConvertUsdToUnr() {
        Scanner p = new Scanner(System.in);
        System.out.print("Enter your amout in USA:" + " ");
        double at = p.nextInt();
        double usdAmount = at / 83.5;
        System.out.println(usdAmount + "INR is equivalent to" + usdAmount + "USD");

    }
}

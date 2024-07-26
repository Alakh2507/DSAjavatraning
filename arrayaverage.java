package DSAjavatraning;

public class arrayaverage {
    public static void main(String args[]) {
        int number[] = { 1, 2, 3, 4, 5, 6, 7, 7 };
        int sum = 0;
        for (int i = 1; i < number.length; i++) {
            sum = sum + number[i];

        }
        System.out.println(sum);

    }
}

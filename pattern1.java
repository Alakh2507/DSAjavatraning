package DSAjavatraning;

public class pattern1 {
    public static void forloop() {
        for (int i = 1; i <= 8; i++)// row
        {
            for (int j = 1; j <= i; j++)// column
            {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void whileloop() {
        int i = 1;
        int j = 1;
        while (i <= 5)// row
        {
            while (j <= i)// column
            {
                System.out.print("*");
                j++;

            }
            i++;
            System.out.println();
            j = 1;
        }

    }

    public static void dowhileloop() {
        int i = 1;
        int j = 1;
        do {
            i++;
            do {
                j++;
                System.out.print("*");

            } while (j <= i);
            System.out.println();
            j = 1;
        } while (i <= 5);
    }

    public static void forloopp() {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }

    }

    public static void continuesta() {
        for (int i = 2; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }

    public static void main(String args[]) {
        // forloop();
        // System.out.println("whileloop");
        // whileloop();
        // System.out.println("dowhileloop");
        // dowhileloop();
        // forloopp();
        continuesta();

    }
}

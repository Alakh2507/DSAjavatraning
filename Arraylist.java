package DSAjavatraning;

public class Arraylist {
    /*
     * public static void arrayl() {
     * int mark[] = new int[6];
     * for (int i = 1; i <= 10; i++) {
     * 
     * System.out.println(mark[i]);
     * }
     * 
     * }
     */

    public static void main(String[] args) {

        String name[] = { "lakh", "niranjan", "son" };

        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
       //for each loop
        for (String i : name) {
            System.out.println(i);
        }

    }
}

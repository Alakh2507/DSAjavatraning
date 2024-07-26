package DSAjavatraning;

import java.util.*;

public class generateOTP {

    public static void main(String[] args) {
        // to generate 6 digit otp random class used
        Random r = new Random();
        int myOtp = r.nextInt(1000000);// 6 digit
        System.out.println("Your OTP is :" + myOtp + " " + "don't share to anyone");

    }
}

import java.util.*;

public class otpGenerator {
    public static void main(String[] args) {
        String[] otpArray = new String[10];

        for (int i = 0; i < 10; i++) {
            otpArray[i] = otpGenerator();
            System.out.println("OTP " + (i + 1) + ": " + otpArray[i]);
        }

        if (UniqueOtp(otpArray)) {
            System.out.println(" All OTPs are unique.");
        } else {
            System.out.println("OTPs are not unique.");
        }
    }

    public static String otpGenerator() {
        int otp = (int) (Math.random() * 900000) + 100000;
        return String.valueOf(otp);
    }


    public static boolean UniqueOtp(String[] otp) {
        for (int i = 0; i < otp.length; i++) {
            for (int j = i + 1; j < otp.length; j++) {
                if (otp[i].equals(otp[j])) {
                    return false;
                }
            }
        }
        return true;
    }
}

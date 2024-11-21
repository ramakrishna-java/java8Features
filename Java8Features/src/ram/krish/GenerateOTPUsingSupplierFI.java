package ram.krish;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;

public class GenerateOTPUsingSupplierFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<String> otp = ()->{
			String otps= "";
			for(int i =0;i<=6;i++) {
				double random = Math.random();
				double rand =random*10;
				int randomm=(int)rand;
				otps=otps+randomm;
			}
			
			return otps;
		};
		
		System.out.println("OTP is ::"+otp.get());
		System.out.println("OTP is ::"+otp.get());

		
		
        // Define OTP length (can be adjusted)
        int otpLength = 6;

        // Supplier to generate OTP
        Supplier<String> otpNewSupp = () -> {
            StringBuilder otpBuilder = new StringBuilder();
            for (int i = 0; i < otpLength; i++) {
                int randomDigit = ThreadLocalRandom.current().nextInt(0, 10); // Generates a random number between 0 and 9
                otpBuilder.append(randomDigit);
            }
            return otpBuilder.toString();
        };

        // Generate and print OTP
        System.out.println("OTP is-----------> " + otpNewSupp.get());
	}

}

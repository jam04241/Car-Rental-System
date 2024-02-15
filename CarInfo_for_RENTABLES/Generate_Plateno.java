package CarInfo_for_RENTABLES;

import java.util.Random;

public class Generate_Plateno {
    
        public static void main(String[] args) {	
		Random random = new Random();
		int num;
		for(int i = 0; i < 12; i++) {
			
			num = random.nextInt(9999);
			
			System.out.println(generateRandomString(3)+num);
			}
	}
	public static String generateRandomString(int length) {
	        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	        StringBuilder sb = new StringBuilder(length);
	        Random random = new Random();
	        for (int i = 0; i < length; i++) {
	            int randomIndex = random.nextInt(alphabet.length());
	            sb.append(alphabet.charAt(randomIndex));
	        }	    
	    return sb.toString();
	
        }
}
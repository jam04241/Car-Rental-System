package CarInfo_for_RENTABLES;

import java.util.Random;

public class Generate_ContactNo {
    
        public static void main(String[] args) {	
		Random random = new Random();
		int num1;
                int num2;
                int num3;
                int num4; 
                
		for(int i = 0; i < 1; i++) {
			
			num1 = random.nextInt(99);
                        num2 = random.nextInt(999);
                        num3 = random.nextInt(99999);
                        num4 = random.nextInt(999999999);
			System.out.println("+639" + num1 + "-" + num2 + "-" + num3);
                        System.out.println("Telephone: "+ "082"+ "-"+ num4);                      
                }
}
}
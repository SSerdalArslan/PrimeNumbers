package primeNumbers;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int[] threeDigits = new int[100];
		int index = 0;
		boolean control = false;

		for (int i = 500; i < 600; i++) {
			index = i - 500;
			threeDigits[index] = i;
		}
		for (int i = 0; i < threeDigits.length; i++) {
			for (int x = 2; x < threeDigits[i]; x++) {
				if (threeDigits[i] % x == 0) {
					control = false;
					break;
		        } 
				else {
					control = true;
		        }

		        }
		        if (control) {
		        	System.out.println(threeDigits[i]);
		        }
		        }
}}

	



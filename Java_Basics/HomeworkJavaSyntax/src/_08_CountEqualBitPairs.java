import java.util.Scanner;


public class _08_CountEqualBitPairs {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input number = ");
		int number = input.nextInt();
		
		int countPair = 0;
		int mask = 1;
		while (number > 0) {
			
			int bit1 = number & mask; 
			int bit2 = (number>>1) & mask;
			
			if (bit1 == bit2) {
				countPair++;
			}
			number = number >> 1;
		}
		System.out.println("Pair 00 or 11 is equal : " + countPair);
	}

}


import java.util.Scanner;

public class _01_SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input start number:");
		int start = input.nextInt();
		System.out.print("Input end number :");
		int end = input.nextInt();
		
		while (!(start>=0 && start<=end && end<=999)) {
			System.err.println("Invalid input! [0<=start<=end<=999]");
			System.out.print("Input start number:");
			start = input.nextInt();
			System.out.print("Input end number :");
			end = input.nextInt();
		}
		System.out.print("Output : ");
		for (int i = start; i <= end; i++) {
			
			int firstDigit = i % 10;
			int secondDigit = ( i / 10 ) % 10;
			int thirdDigit = ( i / 100 ) % 10;
			if ( i < 10 ) {
				System.out.print( i + " " );
			}
			else if ( i < 100 && firstDigit == secondDigit) {
				System.out.print( i + " " );
			}
			else if ( i >= 100 && firstDigit == thirdDigit) {
				System.out.print( i + " " );
			}
			
		}

	}

}
import java.util.Scanner;


public class _07_CountOfBitsOne {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input number = ");
		int number = input.nextInt();
		
		System.out.println("Binary number = " + Integer.toBinaryString(number));
		System.out.println("Count of bit 1 is : " + Integer.bitCount(number));
	}
}

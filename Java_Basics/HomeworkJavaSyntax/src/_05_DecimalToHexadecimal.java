import java.util.Scanner;


public class _05_DecimalToHexadecimal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input decima number = ");
		int number = input.nextInt();
		
		System.out.printf("Output : %X%n", number);	
	}
}

import java.util.Scanner;


public class _06_FormattingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a = ");
		int a = input.nextInt();
		while (!(a>=0 && a<=500)) {
			System.out.println("Incorrect input! [0 <= a <= 500]");
			System.out.print("Input a = ");
			a = input.nextInt();
		}
		System.out.print("Input b = ");  
		double b = input.nextDouble();
		System.out.print("Input c = ");
		double c = input.nextDouble();
		
		
		System.out.printf("|%-10X|", a);
		System.out.printf("%010d", Integer.parseInt(Integer.toBinaryString(a)));
		System.out.printf("|%10.2f|", b);
		System.out.printf("%-10.3f|", c);
		
	}

}

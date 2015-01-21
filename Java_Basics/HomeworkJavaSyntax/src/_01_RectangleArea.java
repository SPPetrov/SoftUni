import java.util.Scanner;


public class _01_RectangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input a = ");
		int a = input.nextInt();
		System.out.print("Input b = ");
		int b = input.nextInt();
		int rectangleArea = a*b;
		System.out.println("Output : " + rectangleArea);
	}
}

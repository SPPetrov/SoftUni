
import java.util.Scanner;


public class _04_TheSmallestOf3Numbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(" a = ");
		double a = input.nextDouble();
		System.out.print(" b = ");
		double b = input.nextDouble();
		System.out.print(" c = ");
		double c = input.nextDouble();
		
		double smallest;
		if (a <= b  && a <= c) {
			smallest = a;
		}
		else if(b <= a  &&  b <= c )
		{
			smallest = b;
		}
		else 
		{
			smallest = c;
		}
		
		int tempSmall = (int)smallest;
		
		if (tempSmall == smallest) {
			System.out.println("The smallest : " + tempSmall);
		}
		else
		{
			System.out.println("The smallest : " + smallest);
		}
		
	}

}

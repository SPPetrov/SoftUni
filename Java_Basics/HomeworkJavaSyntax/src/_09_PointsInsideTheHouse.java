import java.util.Scanner;


public class _09_PointsInsideTheHouse {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input X and Y on single line separated by a space");
		
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		boolean inRightRectangle = (x >= 20 && x <= 22.5 && y >= 8.5 && y <= 13.5);
		boolean inSquare = (x >= 12.5 && x <= 17.5 && y >= 8.5 && y <= 13.5 );
		
		//for triangle
		double x1 = 12.5;
		double y1 = 8.5;
		double x2 = 17.5;
		double y2 = 3.5;
		double x3 = 22.5;
		double y3 = 8.5;
		// area of roof ABC	
		double ABC = Math.abs (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
	
		double ABP = Math.abs (x1 * (y2 - y) + x2 * (y - y1) + x * (y1 - y2));
		double APC = Math.abs (x1 * (y - y3) + x * (y3 - y1) + x3 * (y1 - y));
		double PBC = Math.abs (x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2));
		// if point P in triangle, then the sum of area of this new 3 triangle is equal to ABC
		boolean inTriangle = (ABP + APC + PBC == ABC);
		
		if (inRightRectangle || inSquare || inTriangle) {
			System.out.println("The point is : Inside");
		}
		else
		{
			System.out.println("The point is : Outside");
		}
	}

}

import java.util.Scanner;



public class _03_PointsInsideFigure {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input X and Y on single line separated by a space :");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		boolean inSquare = (x >= 12.5 && x <= 17.5 && y >= 8.5 && y<= 13.5 );
		boolean inUpRectangle = (x >= 12.5 && x <= 22.5 && y >= 6 && y <= 8.5);
		boolean inRightRectangle = (x >= 20 && x <= 22.5 && y >= 8.5 && y <= 13.5);
		
		if (inSquare || inUpRectangle || inRightRectangle) {
			System.out.println("Output : Insude");
		}
		else
		{
			System.out.println("Output : Outside");
		}


	}

}

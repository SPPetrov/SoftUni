import java.util.Scanner;



public class _05_AngleUnitConverter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input number n = ");
		int n = Integer.parseInt(input.nextLine());
		
		for (int i = 0; i < n; i++) {
			String[] inputLine = input.nextLine().split(" ");		
			float volue = Float.parseFloat(inputLine[0]);
			
			if (inputLine[1].equals("deg")) {
				double radian = convertDegreesToRadians(volue);
				System.out.printf("%f rad%n", radian);
			}
			else {
				double degree = convertRadiansToDegrees(volue);
				System.out.printf("%f deg%n", degree);
			}
		}
		
	}
	
	static double convertDegreesToRadians(double degrees){
	
		double radians = (degrees * Math.PI) / 180;
		
		return radians;
	}
	
	static double convertRadiansToDegrees(double radians){
		
		double degrees = ( radians * 180 ) / Math.PI;
		
		return degrees;
	}
	
}

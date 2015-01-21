import java.util.Scanner;


public class _02_TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int aX = input.nextInt();
		int aY = input.nextInt();
		int bX = input.nextInt();
		int bY = input.nextInt();
		int cX = input.nextInt();
		int cY = input.nextInt();
		
		double area = 0;
		area += aX * (bY - cY);
		area += bX * (cY - aY);
		area += cX * (aY - bY);
		area = area / 2;
		area = Math.abs(area);
		
		int result = (int)area;
		
		System.out.println(result);	
	}
}

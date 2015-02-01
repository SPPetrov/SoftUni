import java.util.Arrays;
import java.util.Scanner;


public class _01_SortArrayOfNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("n = ");
		int n = Integer.parseInt(input.nextLine());
		System.out.print("Input [n] integer numbers : ");
		int[] nums = new int[n];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = input.nextInt();
		}
		Arrays.sort(nums);
		System.out.print("Input : ");
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _03_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int n = Integer.parseInt(input.nextLine());

		int[][] matrixFirst = new int[n][];
		for (int i = 0; i < matrixFirst.length; i++) {
			String[] inputLine = input.nextLine().trim().split("\\s+");
			int[] nums = new int[inputLine.length];
			for (int j = 0; j < nums.length; j++) {
				nums[j] = Integer.parseInt(inputLine[j]);
			}
			matrixFirst[i] = nums;
		}

		int[][] matrixSecond = new int[n][];
		for (int i = 0; i < matrixSecond.length; i++) {

			String reverse = new StringBuffer(input.nextLine().trim()).reverse()
					.toString();
			String[] reverseLine = reverse.trim().split("\\s+");
			int[] nums = new int[reverseLine.length];
			for (int j = 0; j < nums.length; j++) {
				nums[j] = Integer.parseInt(reverseLine[j]);
			}
			matrixSecond[i] = nums;
		}
		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();

		int maxLenght = matrixFirst[0].length + matrixSecond[0].length;
		boolean isRezul = true;
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> numsList = new ArrayList<Integer>();
			for (int j = 0; j < matrixFirst[i].length; j++) {
				numsList.add(matrixFirst[i][j]);
			}
			for (int j = 0; j < matrixSecond[i].length; j++) {
				numsList.add(matrixSecond[i][j]);
			}
			output.add(numsList);
			if (maxLenght != numsList.size()) {
				isRezul = false;
			}
		}
		int count = 0;
		if (isRezul) {
			for (int i = 0; i < output.size(); i++) {
				System.out.println(output.get(i));
			}
		} else {
			for (int j = 0; j < output.size(); j++) {
				count += output.get(j).size();
			}
			System.out.println("The total number of cells is: " + count);
		}

	}

}

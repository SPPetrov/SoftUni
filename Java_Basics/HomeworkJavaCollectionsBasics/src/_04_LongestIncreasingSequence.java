import java.util.Scanner;


public class _04_LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] numsInStringArray = input.nextLine().trim().split(" ");
		int[] nums = new int[numsInStringArray.length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(numsInStringArray[i]);
		}
		
		int maxIndex = 0;
		int tempIndex = 0;
		int maxCount = 0;
		int count = 1;
		
		for (int i = 0; i < nums.length; i++) {
			if (i==nums.length-1) {
				System.out.print(nums[i]);
				break;
			}
			
			if (nums[i]<nums[i+1]) {
				System.out.print(nums[i]+" ");
				count++;
				tempIndex = i;
				
				if (count > maxCount) {
					maxCount = count;
					maxIndex = tempIndex + 1;
				}
				
			}
			else {
				count = 1;
				System.out.print(nums[i]);
				System.out.println();
			}
		}
		
		//print long sequence
		System.out.println();
		System.out.print("Longest:");
		int startIndex = maxIndex - maxCount + 1;
		int endIndex = startIndex + maxCount;
		
		if (maxIndex == 0) {
			startIndex = 0;
		}
		
		for (int i = startIndex; i < endIndex; i++) {
			System.out.print(nums[i]+" ");
		}
	}

}

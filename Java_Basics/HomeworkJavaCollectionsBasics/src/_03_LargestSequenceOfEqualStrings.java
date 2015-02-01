import java.util.Scanner;


public class _03_LargestSequenceOfEqualStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] inputLine = input.nextLine().trim().split(" ");
		String[] wordsInArray = new String[inputLine.length];
		for (int i = 0; i < wordsInArray.length; i++) {
			wordsInArray[i] = inputLine[i];
		}
		
		int tempIndex = 0;
		int maxIndex = 0;
		int count = 1;
		int maxCount = 0;
		
		for (int i = 0; i < wordsInArray.length-1; i++) {
			
			if (wordsInArray[i].equals(wordsInArray[i+1])) {
				count++;
				tempIndex = i;
				
				if (count > maxCount) {
					maxCount = count;
					maxIndex = tempIndex +1;
				}
				
			}
			else{
				count = 1;
			}
		}
		
		//print sequence
		int startIndex = maxIndex - maxCount + 1;
		int endIndex = startIndex + maxCount;
		
		if (maxIndex == 0) {
			startIndex = 0;
		}
		
		for (int i = startIndex; i < endIndex; i++) {
			System.out.print(wordsInArray[i] + " ");
		}	
	}
}

import java.util.ArrayList;
import java.util.Scanner;

public class BePositive_Broken {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		int countSequences = scn.nextInt();
		scn.nextLine();
		for (int i = 0; i < countSequences; i++) {
			String[] input = scn.nextLine().trim().split(" ");
			ArrayList<Integer> numbers = new ArrayList<>();
			
			for (int j = 0; j < input.length; j++) {
				if (!input[j].equals("") ) {
					// input[i] - must be input[j]
					int num = Integer.parseInt(input[j]);
					numbers.add(num);	
				}							
			}
			
			boolean found = false;
			
			for (int j = 0; j < numbers.size(); j++) {				
				int currentNum = numbers.get(j);
				
				if (currentNum >= 0) {   // change currentNum > 0 to currentNum >= 0	
					// > change because go to next line after all element
					System.out.printf("%d%s", currentNum, j == numbers.size() - 1 ? "\n" : " ");
					found = true;
				} else {
					currentNum += numbers.get(j + 1);					
					
					if (currentNum >= 0) {  // change currentNum > 0 to currentNum >= 0
						// > change because go to next line after all element
						System.out.printf("%d%s", currentNum, j+1 == numbers.size() - 1 ? "\n" : " ");
						found = true;
					}		
					 // add j++; next element must be  j+1
						j++;
						
				}
			}
			
			if (!found) {
				System.out.println("(empty)");
			} 			
		}		
	}
}

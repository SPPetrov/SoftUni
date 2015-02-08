import java.util.Scanner;


public class _02_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String inputLine[] = input.nextLine().trim().split("\\s+");
		double totalSum = 0;
		for (int i = 0; i < inputLine.length; i++) {
			
			String word = inputLine[i];
			String[] wordAsNum = word.split("\\D+");
			
			long num = Integer.parseInt(wordAsNum[1]);
			
			int fistLetterPos = word.toLowerCase().charAt(0)-'a'+1;
			int lastLetterPos = word.toLowerCase().charAt(word.length()-1)-'a'+1;
			
			double tempResult = 0;
			
			if (word.charAt(0)>=65 && word.charAt(0)<=90) { //upper
				tempResult = num / (double)fistLetterPos;
			}else{
				tempResult = num * fistLetterPos;
			}
			

			if (word.charAt(word.length()-1)>=65 && word.charAt(word.length()-1)<=90) { //upper
				tempResult = tempResult - lastLetterPos;
			}else{
				tempResult = tempResult + lastLetterPos;
			}
			
			totalSum += tempResult;
		}
		System.out.printf("%.2f",totalSum);
		
	}


}

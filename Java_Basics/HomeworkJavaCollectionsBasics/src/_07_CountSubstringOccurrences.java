import java.util.Collections;
import java.util.Scanner;


public class _07_CountSubstringOccurrences {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine().toLowerCase();
		String substring = input.nextLine();
		int count = 0;
		for (int i = 0; i < text.length()-substring.length()+1; i++) {
			String currentSub = text.substring(i, i+substring.length());
			
			if (substring.equals(currentSub)) {
				count++;
			}
		}
		System.out.println(count);
	}

}

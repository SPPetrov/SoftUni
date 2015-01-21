import java.util.Scanner;

public class _02_Generate3LetterWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input set of char : ");
		String setOfChar = input.nextLine();
		System.out.print("Output : ");
		for (int i = 0; i < setOfChar.length(); i++) {
			for (int j = 0; j < setOfChar.length(); j++) {
				for (int k = 0; k < setOfChar.length(); k++) {
					
					System.out.print("" +  setOfChar.charAt(i) + setOfChar.charAt(j) + setOfChar.charAt(k) + " ");
					
				}
			}
		}
	}
}


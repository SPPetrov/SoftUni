import java.util.Scanner;

public class _02_SequencesOfEqualStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input line : ");
		String[] words = input.nextLine().split(" ");
		System.out.print("Output : ");
		for (int i = 0; i < words.length; i++) {
			if (i == words.length - 1) {
				System.out.print(words[i]);
				break;
			}
			System.out.print(words[i]);
			if (words[i].equals(words[i + 1])) {
				System.out.print(" ");
			} else {
				System.out.println();
			}
		}
	}
}

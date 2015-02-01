
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _06_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String text = input.nextLine().toLowerCase();
		String word = input.nextLine();

		Pattern regexText = Pattern.compile("[\\w]+");
		Matcher match = regexText.matcher(text);

		int count = 0;

		while (match.find()) {
			if (match.group().equals(word)) { // matcher.group() - next element
				count++;
			}

		}
		System.out.println(count);
	}
}
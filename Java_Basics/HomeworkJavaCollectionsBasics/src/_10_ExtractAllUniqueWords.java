import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _10_ExtractAllUniqueWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine().toLowerCase();
		TreeSet<String> words = new TreeSet<>();
		Pattern regex = Pattern.compile("[\\w]+");
		Matcher mach = regex.matcher(text);
		
		while (mach.find()) {
			words.add(mach.group());
		}
		
		for (String word : words) {
			System.out.print(word + " ");
		}
		//words.forEach(x -> System.out.print(x+" "));
	}

}

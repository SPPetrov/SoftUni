import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _08_ExtractEmails {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String text = input.nextLine();
		
		Pattern regex = Pattern.compile("([A-Za-z0-9][._\\-]*[A-Za-z]+)+@[A-Za-z\\-]+([.][A-Za-z\\-]+)+");
		Matcher mach = regex.matcher(text);
		
		while (mach.find()) {
			System.out.println(mach.group());
		}

	}

}

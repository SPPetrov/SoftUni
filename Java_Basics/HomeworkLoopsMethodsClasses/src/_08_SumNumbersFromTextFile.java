import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _08_SumNumbersFromTextFile {

	public static void main(String[] args) {
		File inputFile = new File("src/_08_Input.txt");
		try(
		Scanner input = new Scanner(inputFile);
				){
			int result = 0;
			while (input.hasNextLine()) {
				int n = Integer.parseInt(input.nextLine());
				result += n;
				
			}
			System.out.println(result);
			
		}catch (FileNotFoundException fnfex) {
			System.err.println("Error");			
		}
	}
}

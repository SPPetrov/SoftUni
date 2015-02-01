
import java.util.Scanner;
import java.util.TreeMap;


public class _11_MostFrequentWord {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] inputLine = input.nextLine().toLowerCase().split("\\W+");
		TreeMap<String, Integer> countWords = new TreeMap<String, Integer>();
		
		for (String word : inputLine) {
			
			Integer count = countWords.get(word);
			if (count == null) {
				countWords.put(word, 1);
			}
			else{
				countWords.put(word, count + 1);
			}
			
		}
		
		int maxCountOfWord = 0;
		
		for (String word : countWords.keySet()) {
			if (countWords.get(word) > maxCountOfWord) {
				maxCountOfWord = countWords.get(word);
			}
		}
		//print result
		for (String word : countWords.keySet()) {
			if (maxCountOfWord == countWords.get(word)) {
				System.out.println(word +" -> " + countWords.get(word) + " times");
			}
		}

	}

}


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _12_CardsFrequencies {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<String,Integer> countCards = new LinkedHashMap<String,Integer>();
		
		String[] cardsList = input.nextLine().split("[\\W ]+");
		
		for (String card : cardsList) {
			Integer count = countCards.get(card);
			
			if (count == null) {
				countCards.put(card,1);
			}
			else{
				countCards.put(card, count+1);
			}
		}
		
		double numberOfCards = cardsList.length;
		
		for (String key : countCards.keySet()) {
			double appearance = (countCards.get(key)/numberOfCards)*100;
			System.out.printf("%s -> %.2f%%\n", key, appearance );
		}
	}
}
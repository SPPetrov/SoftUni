import java.util.Random;
import java.util.Scanner;

public class _06_RandomHandsOf5Cards {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input number of hand: ");
		int hand = input.nextInt();
		String[] face = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
		String[] suit = new String[] { "♣", "♦", "♥", "♠" };
		Random rnd = new Random();
	
		for (int i = 0; i < hand; i++) {
			for (int j = 0; j < 5; j++) {
				String card = face[rnd.nextInt(13)] + suit[rnd.nextInt(4)];
				System.out.printf("%4s", card);
			}
			System.out.println();
		}
	}
}


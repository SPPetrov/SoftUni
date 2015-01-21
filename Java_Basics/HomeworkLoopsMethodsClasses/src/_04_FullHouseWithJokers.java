import java.util.ArrayList;
import java.util.Collection;


public class _04_FullHouseWithJokers {

	public static void main(String[] args) {

		String[] face = new String[] { "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "J", "Q", "K", "A" };
		String[] suit = new String[] { "♣", "♦", "♥", "♠" };

		int countHands = 0;
		// first three cards
		for (int i1 = 0; i1 < face.length; i1++) {

			for (int j1 = 0; j1 < suit.length; j1++) {
				for (int k1 = j1 + 1; k1 < suit.length; k1++) {
					for (int l1 = k1 + 1; l1 < suit.length; l1++) {
						// other two cards
						for (int i2 = 0; i2 < face.length; i2++) {
							for (int j2 = 0; j2 < suit.length; j2++) {
								for (int k2 = j2 + 1; k2 < suit.length; k2++) {

									String[] hand = new String[] {
											face[i1] + suit[j1],
											face[i1] + suit[k1],
											face[i1] + suit[l1],
											face[i2] + suit[j2],
											face[i2] + suit[k2] };
									
									if (i1 != i2) {
										for (int i = 0; i < hand.length; i++) {
											System.out.print(hand[i] + " ");
										}
										System.out.println();
										countHands++;
									
									//with Jokers - 2^5=32 
										for (int i = 1; i <= 31; i++) {
											
											ArrayList<String> handsJoker = new ArrayList<String>();
											for (int j = 0; j < hand.length; j++) {
												handsJoker.add(hand[j]);
											}

											for (int pos = 0; pos < 5; pos++) {
												
												int bitJ = (i >> pos) & 1;
												
												//Where bitJ==1 change card with Joker
												if (bitJ == 1) {
													handsJoker.remove(4 - pos); 
													handsJoker.add(4 - pos, "*");
												}

											}
											for (String handJ : handsJoker) {
												System.out.print(handJ + " ");
											}
											System.out.println();
											countHands++;
										}
									}

								}
							}
						}
					}
				}
			}
		}
		System.out.println(countHands + "full houses");
	}
}

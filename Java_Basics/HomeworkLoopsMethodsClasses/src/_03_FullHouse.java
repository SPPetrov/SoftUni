
public class _03_FullHouse {

	public static void main(String[] args) {

		String[] face = new String[] { "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "J", "Q", "K", "A" };
		String[] suit = new String[] { "♣", "♦", "♥", "♠" };

		int countHands = 0;
		//first three cards
		for (int i1 = 0; i1 < face.length; i1++) {

			for (int j1 = 0; j1 < suit.length; j1++) {
				for (int k1 = j1 + 1; k1 < suit.length; k1++) {
					for (int l1 = k1 + 1; l1 < suit.length; l1++) {
						//other two cards
						for (int i2 = 0; i2 < face.length; i2++) {
							for (int j2 = 0; j2 < suit.length; j2++) {
								for (int k2 = j2 + 1; k2 < suit.length; k2++) {
									
									String hand = (face[i1] + suit[j1] + " "
											     + face[i1] + suit[k1] + " "
											     + face[i1] + suit[l1] + " "
											     + face[i2] + suit[j2] + " "
											     + face[i2] + suit[k2] );
											     
											     if (i1 != i2) {
													System.out.printf("(%s), ",hand);
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
		System.out.println(countHands + " full houses");
	}
}

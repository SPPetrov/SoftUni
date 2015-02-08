import java.util.Scanner;




public class _01_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int pointHappy = Integer.parseInt(input.nextLine());
		String[] inputLine = input.nextLine().toLowerCase().trim().split("[^a-z]+");
		for (int i = 0; i < inputLine.length; i++) {
			String food = inputLine[i];
			if (food.equals("cram")) {
				pointHappy += 2;
			}else if (food.equals("lembas")) {
				pointHappy += 3;
			}else if (food.equals("apple")) {
				pointHappy += 1;
			}else if (food.equals("melon")) {
				pointHappy += 1;
			}else if (food.equals("honeycake")) {
				pointHappy +=5;
			}else if (food.equals("mushrooms")) {
				pointHappy -=10;
			}else {
				pointHappy -=1;
			}

		}
		System.out.println(pointHappy);
		String mood = "";
		if (pointHappy<-5) {
			mood = "Angry";
		}else if (pointHappy<0 && pointHappy>=-5) {
			mood = "Sad";
		}else if (pointHappy<15 && pointHappy>=0) {
			mood = "Happy";
		}else if (pointHappy>=15) {
			mood = "Special JavaScript mood";
		}
		System.out.println(mood);
		
	}

}

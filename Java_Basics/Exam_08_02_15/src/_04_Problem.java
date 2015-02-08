import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;


public class _04_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		TreeMap<String, LinkedHashMap<String, Integer>> userInfo = new TreeMap<String, LinkedHashMap<String,Integer>>();
		
		while (true) {
			String inputLine = input.nextLine();
			if (inputLine.equals("end")) {
				break;
			}
			String userLine[] = inputLine.split("[= ]+");
			String ip = userLine[1];
			String user = userLine[5];
			if (!userInfo.containsKey(user)) {
				userInfo.put(user, new LinkedHashMap<String, Integer>());
			}
			
			LinkedHashMap<String, Integer> ipInfo = userInfo.get(user);
			
			if (!ipInfo.containsKey(ip)) {
				ipInfo.put(ip, 1);
			}else {
				int count = ipInfo.get(ip);
				ipInfo.put(ip, count + 1);
			}
		}
		for (String user : userInfo.keySet()) {
			System.out.println(user+":");
			System.out.println(userInfo.get(user).toString().replaceAll("[{}]", "").replace("="," => ")+".");
		}

	}

}

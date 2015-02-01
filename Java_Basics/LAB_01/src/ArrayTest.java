//package ArrayTest;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);	
		
		int sizeOfArray = scn.nextInt();
		long[] array = new long[sizeOfArray];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = scn.nextLong(); 
		}
		
		String command = scn.next();
		//change "over" to "stop"
		while (!command.equals("stop")) {
			String line = scn.nextLine().trim();
			int[] params = new int[2];

			if(command.equals("add") || command.equals("subtract") || command.equals("multiply")) {
				String[] stringParams = line.split(" ");
				params[0] = Integer.parseInt(stringParams[0]);
				params[1] = Integer.parseInt(stringParams[1]);

				performAction(array, command, params);
			}
			// add else condition
			else{
			performAction(array, command, params);
			}

			printArray(array);
			System.out.print('\n');
			
			command = scn.next();			
		}		
	}
	
	static void performAction(long[] arr, String action, int[] params){
		//long[] array = arr.clone(); don't need to clone array
		int pos = params[0];
		int value = params[1];

		switch (action) {
		case "multiply":
			//change position and index and array to arr
			arr[pos-1] *= value;
			break;
		case "add":
			//change position and index and array to arr
			arr[pos-1] += value;
			break;
		case "subtract":
			//change position and index and array to arr
			arr[pos-1] -= value;
			break;
		case "lshift":
			arrayShiftLeft(arr);
			break;
		case "rshift":
			arrayShiftRight(arr);
			break;
		}
		
	}

	private static void arrayShiftRight(long[] array) {
		long temp = array[array.length-1]; // need temp for array[array.length-1]
		for (int i = array.length-1; i >= 1 ; i--) {
			array[i] = array[i - 1]; //// put temp to array[0]
		}
		array[0] = temp; 
	}

	private static void arrayShiftLeft(long[] array) {
		long temp = array[0];           // need temp for array[0]
		for (int i = 0; i < array.length - 1; i++) {
			
			array[i] = array[i+1];
		}
		array[array.length-1] = temp; // put temp to array[array.length-1]
		
	}

	private static void printArray(long[] array) {
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
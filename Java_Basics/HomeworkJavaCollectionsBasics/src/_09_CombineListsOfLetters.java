import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.print.attribute.standard.Fidelity;


public class _09_CombineListsOfLetters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] letterLine1 = input.nextLine().split(" ");

		String[] letterLine2 = input.nextLine().split(" ");

		
		ArrayList<Character> firstList = new ArrayList<>();
		ArrayList<Character> secondList = new ArrayList<>();
		
		for (String ch : letterLine1) {
			firstList.add(ch.charAt(0));
		}		
		
		for (String ch : letterLine2) {
			secondList.add(ch.charAt(0));
		}
		System.out.println();
		
		ArrayList<Character> output = new ArrayList<Character>();
		
		output.addAll(firstList);
		for (Character ch : secondList) {
			if (!firstList.contains(ch)) {
				output.add(ch);
			}
		}
		
		
		for (Character ch : output) {
			System.out.print("" + ch + " ");
		}
		
		
	}

}

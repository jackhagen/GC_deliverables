import java.util.Scanner;

public class deliverable_two_UnicodeCalculator {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		String firstString = "Grand";
		String secondString = "Circus";
		int sumOfFirstString = 0;
		int sumOfSecondString = 0;
		int absoluteValue;
		System.out.println("Please enter two words: ");

		for (int i = 0; i < firstString.length(); i++) {
			char c = firstString.charAt(i);
			int value = firstString.charAt(i);
			System.out.println(c + ": " + value);
		}
		for (int i = 0; i < firstString.length(); i++) {
			if (Character.isLetter(firstString.charAt(i))) {
				sumOfFirstString += firstString.charAt(i) - 0;
			}
		}
		for (int i = 0; i < secondString.length(); i++) {
			char c = secondString.charAt(i);
			int value = secondString.charAt(i);
			System.out.println(c + ": " + value);
		}
		for (int i1 = 0; i1 < secondString.length(); i1++) {
			if (Character.isLetter(secondString.charAt(i1))) {
				sumOfSecondString += secondString.charAt(i1) - 0;
			}
		}
		System.out.println("Difference (as absolute value): " + (sumOfFirstString + sumOfSecondString));
	}
}
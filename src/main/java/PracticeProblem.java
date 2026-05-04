/**
 * File: Arrays and iterating
 * Author: Naren Nades
 * Date Created: Apr 27, 2026
 * Date Last Modified: May 4, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static boolean isPalindrome(String word) {
		word = word.replace(" ", "");
		String[] arr = word.split("");
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].equalsIgnoreCase(arr[arr.length - 1 - i])) {
				return false;
			}
		}
		return true;
	}
}

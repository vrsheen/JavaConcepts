package interviewQues;
import java.util.*;

public class StringPermutation {

	public static void main (String args[]) {

		// Get word
		String word = "ABC";

		// Create empty indices ArrayList
//		ArrayList<Integer> indices = new ArrayList<Integer>();

		// Get the permutations
		ArrayList<String> permutations = getPermutations(word, new ArrayList<Integer>());

		// Display the permutations
		System.out.println("Output - "+permutations);

		return;
	}

	// Takes a word and an ArrayList of already considered indices
	// Input: word (String), indices (ArrayList<Integer>)
	// Output: ArrayList<String> containing all possible permutations
	public static ArrayList<String> getPermutations (String word, ArrayList<Integer> indices) {
		System.out.println("New Loop");
		int length = word.length();

		// Create the empty ArrayList to return
		ArrayList<String> toReturn = new ArrayList<String>();

		// If all characters are considered, we are done. Return empty ArrayList
		if (indices.size() == length) {
			toReturn.add("");
			System.out.println("Return Called");
			return toReturn;
		}

		// Iterate over each character to find the permutation
		for (int i = 0; i < length; i++) {
			System.out.println("i value - "+i);
			// Skip if index is already considered
			if (indices.contains(i)) continue;

			// Create and populate a duplicate ArrayList of indices that have already been considered
			ArrayList<Integer> newIndices = new ArrayList<Integer>();
			for (int index : indices) {
				newIndices.add(index);
			}

			// Add current index
			newIndices.add(i);
//			System.out.println("bfrIndices - "+ newIndices);
			// Calculate permutations
			ArrayList<String> permutations = getPermutations(word, newIndices);
			
			// Add the current character before the permutations of the rest of the word
			for (String str : permutations) {
				toReturn.add(word.charAt(i) + str);
			}
//			System.out.println("Indices - "+ newIndices+" | Permutations -"+permutations);
			System.out.println("Returning String - "+toReturn);
		}

		// Return
		return toReturn;

	}

}
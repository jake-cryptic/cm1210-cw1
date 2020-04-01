/*
 *	Module: CM1210 CW1
 *	Question: 1b
 *	Name: Jake Mcneill
 *	Student Number: c1931370
 */
package q1b;

import java.util.Arrays;
import java.util.List;

public class Main {

	private static String[] validMoves = new String[]{"U", "D", "L", "R"};

	public static void main(String[] args) {
		Input in = new Input();
		int userSquareSize = getSquareSize(in);

		List<String> validMovesList = Arrays.asList(validMoves);

		Magic square = new Magic(userSquareSize);

		String originalSquare = square.toString();
		System.out.println("Here's the unshuffled square: \n" + originalSquare);

		// Shuffle square
		square.shuffle();

		String shuffledSquare = square.toString();
		System.out.println("Here's the shuffled square: \n" + shuffledSquare);

		// Print instructions
		System.out.println("\nPlease enter an input that has the format: i j direction");
		System.out.println("i refers to the row, j refers to the column.");
		System.out.println("For instance i = 1, j = 1 is the first row and first column");
		System.out.println("Valid directions include: U, D, L, R\n");

		int numMoves = 0;

		// While user square string != originalSquare, keep playing
		while (!square.toString().equals(originalSquare)){
			String move = in.getMove("Enter a move");
			String[] components = move.split("\\s+", 3);

			if (components.length != 3) {
				System.out.println("Please enter an input that has the format: i j direction");
				continue;
			}

			int i = Integer.parseInt(components[0]);
			int j = Integer.parseInt(components[1]);
			String dir = components[2].toUpperCase();

			if (!validMovesList.contains(dir)) {
				System.out.println("Valid directions include: U, D, L, R");
				continue;
			}

			square.swap(i, j, dir);

			numMoves++;

			System.out.println("\nYou just made move number " + numMoves + ".");
			System.out.println("Here was the square before: \n" + shuffledSquare);
			System.out.println("Here's the current square: \n" + square.toString());
			System.out.println("You are attempting to get it to look like: \n" + originalSquare);

			shuffledSquare = square.toString();
		}

		System.out.println("You finished in " + numMoves + " moves!");
	}

	private static int getSquareSize(Input in){
		int squareSize;
		boolean isAllowed;

		do {
			squareSize = in.getInt("Please enter an odd integer");
			isAllowed = isOddNumber(squareSize) && 0 < squareSize;
			if (!isAllowed){
				System.out.println("You have entered an invalid number. The number must be greater than 0 and odd.");
			}
		} while (!isAllowed);

		return squareSize;
	}

	private static boolean isOddNumber(int n) {
		return Math.floorMod(n, 2) != 0;
	}

}

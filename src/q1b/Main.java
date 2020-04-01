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

		// While user square string != originalSquare, keep playing
		int numMoves = 0;
		while (!square.toString().equals(originalSquare)){
			String move = in.getInput("Enter a move");
			String[] components = move.split(" ");

			System.out.println(components.length);

			if (components.length != 3) {
				System.out.println("Please enter an input that has the format: x y direction");
				continue;
			}

			int x = Integer.parseInt(components[0]);
			int y = Integer.parseInt(components[1]);
			String dir = components[2].toUpperCase();

			if (!validMovesList.contains(dir)) {
				System.out.println("Valid directions include: U, D, L, R");
				continue;
			}

			square.swap(x, y, dir);

			numMoves++;
		}
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

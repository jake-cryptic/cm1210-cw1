/*
 *	Module: CM1210 CW1
 *	Question: 1b
 *	Name: Jake Mcneill
 *	Student Number: c1931370
 */
package q1b;

public class Main {

	public static void main(String[] args) {
		int userSquareSize = getSquareSize();

		Magic square = new Magic(userSquareSize);

		System.out.println("Here's that magic square you wanted: \n" + square.toString());
	}

	private static int getSquareSize(){
		Input in = new Input();

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

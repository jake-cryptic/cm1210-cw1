public class Main {

	public static void main(String[] args) {
		int userSquareSize = getSquareSize();

		int square[][] = new int[userSquareSize][userSquareSize];
		printSquareData(square);
	}

	private static void printSquareData(int[][] square) {
		System.out.println ("Square size: " + square.length);
		for (int[] ints : square) {
			System.out.print("\n | ");
			for (int anInt : ints) {
				System.out.print(anInt + " | ");
			}
		}
	}

	private static int getSquareSize(){
		Input in = new Input();

		int squareSize = 2;
		boolean isOdd = false;

		do {
			squareSize = in.getInt("Please enter an odd integer");
			isOdd = isOddNumber(squareSize);
			if (!isOdd){
				System.out.println("You have entered an even number!");
			}
		} while (!isOdd);

		return squareSize;
	}

	private static boolean isOddNumber(int n) {
		return Math.floorMod(n, 2) != 0;
	}

}

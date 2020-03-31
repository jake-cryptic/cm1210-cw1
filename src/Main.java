public class Main {

	public static void main(String[] args) {
		int userSquareSize = getSquareSize();

		Square magic = new Square(userSquareSize);

		magic.printData();
	}

	private static int getSquareSize(){
		Input in = new Input();

		int squareSize;
		boolean isOdd;

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

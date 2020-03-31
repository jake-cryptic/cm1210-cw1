public class Main {

	public static void main(String[] args) {
		int userSquareSize = getSquareSize();

		Square magic = new Square(userSquareSize);
		magic.printData();

		int max 	= (int) Math.pow(userSquareSize, 2),
		 	loopX 	= 1,
			loopY	= ((userSquareSize + 1) / 2);

		magic.setPos(loopX, loopY, 1);

		for (int i = 2; i <= max; i++) {
			// magic.printData();
			
			if (magic.getPos(loopX - 1, loopY - 1) == 0) {
				loopX--;
				loopY--;
			} else {
				loopX++;
			}

			magic.setPos(loopX, loopY, i);
			loopX = magic.updatePos(loopX);
			loopY = magic.updatePos(loopY);
		}

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

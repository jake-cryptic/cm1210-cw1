public class Square {

	private int[][] data;

	public Square(int size){
		data = new int[size][size];
	}

	public void printData() {
		System.out.println ("Square size: " + data.length);

		for (int[] row : data) {
			System.out.print("\n | ");

			for (int item : row) {
				System.out.print(item + " | ");
			}
		}
	}

	public int getPos(int x, int y) {
		return data[x][y];
	}

	public void setPos(int x, int y, int newValue) {
		data[x][y] = newValue;
	}

}

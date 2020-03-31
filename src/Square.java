public class Square {

	private int[][] data;
	private int size;

	public Square(int usize){
		size = usize;
		data = new int[size][size];
	}

	public void printData() {
		// System.out.println ("Square size: " + data.length);

		for (int[] row : data) {
			System.out.print("\n\t|\t");

			for (int item : row) {
				System.out.print(item + "\t|\t");
			}
		}
	}

	private int getRelative(int n){
		int rn = n - 1;
		if (rn < 0) {
			rn = size - 1;
		} else if (rn >= size) {
			rn = 0;
		}
		return rn;
	}

	public int updatePos(int n){
		return getRelative(n) + 1;
	}

	public int getPos(int x, int y) {
		int nx = getRelative(x), ny = getRelative(y);
		System.out.println("\nGetting " + nx + "," + ny);

		return data[nx][ny];
	}

	public void setPos(int x, int y, int newValue) {
		int nx = getRelative(x), ny = getRelative(y);
		System.out.println("\nSetting " + nx + "," + ny + " to: " + newValue);
		data[nx][ny] = newValue;
	}

}

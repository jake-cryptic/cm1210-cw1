/*
 *	Module: CM1210 CW1
 *	Question: 1b
 *	Name: Jake Mcneill
 *	Student Number: c1931370
 */

public class Square {

	protected int[][] data;
	protected int size;

	public Square(int usize){
		size = usize;
		data = new int[size][size];
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int[] row : data) {
			sb.append("\t|\t");

			for (int item : row) {
				sb.append(item).append("\t|\t");
			}

			sb.append("\n");
		}

		return sb.toString();
	}

	// A method for getting the position of wrapped columns and rows
	private int getRelative(int n) {
		int rn = n - 1;
		if (rn < 0) {
			rn = size - 1;
		} else if (rn >= size) {
			rn = 0;
		}
		return rn;
	}

	public int updatePos(int n) {
		return getRelative(n) + 1;
	}

	public int getPos(int x, int y) {
		int nx = getRelative(x),
			ny = getRelative(y);
		return data[nx][ny];
	}

	public void setPos(int x, int y, int newValue) {
		int nx = getRelative(x),
			ny = getRelative(y);
		data[nx][ny] = newValue;
	}

}

/*
 *	Module: CM1210 CW1
 *	Question: 1a
 *	Name: Jake Mcneill
 *	Student Number: c1931370
 */

public class Square {

	private int[][] data;
	private int size;

	public Square(int usize){
		size = usize;
		data = new int[size][size];
	}

	public void printData() {
		for (int[] row : data) {
			System.out.print("\n\t|\t");

			for (int item : row) {
				System.out.print(item + "\t|\t");
			}
		}
	}

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

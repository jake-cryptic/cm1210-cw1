/*
 *	Module: CM1210 CW1
 *	Question: 1b
 *	Name: Jake Mcneill
 *	Student Number: c1931370
 */
package q1b;

import java.util.Random;

public class Magic extends Square {

	public Magic(int usize) {
		super(usize);

		int max 	= (int) Math.pow(usize, 2),
			loopX 	= 1,
			loopY	= ((usize + 1) / 2);

		setPos(loopX, loopY, 1);

		for (int i = 2; i <= max; i++) {
			if (getPos(loopX - 1, loopY - 1) == 0) {
				loopX--;
				loopY--;
			} else {
				loopX++;
			}

			setPos(loopX, loopY, i);
			loopX = updatePos(loopX);
			loopY = updatePos(loopY);
		}
	}

	public int getAnswer() {
		int ans = size * ((size * size) + 1);
		return ans / 2;
	}

	public boolean validSquare() {
		int answer = getAnswer();

		int[] columnSum = new int[size];
		int diagonalSum = 0;

		for (int i = 0; i < size; i++) {
			int rowSum = 0;

			for (int j = 0; j < size; j++) {
				rowSum += data[i][j];
				columnSum[j] += data[j][i];
				if (i == j) {
					diagonalSum += data[i][j];
				}
			}

			// Check if row adds up
			if (rowSum != answer) {
				return false;
			}
		}

		// Check if diagonal adds up
		if (diagonalSum != answer) {
			return false;
		}

		// Check all columns add up
		for (int column : columnSum) {
			if (column != answer) {
				return false;
			}
		}

		return true;
	}

	public void swap(int i, int j, String dir) {
		int newI = updatePos(i),
			newJ = updatePos(j);

		// Adjust coordinates depending on direction
		switch (dir){
			case "U": newI++; break;
			case "D": newI--; break;
			case "L": newJ--; break;
			case "R": newJ++; break;
		}

		newI = updatePos(newI);
		newJ = updatePos(newJ);

		// Get data from old positions
		int tmpOld = getPos(i, j);
		int tmpNew = getPos(newI, newJ);

		// Set data for new positions
		setPos(newI, newJ, tmpOld);
		setPos(i, j, tmpNew);
	}

	public void shuffle() {
		Random rand = new Random();
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				int m = rand.nextInt(i + 1);
				int n = rand.nextInt(j + 1);

				int swap = data[i][j];
				data[i][j] = data[m][n];
				data[m][n] = swap;
			}
		}
	}

}

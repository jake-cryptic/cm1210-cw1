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

	public void swap(int x, int y, String dir) {
		int newX = x,
			newY = y;

		// Adjust coordinates depending on direction
		switch (dir){
			case "U": newY++; break;
			case "D": newY--; break;
			case "L": newX--; break;
			case "R": newX++; break;
		}

		// Get data from old positions
		int tmpOld = getPos(x, y);
		int tmpNew = getPos(newX, newY);

		// Set data for new positions
		setPos(newX, newY, tmpOld);
		setPos(x, y, tmpNew);
	}

	public void shuffle() {
		Random rand = new Random();
		for (int i = data.length - 1; i > 0; i--) {
			for (int j = data[i].length - 1; j > 0; j--) {
				int m = rand.nextInt(i + 1);
				int n = rand.nextInt(j + 1);

				int temp = data[i][j];
				data[i][j] = data[m][n];
				data[m][n] = temp;
			}
		}
	}

}

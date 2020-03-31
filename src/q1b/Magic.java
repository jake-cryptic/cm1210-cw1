/*
 *	Module: CM1210 CW1
 *	Question: 1b
 *	Name: Jake Mcneill
 *	Student Number: c1931370
 */
package q1b;

public class Magic extends Square {

	public Magic(int usize){
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

}

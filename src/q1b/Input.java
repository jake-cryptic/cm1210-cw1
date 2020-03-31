/*
 *	Module: CM1210 CW1
 *	Question: 1b
 *	Name: Jake Mcneill
 *	Student Number: c1931370
 */
package q1b;

import java.util.Scanner;

public class Input {

	private Scanner sc;

	public Input() {
		sc = new Scanner(System.in);
	}

	private void prompt(String out) {
		System.out.print("\n" + out + ": ");
	}

	public int getInt(String out) {
		prompt(out);

		int uin = -1;
		try {
			if (sc.hasNextInt()) {
				uin = sc.nextInt();
			} else {
				System.out.println("That was not a valid input.");
				sc.next();
				uin = getInt(out);
			}
		} catch(Exception e) {
			System.out.println(e.toString());
			System.exit(0);
		}

		return uin;
	}

}

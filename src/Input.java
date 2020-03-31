import java.util.Scanner;

public class Input {

	Scanner sc;

	public Input() {
		sc = new Scanner(System.in);
	}

	private void prompt(String out){
		StringBuffer sb = new StringBuffer();
		sb.append("\n").append(out).append(": ");
		System.out.print(sb.toString());
	}

	public int getInt(String out) {
		prompt(out);

		int uin = -1;
		try {
			if (sc.hasNextInt()){
				uin = sc.nextInt();
			} else {
				System.out.println("That was not a valid input.");
				sc.next();
				uin = getInt(out);
			}
		} catch(Exception e){
			System.out.println(e.toString());
			System.exit(0);
		}

		return uin;
	}

}

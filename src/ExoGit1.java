import java.util.Scanner;

public class ExoGit1 {
	private static int bigint1;
	private static int bigint2;
	private static int bigint3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		Scanner sc = new Scanner(System.in);
		String myString;

		do {
			myString = new String(sc.nextLine());
			i = Integer.parseInt(myString);
			manageRange(i);
			if (!(i == -1)) {
				System.out.println("3 plus grands : " + bigint1 + ", " + bigint2 + ", " + bigint3);
			}
		} while (!myString.equals("-1"));
		System.out.println("Fini");
	}

	private static int mostSmall() {
		if (bigint1 <= bigint2 && bigint1 <= bigint3) {
			return 1;
		}
		if (bigint2 <= bigint1 && bigint2 <= bigint3) {
			return 2;
		}
		return 3;
	}

	private static void manageRange(int i) {
		int small = mostSmall();
		switch (small) {
		case 1:
			if (i > bigint1) {
				bigint1 = i;
			}
			break;
		case 2:
			if (i > bigint2) {
				bigint2 = i;
			}
			break;
		case 3:
			if (i > bigint3) {
				bigint3 = i;
			}
		}

	}
}

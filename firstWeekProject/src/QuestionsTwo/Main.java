package QuestionsTwo;

public class Main {

	public static void main(String[] args) {
		int i, j;
		int stars = 1;
		int x = 1;
		for (j = 0; j < 5; j++) {
			for (i = 0; i < stars; i++) {
				System.out.print("*");
			}
			System.out.println("");
			stars++;

		}

		for (int satir = 5; satir > 0; satir--) {
			for (int sutun = 1; sutun < 5 + 1; sutun++) {
				if (satir <= sutun) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}

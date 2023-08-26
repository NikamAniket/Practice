package dpp;

public class DiamondPattern {
	public static void diamond(int size) {
		for (int row = 0; row <= size; row++) {
			for (int space = 1; space <= size - row; space++) {
				System.out.print(" ");
			}
			for (int col = 0; col <= row; col++) {

				System.out.print("*");
			}
			for (int col = 1; col <= row; col++) {

				System.out.print("*");
			}
			System.out.println();
		}

		for (int row = size; row >= 0; row--) {
			for (int space = 1; space <= size - row; space++) {
				System.out.print(" ");
			}
			for (int col = 0; col <= row; col++) {

				System.out.print("*");
			}
			for (int col = 1; col <= row; col++) {

				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		diamond(5);

	}

}

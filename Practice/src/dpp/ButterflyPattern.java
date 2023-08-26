package dpp;

public class ButterflyPattern {
	public static void butterflyPattern(int size) {
		for (int row = 1; row <= size; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}

			for (int space = 1; space < size * 2 - row * 2 + 1; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int row = size; row >= 1; row--) {
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}

			for (int space = 1; space < size * 2 - row * 2 + 1; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		butterflyPattern(4);

	}

}

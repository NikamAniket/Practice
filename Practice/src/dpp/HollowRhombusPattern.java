package dpp;

public class HollowRhombusPattern {

	public static void hollowRhombus(int size) {
		for (int row = 1; row <= size; row++) {
			for (int space = 1; space <= size - row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= size; col++) {
				if (row == 1 || row == size || col == 1 || col == size)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		hollowRhombus(5);

	}

}

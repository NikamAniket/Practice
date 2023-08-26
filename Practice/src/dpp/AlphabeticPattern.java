package dpp;

public class AlphabeticPattern {
	public static void alphaPattern(int size) {
		for(int row=1;row<=size;row++) {
			for(int space=1;space<=size-row;space++) {
				System.out.print(" ");
			}
			for(int col=row;col>=1;col--) {
				System.out.print(col);
			}
			for(int col=2;col<=row;col++) {
				System.out.print(col);
			}System.out.println();
		}
	}


	public static void main(String[] args) {
		alphaPattern(5);
	}

}

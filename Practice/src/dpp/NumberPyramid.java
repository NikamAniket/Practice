package dpp;

public class NumberPyramid {
	public static void numberPyramid(int size) {
		for(int row=1;row<=size;row++) {
			
			for(int space=1;space<=size-row;space++) {
				System.out.print(" ");
			}
			
			
			for(int col=1;col<=row;col++) {
				System.out.print(row+ " ");
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		numberPyramid(5);
	}

}

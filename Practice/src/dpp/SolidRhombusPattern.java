package dpp;

public class SolidRhombusPattern {
	
	public static void solidRhombusPattern (int size) {
		for(int row=1;row<=size;row++) {
			for(int space=1;space<=size-row;space++) {
				System.out.print(" ");
			}
			for(int col=1;col<=size;col++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}
	public static void main(String[] args) {
		solidRhombusPattern(5);
		
	}

}

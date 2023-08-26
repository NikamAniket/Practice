package dpp;

public class PatternNum {
	public static void patternNum(int size) {
		for(int row=size;row>=1;row--) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
				
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		patternNum(5);
	}

}

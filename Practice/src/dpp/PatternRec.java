package dpp;

public class PatternRec {
	public static void rectanglPattern(int size) {
		for(int row=1;row<=size;row++) {
			for(int col=1;col<=size+1;col++) {
				if(row==1||row==size||col==1||col==size+1) 
					System.out.print("*");
				else 
					System.out.print(" ");
			}System.out.println();
		}
		
	}

	public static void main(String[] args) {
		rectanglPattern(4);

	}

}

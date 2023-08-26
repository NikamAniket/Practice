package dpp;

public class ZeroOneTriangle {
	public static void zeroOne(int size) {
		int start=1;
		for(int row=1;row<=size;row++) {
			if(row%2==0) 
			start=1;
			else
			start=0;
			
			for(int col=1;col<=row;col++) {
				System.out.print(start);
				start=1-start;
			}System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		zeroOne(5);

	}

}

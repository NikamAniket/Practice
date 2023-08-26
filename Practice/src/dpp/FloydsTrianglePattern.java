package dpp;

public class FloydsTrianglePattern {
	public static void floydsTriangle(int size) {
		int count=1;
		for (int row =1;row<=size;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(" "+count);
				count++;
			}System.out.println();
		}
		
	}

	public static void main(String[] args) {
		floydsTriangle(5);

	}

}

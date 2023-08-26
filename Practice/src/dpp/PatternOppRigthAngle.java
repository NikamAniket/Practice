package dpp;

public class PatternOppRigthAngle {
	public static void oppRightAngle(int size) {
		for(int row=1;row<=size;row++) {
			for(int space=1;space<=size-row;space++) {
				System.out.print(" ");
			}for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
			}
	}
	public static void main(String[] args) {
		oppRightAngle(4);
	}

}

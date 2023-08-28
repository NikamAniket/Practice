package dpp;

public class PatternNine {
	public static void patternNine(int n) {
		//upper loop
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}for(int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}System.out.println();
		}
		//lower loop
//		for(int i=n;i>0;i--) {
//			for(int j=0;j<n-i;j++) {
//				System.out.print(" ");
//			}for(int k=0;k<2*i-1;k++) {
//				System.out.print("*");
//			}System.out.println();
//		}
//		
	}

	public static void main(String[] args) {
		PatternNine.patternNine(5);

	}

}

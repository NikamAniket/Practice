package dpp;

public class PatternFive {
	public static void patternFive(int n) {
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		PatternFive.patternFive(5);
	}

}

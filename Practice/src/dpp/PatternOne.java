package dpp;

public class PatternOne {
	public static void patternOne(int n) {
		for(int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
		} System.out.println("");
	}}

	public static void main(String[] args) {
		patternOne(5);

	}

}

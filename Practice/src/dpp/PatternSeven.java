package dpp;

public class PatternSeven {
	public static void pattern7(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
				}
//			for(int j=0;j<2*i+1;j++) {
//				System.out.print("*");
//				}
//			for(int j=0;j<n-i;j++) {
//				System.out.print(" ");}
//			System.out.println();
			for(int k=1;k<=2*i+1;k++) {
				System.out.print("*");
			}System.out.println("");
		
	}}
	public static void main(String[] args) {
		PatternSeven.pattern7(5);
	}

}

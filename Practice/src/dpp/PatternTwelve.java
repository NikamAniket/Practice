package dpp;

public class PatternTwelve {
	public static void pattern12(int n) {
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n*2-i*2;j++) {
//				//System.out.print(i);
//				System.out.print(" ");
//			}
//			for(int k=i;k>=0-i;k--) {
//			System.out.print(i);
//			System.out.println();
//		}
			
	//		}	System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			System.out.print(j);}
			for(int j=1;j<=n*2-i*2;j++) {
				System.out.print(" ");	
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();	
		}
	}
	public static void main(String[] args) {
		PatternTwelve.pattern12(4);
	}
}


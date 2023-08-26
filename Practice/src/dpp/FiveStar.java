package dpp;

public class FiveStar {
	public 	void patternOne(int n) {
		for(int i=0;i<n;i++) {
		//	if(i<=5)
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}System.out.println();
		}
		}
	public static void main(String[] args) {
		
	FiveStar f=new FiveStar();
		f.patternOne(5);
	}
}

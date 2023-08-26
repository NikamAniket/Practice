package dpp;

public class PatternSixteenth {

	public static void main(String[] args) {
		int n=6;
		for(int i=0;i<n;i++) {
			char ch=  (char)('A'+i) ;
			for(int j=0;j<=i;j++) {
				System.out.print(ch);//System.out.print((char)((int)('A'+i)));//System.out.print((char)(65+i));
			}System.out.println();
		}

	}

}

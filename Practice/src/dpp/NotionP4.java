package dpp;

public class NotionP4 {
	public static void pattern(int size) {
		for(int i=size;i>0;i--) {
			for(int j=0;j<size-i;j++) {
				System.out.print(" ");
			}for(int k=0;k<2*i-1;k++) {
				if(k%2==0)
				System.out.print("1");
				else
					System.out.print("0");
			}System.out.println();}
	}

	public static void main(String[] args) {
		pattern(4);

	}

}

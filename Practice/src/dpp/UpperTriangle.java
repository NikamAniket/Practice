package dpp;

public class UpperTriangle {
	public static void upperTriangle(int size) {
		for(int r=0;r<size;r++) {
			for(int s=0;s<r;s++) {
				System.out.print(" ");
				}for(int c=1;c<size+1-r;c++)  {
//		}	for(int c=size-r;c>=1;c--)			{
				System.out.print(c);
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		upperTriangle(4);
		
	}

}

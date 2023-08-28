package dpp;

public class NotionPattern03 {
	public static void pattern(int size) {
//		for(int r=1;r<=size;r++) {
//			for(int s=1;s<=size-r;s++) {
//				System.out.print(" ");}
//			if(r%2!=0) 
//			for(int c=1;c<=r;c++) {
//				System.out.print("*");
//			}System.out.println();
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-i;j++) {
				System.out.print(" ");
			}for(int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}System.out.println();}
	
		for(int i=size-2;i>0;i--) {
			for(int j=0;j<size-i;j++) {
				System.out.print(" ");
			}for(int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}System.out.println();}
	
	
	
	
	
	
	
	}
		
	public static void main(String[] args) {
		pattern(6);
	}

}

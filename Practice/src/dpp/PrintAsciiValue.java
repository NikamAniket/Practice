package dpp;

public class PrintAsciiValue {
	public static void printAsciiValue() {
		
		for(int s=0;s<=255;s++) {
			System.out.print( s+" ");
			System.out.println((char) s);
		}
	}

	public static void main(String[] args) {
		printAsciiValue();

	}

}

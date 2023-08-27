package dpp;
//1234
//ABCD
//1234
//ABCD

public class MixNumAlpha {
	public static void mixNumAlpha(int size) {
		for(int r=1;r<=size;r++) {
			for(int c=1;c<=size;c++)
			if(r%2!=0)
				System.out.print(c);
			else
				System.out.print((char)(64+c));
			System.out.println();}
		}

	public static void main(String[] args) {
		mixNumAlpha(4);

	}

}

package dpp;

public class ForwardBackward {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println(" "+i);
			if(i==5) {
				for(int j=4;j>=1;j--) {
					System.out.println(" "+j);
				}
			}
		}
	}

}

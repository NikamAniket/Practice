package dpp;

public class RasietoPower {
	public static void raiseToPower(int base,int power) {
		int result = 1;
		for(int i=1;i<=power;i++) {
			result *= base;
		}System.out.println(result);
		
	}
	

	public static void main(String[] args) {
		raiseToPower(2, 5);

	}

}

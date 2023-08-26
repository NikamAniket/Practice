package dpp;

public class FactorsOfNumber {
	public static void factorsOfNumber(int num) {
		for(int i=1;i<=num;i++) {
			if(num%i==0) 
				System.out.println(i);
			
		}
		}

	public static void main(String[] args) {
		factorsOfNumber(45);
		System.out.println("_________________________");
		factorsOfNumber(86);
	}

}

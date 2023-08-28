package dpp;

public class SumOfDigit {
	public static void sumOfDigit(int num) {
		System.out.println(num);
		int sum = 0,rem;int rev=0;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			sum+=rem;
			num/=10;
		}
		
		System.out.println(sum);
		System.out.println(rev);
	}

	public static void main(String[] args) {
		sumOfDigit(23634);

	}

}

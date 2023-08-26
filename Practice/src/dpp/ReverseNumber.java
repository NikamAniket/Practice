package dpp;

public class ReverseNumber {
	public static int reverseNumber(int num) {
		int rem,rev=0;
//		for(;num!=0;num=num/10)
	while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;	
		}
		return rev;
		
		
	
	}
	

	public static void main(String[] args) {
		int  res=reverseNumber(321);
		System.out.println(res);

	}

}

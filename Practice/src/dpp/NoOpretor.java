package dpp;

public class NoOpretor {
	public static void noOperator(int n1,int n2) {
		int sum=0;
		int sum2=0;
		int count=0;
		int orginalnum=n1;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(" Multiplication is : ");
		for(int i=0;i<n2;i++) {
			sum=sum+n1;
		}System.out.println(sum);
		
		System.out.println(" Division is : ");
		for(;n1>=n2;) {
			n1=n1-n2;
			count++;
		}System.out.println(count);
		
		System.out.println(" Remainder is : ");
		int rem=orginalnum-(count*n2);
		System.out.println(rem);
		
		
	}
	
public static void main(String[] args) {
	noOperator(21, 4);
	
	
//		int n1=21;
//		int originalNo=n1;
//		int n2=4;
//		int sum=0;
//		int sum1=0;
//		{
//		for(int i=0;i<n2;i++) {
//			sum1+=n1;
//		}
//		System.out.println("Multiplication is "+sum1);
//			
//		
//		while(n1>=n2) {
//			n1=n1-n2;
//			sum++;
//		}System.out.println("Division is "+sum);
//		
//	
//		int rem=originalNo-(sum* n2);
//		System.out.println("Remainder is "+rem);
//		
//		}
//	}
	}}
	
	
	
	
	
	




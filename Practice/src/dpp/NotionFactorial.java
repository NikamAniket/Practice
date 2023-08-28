package dpp;

public class NotionFactorial {
	public static void factorial(int num) {
		int fact=1;
		System.out.print(num+" factors are ");
		if(num==0)
			System.out.println(0);
		else {
			for(int i=1;i<=num;i++) {
			fact*=i;
			System.out.print(+i+"*");
		}System.out.println(" and factorial is  :"+fact);
		}}
	
	
public static void main(String[] args) {
	factorial(0);
}
}


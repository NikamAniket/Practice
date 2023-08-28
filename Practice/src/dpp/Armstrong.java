package dpp;

public class Armstrong {
	public static void armstrong(int num) {
		int n1=num;
		int sum=0;
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;
			}
		num=n1;
		while(num!=0) {
			int  rem = num%10;
			sum+=Math.pow(rem,count);
		//	sum+=(rem*rem*rem*rem);
				num/=10;
			}	System.out.println("Sum of given number  : "+sum);
			System.out.println(" Orginal number  : "+n1);
		if(n1==sum)
			System.out.println(n1+" is a armstrong number ");
		else
			System.out.println(n1+" is not armstrong number ");
			}

	public static void main(String[] args) {
		armstrong(9474);

	}

}

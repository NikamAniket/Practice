package dpp;

public class CountEvenNo {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=25;i++) {
			if(i%2==0) //for odd numbers put "if(i%2!=0)"
			{
				count++;
				
			}
			
		}
System.out.println(" "+count);
	}

}

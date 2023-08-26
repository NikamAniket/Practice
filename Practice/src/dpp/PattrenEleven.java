package dpp;

public class PattrenEleven {
	public static void pattren11(int n) {
		/*for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
			if(i%2!=0)	{
				if(j%2==0) {
				System.out.print("0");
				
				}
				else {
				System.out.print("1");
			}
			}else
			{
				if(j%2==0) {
				System.out.print("1");
				
				}
				else {
				System.out.print("0");
			}
		}
	}System.out.println();}*/
	int start=1;
	for(int i=0;i<n;i++) {
		if(i%2==0)start=1;
		else start=0;
		for(int j=0;j<=i;j++) {
			System.out.print(start);
			start=1-start;
		}System.out.println();
	}
		}
	

	public static void main(String[] args) {
		PattrenEleven.pattren11(5);
	}

}

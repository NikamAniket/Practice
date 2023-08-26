package dpp;

public class PatternSeventeen
{

	public static void main(String[] args) 
	{
		int n=4;
				for(int i=0;i<n;i++) 
		{
						for(int j=0;j<n-i;j++) 
				{
				System.out.print(" ");
				}
						char ch=(char)( 'A');
						int breakpoint=(2*i+1)/2;
						for(int k=1;k<=2*i+1;k++)
						{
							System.out.print(ch);
							if(k<=breakpoint)ch++;
							else ch--;
						}
						System.out.println();	
		}
	}

}

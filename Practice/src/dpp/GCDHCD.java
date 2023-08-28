package dpp;

public class GCDHCD {
	public static void gcdHcd(int n1,int n2) {
		int gcd=1;
	  int min= Math.min(n1,n2);
//	  System.out.println(min);
			for(int i=1;i<=min;i++)
				if(n1%i==0 && n2%i==0)
					gcd=i;
				System.out.println("GCD of the given numbers is : "+gcd);
	}

	public static void main(String[] args) {
		gcdHcd(11,13);

	}

}

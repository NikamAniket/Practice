package dpp;

public class Fractions {

	public static long gcd(long a, long b) {
	    return b == 0 ? a : gcd(b, a % b);
	}

	public static String asFraction(long a, long b) {
	    long gcd = gcd(a, b);
	    return (a / gcd) + "/" + (b / gcd);
	}

	// Some tests
	public static void main(String[] args) {
	    System.out.println(asFraction(15, 5)); //  "1/2"
	    System.out.println(asFraction(17, 3));     //  "17/3"
	    System.out.println(asFraction(462, 1071)); //  "22/51"
	}	
}

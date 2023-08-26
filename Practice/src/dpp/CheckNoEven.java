package dpp;

import java.util.Scanner;

public class CheckNoEven {
	public static void checkNoeve() {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=Sc.nextInt();
		if(n%2==0) {
			System.out.println("Number is Even");
		}else {
			System.out.println(" Number is odd");
		}
	}

}

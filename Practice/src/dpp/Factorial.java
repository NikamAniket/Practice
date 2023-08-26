package dpp;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number to find out factorials");
		int n=Sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++) {
			System.out.print("  "+i);
			fact=fact*i;
		}System.out.println(" are the factors  of "+n+" and the factorial is  "+fact);

	}

}

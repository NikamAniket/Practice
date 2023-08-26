package dpp;

import java.util.Scanner;

public class PrintEevenOddNo {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=Sc.nextInt();
		if(num%2!=0) {
			System.out.println(" The Number " +num+" is Odd Number");
		}else {
			System.out.println(" The Number " +num+" is Even Number");
		}

	}

}

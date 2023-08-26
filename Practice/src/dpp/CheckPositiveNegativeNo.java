package dpp;

import java.util.Scanner;

public class CheckPositiveNegativeNo {
public static void checkNoPNZ() {
	Scanner Sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=Sc.nextInt();
	if(n>0) {
		System.out.println(" Number is Positive");
	}else if(n<0) {
		System.out.println(" Number is Negative");
	}else {
		System.out.println(" Number is zero");
	}
}
}

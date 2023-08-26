package dpp;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=Sc.nextInt();
		int[] array=new int[n];
		System.out.println("Enter the  elements of array");
		int sum=0;
		
		for(int i=0;i<=n-1;i++) {
			array[i]=Sc.nextInt();
			sum=sum+array[i];
		}
		System.out.println("The Sum of the "+n+" Elements is :"+sum);
		int average=sum/n;
		System.out.println("Average of the "+n+" number is :"+average);
	}

}

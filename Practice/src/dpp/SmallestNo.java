package dpp;

import java.util.Scanner;


public class SmallestNo {
	public static void checkSmallestNo() {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=Sc.nextInt();
		int array[]=new int[n];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<=array.length-1;i++) {
			array[i]=Sc.nextInt();
		}
		
		int Max=array[0];
		int Min=array[0];
		for(int i=0;i<=array.length-1;i++) {
			if(array[i]>Max) {
				Max=array[i];
			}else if(array[i]<Min) {
				Min=array[i];
			}else {
				System.out.println(" ");
			}
		
		
		
}
	System.out.println("Maximum number is "+Max);
	System.out.println("Minimum number is "+Min);
	}}


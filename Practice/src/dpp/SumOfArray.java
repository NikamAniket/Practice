package dpp;

import java.util.Scanner;

public class SumOfArray {
	public static void sumOfArray() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
			
		}
		System.out.println("Array elements are :  ");
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			System.out.println(""+a[i]);
			sum  += a[i];
		}
		System.out.println(" sum of array elements : "+sum);
		int len=a.length;
//	System.out.println(" "+a.toString());
	
		System.out.println("length of array is :" +len);
		System.out.println(" Average of the array is  : "+sum/len);
	}


	public static void findElement() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size=s.nextInt();
		System.out.println("Enter the element  to find in  array ");
		int num=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(""+a[i]);
		}
		
		for (int i = 0; i < a.length; i++) {
			if (num==a[i]) {
				System.out.println(" element is present ");
	
			}	
		}

	
	}
	
	
	
	public static void forEachArray() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for (int i : a) {
			a[i]=s.nextInt();
			}
		for (int i : a) {
			System.out.println(a[i]);
		}
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


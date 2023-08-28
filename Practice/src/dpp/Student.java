package dpp;

import java.util.Scanner;

public class Student {
	String name;
int rollNo;
	public void setData(String name,int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
	}
	public void getData() {
		System.out.println("Name of the student is : "+name);
		System.out.println("Roll number of the student is : "+rollNo);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size  :");
		int size=sc.nextInt();
		Student[] s=new Student[size];
		for (int i=0;i<size;i++)
		{
		s[i]=new Student();
		System.out.print("Enter the Name of student : ");
		String name=sc.next();
		System.out.print("Enter the roll number of student  : ");
		int rollNo=sc.nextInt();
		s[i].setData(name, rollNo);
		s[i].getData();

			
		}
	
		



			
	
	}

}

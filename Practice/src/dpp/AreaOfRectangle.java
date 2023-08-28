package dpp;

import java.util.Scanner;

public class AreaOfRectangle {
	int l;int b;
	 
	public void setDimension(int l,int b) {
		 this.l=l;
		 this.b=b;
	}
	public  int getArea() {
		int area=l*b;
		 return area ;
	}
	public static void main(String[] args) {
		AreaOfRectangle aa=new AreaOfRectangle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of rectangle : ");
		int l=sc.nextInt();
		System.out.println("Enter the breath of rectangle : ");
		int b=sc.nextInt();
		
		aa.setDimension( l, b);
		int res=aa.getArea();
		System.out.println("Area of Rectangle is : "+res);
	}

}

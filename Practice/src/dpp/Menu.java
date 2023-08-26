package dpp;

import java.util.Scanner;

public class Menu {
	public static void menu() {
	 Scanner Sc=new Scanner(System.in);
	 System.out.println("**Choose calulator**" );
	 System.out.println("Press 1 for Addition");
	 System.out.println("Press 2 for Subtraction");
	 System.out.println("Press 3 for Multiplcation");
	 System.out.println("Press 4 for Division");
	 System.out.println("Press 5 for  Modules");
	 System.out.println("Enter the chosse ");
		int ch=Sc.nextInt();
	System.out.println("Enter the Number one ");
	 int x=Sc.nextInt();
	System.out.println("Enter the Number  two");
	 int y=Sc.nextInt();
	
	
	switch(ch) {
	case 1:{
		System.out.println("Addition");
		int res=Addition.add(x, y);
		System.out.print("Addition of "+x+"& "+y+res);
		break;
	}
	case 2:{
		System.out.println("Subtraction");
		int res=Subtraction.sub(x,y);
		System.out.print("Subtraction of "+x+"& "+y+"is "+res);
		break;
	}case 3:{
		System.out.println("Multiplication");
		int res=Multiplication.Mul(x,y);
		System.out.print("Multiplication of "+x+"& "+y+"is "+res);
		break;
	}case 4:{
		System.out.println("Division");
		double res=Division.div(x,y);
		System.out.print("Division of "+x+"& "+y+"is "+res);
		break;
	}case 5:{
		System.out.println("Modules");
		int res=Modules.mod(x,y);
		System.out.print("Modules of "+x+"& "+y+"is "+res);
		break;
	}default :{
		System.out.println("Invalid in put");
		
	}
	}
	}
}


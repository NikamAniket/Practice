package dpp;

import java.util.Scanner;

public class Weekdays {
	public static void checkWeekDays() {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter the Number ");
		int ch=Sc.nextInt();
		switch(ch) {
		case 1:{
			System.out.println("Monaday");
			break;
		}
		case 2:{
			System.out.println("Tuesday");
			break;
		}case 3:{
			System.out.println("Wednesday");
			break;
		}case 4:{
			System.out.println("Thursday");
			break;
		}case 5:{
			System.out.println("Friday");
			break;
		}case 6:{
			System.out.println("saturday");
			break;
		}case 7:{
			System.out.println("Sunday");
			break;
		}default :{
			System.out.println("Invalid in put");
			
		}
		
		}
	}

}

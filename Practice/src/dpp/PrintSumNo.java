package dpp;

public class PrintSumNo {

	public static void main(String[] args) {
		int sumO=0;
		int sumE=0;
		for(int i=1;i<=50;i++) {
			if(i%2!=0) {
			sumO=sumO+i;}
		//}else {
			//sumE=sumE+i;
		//}
		}
	System.out.println(" ");
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				sumE=sumE+i;
			}
		}
	System.out.println("sum of odd numbers "+sumO);
	System.out.println("sum of even numbers "+sumE);
	}
}

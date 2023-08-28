package dpp;

public class ReverseTable {
	public static void reverseTable(int num) {
		for(int i=10;i>=1;i--) {
			int table=i*num;
			System.out.println(table);
		}
		
	}

	public static void main(String[] args) {
		reverseTable(10);

	}

}

package dpp;

public class StringReverse {
	public static void reverseString(String str) {
		System.out.println("Original String  :  "+str);
		char ch[]=str.toCharArray();
		
		String rev="";
		for(int i= ch.length-1;i>=0;i--) {
			 rev+=ch[i];
		}System.out.println("Reverse string  :  "+rev);
	}

	
	public static void main(String[] args) {
		reverseString("abc");
		

	}

}

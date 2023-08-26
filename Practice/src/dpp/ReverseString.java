package dpp;

public class ReverseString {
	public  String reverseString(String str) {
		char ch[]=str.toCharArray();
			String rev="";
		for(int i=ch.length-1;i>=0;i--)
//			 rev=rev+ch[i];
		rev+=ch[i];
		System.out.println(""+rev);
		if(str.equals(rev))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not Palindrome");
		return rev;
		
	}


	public static void main(String[] args) {
		
		ReverseString re=new ReverseString();
		re.reverseString("down");
	
	
	}

}

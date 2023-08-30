package dpp;

public class Subclass extends Super {
	
//	public Subclass() {
//		System.out.println("Construtor from Subclass");
//	}
	public Subclass(int a) {
		
		//super(1000);
		//this();
		System.out.println("Construtor from Subclass parameter");
	}
	int a=100;
	void m1() {
		
		System.out.println("subclass Method 1");
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
	}
	void m1(int a) {
		super.m1();
		this.m1();
		System.out.println("subclass Method 2");
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println(a);
	}
	
	
	

	public static void main(String[] args) {
		Subclass sc=new Subclass(11);
		sc.m1(11);
	    //sc.m2(110);

	}

}

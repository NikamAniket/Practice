package dpp;

interface Parent {
	void m1();
//	{
//		System.out.println("m2 method from child class ");
//	}
}

interface Child {
 void m2() ;
// {
//		System.out.println("m1 method from parent class");
//
//	}

}

class ChildOfChild implements Parent, Child {

	 public void m1()
	{
		System.out.println("m2 method from child class ");
	}

	 public void m2() 
	 {
			System.out.println("m1 method from parent class");
		}
	void m3() {
		System.out.println(" m3 method from child class");
	}
}

public class SingleI {

	public static void main(String[] args) {

		ChildOfChild[] s = new ChildOfChild[2];
		{
			for (int i = 0; i < 2; i++) {
				s[i] = new ChildOfChild();
				s[i].m1();
				s[i].m2();
				s[i].m3();
			}
		}
	}

}

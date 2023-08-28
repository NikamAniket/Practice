package dpp;

public class TriangleNotion {
	int a;int b;
	public TriangleNotion(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public int area() {
		int area=a*b;
		return area;
	}
	
	
	
	
	
	
	
	
//	public void area(int a,int b,int c) {
//		int area=a+b+c/2;
//		System.out.println("Is the area of the triangle  : "+area);
//	
//
//		int pere=a+b+c;
//		System.out.println("Is the perimeter  of the triangle  : "+pere);
//	}
	public static void main(String[] args) {
	TriangleNotion t=new TriangleNotion(4, 5);
//		t.area(3,4,5);
	int res=t.area();
	System.out.println(res);
	TriangleNotion t1=new TriangleNotion(5,8 );
	int res1=t1.area();
	System.out.println(res1);
	}

}

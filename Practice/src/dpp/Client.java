package dpp;


class Client extends Store{
	

	void m1() {System.out.println("This is the M1 method from child class");
		
	}




public static void main(String[] args) {

	
	Store ss=new Store();
	ss.m1();
	Client cc=new Client();
	cc.m1();

	
}


}

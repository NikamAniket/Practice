package dpp;

class Game {
	Game() {
		System.out.println("Default construtor of the Game Class");
		
	}Game(int a) {
		System.out.println("Default construtor of the Game int Class");

	}
	void m1() 
	{
	
		
		System.out.println("M1 method of parent class");
	}
	void m2() {
		System.out.println("M2 method of parent class");
	}

}

class Boardgame extends Game {
	Boardgame() {
		//super(1);
		System.out.println("Default construtor of the Boardgame Class");
	}Boardgame(int a) {
		System.out.println("Default construtor of the Boardgame Class");
	}
	void m3() {
		
	//	super.;
		//this();
		System.out.println("M3 method of the child class ");
	}
}

class Chess extends Boardgame {
	public Chess() {
		System.out.println("Default construtor of the Chess");
	}
}

public class GameDemo {

	public static void main(String[] args) {
		Chess ch = new Chess();
		ch.m3();
	}
}
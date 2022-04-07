package com.abst1;
class Example11
{
	void display()
	{
		System.out.println("Hello Students");
	}
}

public class Test1 extends Example11 {
	void display()
	{
		
		System.out.println("Welcome to C2TC");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Test1 e=new Test1();
		e.display();


	}

}

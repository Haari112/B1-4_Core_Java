package com.abst;
class A
{
	String name="Harish";
}
class B extends A
{
	String name="Hari Gowda";
	void print()
	{
		System.out.println("Hi i am "+name);
		System.out.println("Hi i am "+super.name);
	}
}
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			B b=new B();
			b.print();
		}


	}

}

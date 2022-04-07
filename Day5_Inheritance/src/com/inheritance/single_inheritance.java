package com.inheritance;
class Parent
{
	void print()
	{
		System.out.println("Hello,This is Harish");
	}
}
class Child extends Parent
{
	void display()
	{
		System.out.println("Single Inheritance");
	}
}
class single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.display();
		c.print();
	}

}

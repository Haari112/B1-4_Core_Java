package com.inheritance;
class CellPhones
{
	void message()
	{
		System.out.println("Hi, Harish");
	}
	void call()
	{
		System.out.println("I am calling Harish");
	}
}
class SamsungGalaxym31 extends CellPhones
{
	void facelock()
	{
		System.out.println("Hi, FACElock");
	}
}
class OnePlus extends CellPhones
{
	void games()
	{
		System.out.println("PUBG");
	}
}
public class HierchicalInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OnePlus o=new OnePlus();
		o.games();
		o.message();
		o.call();
		SamsungGalaxym31 m=new SamsungGalaxym31();
		m.facelock();

	}

}

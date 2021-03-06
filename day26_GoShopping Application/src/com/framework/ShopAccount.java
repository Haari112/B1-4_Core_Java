package com.framework;

public abstract class ShopAccount {
	private int accNo;
	private String accNm;
	private float charges;
	public ShopAccount(int accNo, String accNm, float charges) {
		
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	abstract public void bookProduct(float charges);
	 public void items(float charges) {
		 System.out.println(charges);
	 }
	 
	 
	public String getAccNm() {
		return accNm;
	}
	public int getAccNo() {
		return accNo;
	}
	public float getCharges() {
		return charges;
	}
	public float getCharge() {
		return charges;
	}
	@Override
	public String toString() {
		return String.format("ShopAcc [accNo=%s, accNm=%s, charges=%s]", accNo, accNm, charges);
	}
	
	

}
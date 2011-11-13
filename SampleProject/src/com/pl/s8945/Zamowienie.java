package com.pl.s8945;

public class Zamowienie {

	private String numer;
	private String towar;
	
	public Zamowienie(String numer, String towar)
	{
		this.numer=numer;
		this.towar=towar;
	}

	public void printZamowienie()
	{
		System.out.println("Zamowienie: " + numer +" Towar: "+ towar);
	}
	
	public String getZamowienie()
	{
		return this.numer;
	}
	
	public void setZamowienie(String numer)
	{
		this.numer=numer;
	}
	
	public String getTowar()
	{
		return this.towar;
	}
	
	public void setTowar(String towar)
	{
		this.towar=towar;
	}
	
}

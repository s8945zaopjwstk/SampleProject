package com.pl.s8945;

import java.util.ArrayList;
import java.util.List;

public class Klient {

	public String nazwa;
	
	public List<Zamowienie> towary= new ArrayList<Zamowienie>();
	
	public Klient(String nazwa, List<Zamowienie> towary)
	{
		this.nazwa=nazwa;
		this.towary=towary;
	}
	
	public void printTowary()
	{
		for(Zamowienie c : towary)
		{
			c.printZamowienie();
		}
	}
	
}

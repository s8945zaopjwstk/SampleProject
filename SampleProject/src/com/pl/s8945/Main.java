package com.pl.s8945;

import java.util.ArrayList;
import java.util.List;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Zamowienie> towary= new ArrayList<Zamowienie>();
		
		towary.add(new Zamowienie("zam_1","towar_1"));
		towary.add(new Zamowienie("zam_1","towar_2"));
		towary.add(new Zamowienie("zam_1","towar_3"));
		
		Klient z=new Klient("kl_1",towary);
		
		z.printTowary();
		
	}

}

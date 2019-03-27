package it.polito.tdp.Libretto;

import java.util.ArrayList;
import java.util.List;

public class Libretto {
	
	private List <Voto> voti; 
	
	public Libretto() {
		this.voti=new ArrayList <Voto>(); 
	}
	
	/*
	 * public void add(int voto, String corso, LocalDate data) {}
	 * sbagliato perchè più complicato se un giorno la struttura della classe Voto viene modificata */ 
	
	/**
	 * Aggiunge un nuovo voto al libretto
	 * @param v il {@link Voto} da aggiungere 
	 */
	
	public void add (Voto v) {
		voti.add(v); 
	}

}

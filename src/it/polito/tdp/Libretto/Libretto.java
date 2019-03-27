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
	 * 
	 * sbagliato perchè più complicato se un giorno la struttura della classe Voto viene modificata 
	 */ 
	
	/**
	 * Aggiunge un nuovo voto al libretto
	 * @param v il {@link Voto} da aggiungere 
	 */
	
	public void add (Voto v) {
		voti.add(v); 
	}
	
	/*
	 * public void StampaVoti(int voto){}
	 * 
	 * public String StampaVoti2 (int voto){}
	 * 
	 * non vanno bene perchè non so cosa voglio vedere nell'interfaccia grafica
	 */
	
	/**
	 * Seleziona il sottoinsieme di voti che hanno il punteggio specificato
	 * @param voto punteggio da ricercare
	 * @return lista di {@link Voto} aventi quel punteggio (eventualmente vuota)
	 */
	
	public List <Voto> cercaVoti (int voto){
		List <Voto> result= new ArrayList <Voto> (); 
		for(Voto v:this.voti) {
			if(v.getPunti()==voto) {
				result.add(v); 
			}
		}
		return result; 
	}

	/**
	 * Ricerca un {@link Voto} relativo al corso di cui è specificato il nome
	 * @param nome Esame nome del corso da ricercare
	 * @return il {@link Voto} corrispondente, oppure {@code null} se non esistente
	 */
	public Voto cercaEsame(String nomeEsame) {
		for(Voto v:this.voti) {
			if(v.getCorso().equals(nomeEsame)) {	//con == viene confrontata la posizione in memoria dei due oggetti,
				return v; 							//compareTo lo uso solo quando gli oggetti che sono confrontati sono ordinabili
			}
		}
		return null; 
	}
}

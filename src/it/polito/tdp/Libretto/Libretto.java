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
		
		/*for(Voto v:this.voti) {
			if(v.getCorso().equals(nomeEsame)) {	//con == viene confrontata la posizione in memoria dei due oggetti,
				return v; 							//compareTo lo uso solo quando gli oggetti che sono confrontati sono ordinabili
			}
		}*/ 
		
		Voto voto=new Voto(0, nomeEsame, null); 	//abbiamo costruito il metodo equals solo per il nome del corso
		int pos=this.voti.indexOf(voto); 			//in questo modo quando cerco la posizione dell'esame cercato nell'array, considero solo 
													//il campo relativo al nome del corso, fa niente se gli altri campi sono 0 o null
		if(pos==-1)
			return null;
		else 
			return this.voti.get(pos); 
	}
	
	/**
	 * Dato un {@link Voto} determina se esiste già un voto con uguale vorso ed uguale punteggio
	 * @param v
	 * @return 	{@code true} se ha trovato un corso e punteggio uguali, 
	 * 			{@code false} se non ha trovato il corso, oppure l'ha trovato con un voto diverso
	 */
	public boolean esisteGiaVoto(Voto v) {
		
		/* 
		 * int pos=this.voti.indexOf(v);
		 * if(pos==-1)
		 *	 return false; 
		 * else {
		 *	 return (v.getPunti()==this.voti.get(pos).getPunti()); 
		 * }
		 * */
		
		Voto trovato=this.cercaEsame(v.getCorso()); 
		if(trovato==null)
			return false; 
		if(trovato.getPunti()==v.getPunti()) {
			return true; 
		} else {
			return false; }
		}
		
	}


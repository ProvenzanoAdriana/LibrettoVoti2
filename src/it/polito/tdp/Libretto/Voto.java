package it.polito.tdp.Libretto;

import java.time.LocalDate;

public class Voto{
	private int punti;  
	private String corso; 
	private LocalDate data; 	// altre classi per gestire le date Date, Calendar
	
	public int getPunti() {
		return punti;
	}
	
	public Voto(int voto, String corso, LocalDate data) {
		super();
		this.punti = voto;
		this.corso = corso;
		this.data = data;
	}

	public void setPunti(int voto) {
		this.punti = voto;
	}
	
	public String getCorso() {
		return corso;
	}
	
	public void setCorso(String corso) {
		this.corso = corso;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return String.format("Voto [punti=%s, corso=%s, data=%s]", punti, corso, data);
	}


	
	
	
	
	
}
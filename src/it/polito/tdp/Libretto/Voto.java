package it.polito.tdp.Libretto;

import java.time.LocalDate;

public class Voto{
	private int voto; 
	private String corso; 
	private LocalDate data; 	// altre classi per gestire le date Date, Calendar
	public int getVoto() {
		return voto;
	}
	
	public Voto(int voto, String corso, LocalDate data) {
		super();
		this.voto = voto;
		this.corso = corso;
		this.data = data;
	}

	public void setVoto(int voto) {
		this.voto = voto;
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
		return String.format("Voto [voto=%s, corso=%s, data=%s]", voto, corso, data);
	}
	
	
	
	
	
}
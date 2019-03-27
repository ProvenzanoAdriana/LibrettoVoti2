package it.polito.tdp.Libretto;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto {

	public static void main(String[] args) {
		Libretto libr=new Libretto(); 
		
		libr.add(new Voto(26, "Informatica", LocalDate.of(2017, 01, 15)));
		libr.add(new Voto(19, "Analisi I", LocalDate.of(2017, 02, 15)));
		libr.add(new Voto(22, "Geometria", LocalDate.of(2017, 03, 15)));
		libr.add(new Voto(22, "Chimica", LocalDate.of(2017, 04, 15)));
		libr.add(new Voto(30, "Basi di dati", LocalDate.of(2018, 01, 15)));
		libr.add(new Voto(20, "Fisica I", LocalDate.of(2018, 02, 15)));
		libr.add(new Voto(22, "Sistemi di produzione", LocalDate.of(2018, 03, 15)));
		libr.add(new Voto(25, "Ricerca Operativa", LocalDate.of(2018, 04, 15)));
		libr.add(new Voto(20, "Analisi II", LocalDate.of(2018, 05, 15)));
		libr.add(new Voto(30, "Programmazione ad oggetti", LocalDate.of(2018, 06, 15)));
		
		List<Voto> trenta=libr.cercaVoti(30); 
		System.out.println(trenta);
		
		//in tutto nel nostro programma abbiamo 10 (Non 13!!) oggetti di tipo Voto

	}

}

package it.polito.tdp.librettovoti.model;

import java.util.*;

public class Libretto {

	private List<Voto> voti;

	public Libretto() {
		this.voti = new ArrayList<>();
	}

	public void add(Voto v){
		this.voti.add(v);
	}
	
	/*bleah
	 * 
	public void stampaVotiUguali(int punteggio) {
		// il libretto stampa da solo i voti
		System.out.println();
	}
	
	public String votiUguali(int punteggio) {
		//calcola una stringa che contiene i voti 
		//sarà poi il chiamante a stamparli
		// -> Solo il NOME?
		// -> Tutto il voto.toString()?	
	}
	*/
	
	public List<Voto> listaVotiUguali(int punteggio){
		//restituisce solo i voti uguali al criterio
		List<Voto> risultato = new ArrayList<>();
		for(Voto v : this.voti) {
			if(v.getVoto() == punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
	}
	
	/*TODO
	public Libretto votiUguali(int punteggio) {
		
	}
	*/
	
	public String toString() {
		return this.voti.toString();
	}

}

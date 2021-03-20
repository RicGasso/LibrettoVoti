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
	
	
	public Libretto votiUguali(int punteggio) {
		Libretto risultato = new Libretto();
		for(Voto v : this.voti) {
			if(v.getVoto() == punteggio) {
				risultato.add(v);
				//risultato.voti.add(v);
			}
		}
		return risultato;
	}
	/**
	 * Ricerca un Voto del corso di cui è specificato il nome
	 * Se il corso non esiste, restituisce null.
	 * @param nomeCorso
	 * @return
	 */
	public Voto ricercaVoto(String nomeCorso) {
		Voto risultato = null;
		for(Voto v : this.voti) {
			if(v.getNome().equals(nomeCorso)) {
				risultato = v;
				break;
			}
		}
		return risultato;
	}

	/**
	 * Verifica se nel libretto c'è già un voto con lo stesso esame e la stessa valutazione
	 * @param v
	 * @return
	 */
	public boolean esisteDuplicatoVoto(Voto v) {
		boolean trovato = false;
		for(Voto voto: this.voti) {
			if(voto.getNome().equals(v.getNome()) && voto.getVoto()==v.getVoto()) {
				trovato = true;
				break;
			}
		}
		return trovato;
	}
	
	
	/**
	 * Verifica se nel libretto c'è già un voto per lo stesso esame ma con valutazione diversa
	 * @param v
	 * @return
	 */
	public boolean esisteConflittoVoto(Voto v) {
		boolean trovato = false;
		for(Voto voto: this.voti) {
			if(voto.getNome().equals(v.getNome()) && voto.getVoto()!=v.getVoto()) {
				trovato = true;
				break;
			}
		}
		return trovato;
	}
	
	public String toString() {
		return this.voti.toString();
	}

}

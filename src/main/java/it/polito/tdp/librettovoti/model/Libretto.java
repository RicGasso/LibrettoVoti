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
	
	public String toString() {
		return this.voti.toString();
	}

}

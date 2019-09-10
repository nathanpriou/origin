package edu.models;

import java.util.ArrayList;
import java.util.List;

public class Preference {
	private String nom;
	private Object valeur;
	
	public Preference(String name, Object value) {
		nom = name;
		valeur = value;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Object getValeur() {
		return valeur;
	}

	public void setValeur(Object valeur) {
		this.valeur = valeur;
	}
	
	public static List<Preference> getDefault(){
		List<Preference> prefs = new ArrayList<>();
		prefs.add(new Preference("admin", true));
		prefs.add(new Preference("bgColor", "black"));
		
		// = return prefs=Arrays.asList(new Preference("admin", true), new Preference("bgColor", "black"));
		return prefs;
	}
}

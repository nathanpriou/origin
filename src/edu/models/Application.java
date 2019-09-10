package edu.models;

import java.util.ArrayList;
import java.util.List;

public class Application {
	public static Application instance;
	private List<Utilisateur> utilisateurs;
	private List<Groupe> groupes;
	
	
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public List<Groupe> getGroupes() {
		return groupes;
	}

	public Application () {
		utilisateurs = new ArrayList<>();
		groupes = new ArrayList<>();
	}
	
	/**
	 * Ajoute des utilisateurs et des groupes à une nouvele instance d'application
	 */
	public static Application create() {
		Application app = new Application();
		app.addUsers("zorro","bernardo","garcia","jolly jumper","rantanplan");
		app.addGroupes("Animaux","Héros");
		return app;
	}
	
	private void addUsers(String...userNames) {
		for (String name:userNames) {
			utilisateurs.add(new Utilisateur(name));
		}
	}
	
	private void addGroupes(String...groupNames) {
		for (String name:groupNames) {
			groupes.add(new Groupe(name));
		}
	}
	@Override
	public String toString() {
		return "Application [utilisateurs=" + utilisateurs + ", groupes=" + groupes + "]";
	}
	
	
}

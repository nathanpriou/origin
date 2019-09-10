/**
 * 
 */
package edu.models;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author priou
 *
 */
public class Utilisateur {
	
	private String login;
	private String password;
	private int age;
	private List<Groupe> groupes;
	private List<Connexion> connexions;
	private List<Preference> prefs;
	
	public Utilisateur(String login) {
		this.login = login;
		connexions = new ArrayList<>();
		groupes = new ArrayList<>();
		prefs = Preference.getDefault();
		}
	/**
	 * Méthode post connexion de l'utilisateur à l'application
	 * Ajoute une instance de connexion dans les connexions de l'utilisateur 
	 */
	public void postLogin() {
		
		try {
			connexions.add(new Connexion(this));
		}
		catch (UnknownHostException e) {
			System.out.println("Problème(s) de connexion.");
		}
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	/**
	 * Ajoute à l'utilisateur en cours au groupe de nom nomGroupe
	 */
	public boolean addToGroup(String nomGroupe) {
			for (Groupe groupe:Application.instance.getGroupes()) {
			if(nomGroupe.equals(groupe.getNom()) && !groupes.contains(groupe)) {
				groupes.add(groupe);
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return login+connexions;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (0>=age && age<130) {
			this.age = age;
			}
	}
}
	
	



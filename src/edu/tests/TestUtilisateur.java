package edu.tests;

import edu.models.Utilisateur;

public class TestUtilisateur {

	public static void main(String[] args) {
		Utilisateur user = new Utilisateur("NATHAN");
		System.out.println(user.getLogin());
		user.setLogin("PRIOU");
		user.setAge(19);
		user.postLogin();
		System.out.println(user);
	}

}

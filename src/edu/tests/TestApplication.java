package edu.tests;

import edu.models.Application;

public class TestApplication {
	public static void main(String[] args) {
		Application.create();
		Application.instance.getUtilisateurs().get(0);
		System.out.println(Application.instance);
	}

}

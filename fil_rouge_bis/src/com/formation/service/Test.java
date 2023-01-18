package com.formation.service;

import java.util.ArrayList;

import com.formation.entities.Activite;

public class Test {

	public static void main(String[] args) {


		//pour tester
		ArrayList<Activite> activites = new ArrayList<>();

		Activite activite = new Activite("motocross", "bois de boulogne", "18/01/23","dfdf");
		/*Activite activite1 = new Activite("motocross", "bois de vincennes", "18/01/23");
		Activite activite2 = new Activite("motocross", "bois de cherbourg", "18/01/23");
		Activite activite3 = new Activite("motocross", "bois de gogo", "18/01/23");*/
		//liste avec unique élément

		activites.add(activite);

		ActiviteService activiteService = new ActiviteService();


		System.out.println(activiteService.listeActivite().get(0).toString());





}
}
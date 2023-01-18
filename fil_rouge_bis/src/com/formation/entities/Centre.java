package com.formation.entities;

import java.util.ArrayList;

public class Centre {

	private String nom;
	private String adresse;
	private String horaires;
	ArrayList<Activite> activites = new ArrayList<>();


	public Centre(String nom, String adresse, String horaires) {
		this.nom = nom;
		this.adresse = adresse;
		this.horaires = horaires;
	}


	public String getNom() {
		return this.nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getAdresse() {
		return this.adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getHoraires() {
		return this.horaires;
	}


	public void setHoraires(String horaires) {
		this.horaires = horaires;
	}


	@Override
	public String toString() {
		return "Centre [nom=" + nom + ", adresse=" + adresse + ", horaires=" + horaires + "]";
	}



}

package com.formation.entities;

import java.util.ArrayList;


public class Activite {

	private int id;
	private String nomActivite;
	private String lieuActivite;
	private String dateActivite;
	ArrayList<Centre> centre = new ArrayList<>();

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Activite(int id, String nomActivite, String lieuActivite, String dateActivite, ArrayList<Centre> centre) {
		super();
		this.id = id;
		this.nomActivite = nomActivite;
		this.lieuActivite = lieuActivite;
		this.dateActivite = dateActivite;
		this.centre = centre;
	}


	public Activite() {
		
	}

	
	public Activite(String nomActivite, String lieuActivite, String dateActivite) {
		super();
		this.nomActivite = nomActivite;
		this.lieuActivite = lieuActivite;
		this.dateActivite = dateActivite;
	}


	public Activite(String nomActivite, String lieuActivite, String dateActivite, ArrayList<Centre> centre) {
		super();
		this.nomActivite = nomActivite;
		this.lieuActivite = lieuActivite;
		this.dateActivite = dateActivite;
		this.centre = centre;
	}


	public String getNom() {
		return nomActivite;
	}


	public void setNom(String nom) {
		this.nomActivite = nom;
	}


	public String getLieu() {
		return this.lieuActivite;
	}


	public void setLieu(String lieu) {
		this.lieuActivite = lieu;
	}


	public String getDate() {
		return this.dateActivite;
	}


	public void setDate(String date) {
		this.dateActivite = date;
	}


	@Override
	public String toString() {
		return "Activite [nom=" + nomActivite + ", lieu=" + lieuActivite + ", date=" + dateActivite + "]";
	}


	/*public void ajouterPhotos() {

	}

	public void supprimerPhotos() {

	}

	public void ajouterDescription() {

	}

	public void supprimerDescription() {

	}

	public void ecrireCommentaire() {

	}

	public void supprimerCommentaire() {

	}

	public void afficherCommentaire() {

	}*/



}

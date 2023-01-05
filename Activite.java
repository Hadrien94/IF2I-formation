package fil_rouge;

import java.util.ArrayList;


public class Activite {
	
	private String nomActivite;
	private String lieuActivite;
	private String dateActivite;
	ArrayList<Centre> centre = new ArrayList<Centre>();	
	
	
	public Activite(String nom, String prenom, String lieu, String date) {
		this.nomActivite = nom;
		this.lieuActivite = lieu;
		this.dateActivite = date;
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
	
	
	public void ajouterPhotos() {
		
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
		
	}
	
	

}

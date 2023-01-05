package fil_rouge;

import java.util.ArrayList;

public class Gerant {
	
	private String nom;
	private String prenom;
	private String adresse;
	private String dateNaissance;
	private Centre centre;	
	
	public Gerant(String nom, String prenom, String adresse, String dateNaissance) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.dateNaissance = dateNaissance;
	}


	public String getNom() {
		return this.nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return this.prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getAdresse() {
		return this.adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public String getDateNaissance() {
		return this.dateNaissance;
	}


	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}


	@Override
	public String toString() {
		return "Gerant [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", dateNaissance=" + dateNaissance
				+ "]";
	}
	
	
	
	public void supprimerUtilisateur() {
		
	}

}

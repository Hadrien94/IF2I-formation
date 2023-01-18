package fil_rouge;

import java.util.ArrayList;


public class Catalogue {
	
	private int idActivite;
	private String typeActivite;
	ArrayList<Activite> activites = new ArrayList<Activite>();
	
	public Catalogue(int idActivite, String typeActivite) {
		this.idActivite = idActivite;
		this.typeActivite = typeActivite;
		
	}

	
	
	public int getIdActivite() {
		return this.idActivite;
	}


	public void setIdActivite(int idActivite) {
		this.idActivite = idActivite;
	}


	public String getTypeActivite() {
		return this.typeActivite;
	}


	public void setTypeActivite(String typeActivite) {
		this.typeActivite = typeActivite;
	}


	@Override
	public String toString() {
		return "Catalogue [idActivite=" + idActivite + ", typeActivite=" + typeActivite + "]";
	}
	
	
	public void ajouterActivite() {
		
	}
	
	public void modifierActivite() {
		
	}
	
	public void supprimerActivite() {
		
	}
	
	public void rechercherActivite() {
		
	}
	
	public void consulterAtcivite() {
		
	}
	
	public void ajouterOffrePromotionnelle() {
		
	}
	
	public void modifierOffrePromotionnelle() {
		
	}
	
	public void supprimerOffrePromotionnelle() {
		
	}
	
	public void creerFiltres() {
		
	}
	
	public void supprimerFiltres() {
		
	}
	
	
	

}

package fil_rouge;

public class Client {
	
	private int idClient;
	private String nom;
	private String prenom;
	private String dateNaisasnce;
	
	
	public Client(int idClient, String nom, String prenom, String dateNaisasnce) {
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaisasnce = dateNaisasnce;
	}


	public int getIdClient() {
		return this.idClient;
	}


	public void setIdClient(int idClient) {
		this.idClient = idClient;
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


	public String getDateNaisasnce() {
		return this.dateNaisasnce;
	}


	public void setDateNaisasnce(String dateNaisasnce) {
		this.dateNaisasnce = dateNaisasnce;
	}


	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", dateNaisasnce="
				+ dateNaisasnce + "]";
	}
	
	
	public void modifierActivite() {
		
	}
	
	public void annulerActivite() {
		
	}
	
	public void supprimerCompte() {
		
	}
	

}

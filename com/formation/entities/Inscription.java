package fil_rouge;

import java.util.ArrayList;

public class Inscription {
	
	private String dateAjout;
	private String dateModification;
	private Gerant gerant;
	ArrayList<Client> clients = new ArrayList<Client>();

	
	public Inscription(String dateAjout, String dateModification) {
		this.dateAjout = dateAjout;
		this.dateModification = dateModification;
	}


	public String getDateAjout() {
		return this.dateAjout;
	}


	public void setDateAjout(String dateAjout) {
		this.dateAjout = dateAjout;
	}


	public String getDateModification() {
		return this.dateModification;
	}


	public void setDateModification(String dateModification) {
		this.dateModification = dateModification;
	}


	@Override
	public String toString() {
		return "Inscription [dateAjout=" + dateAjout + ", dateModification=" + dateModification + "]";
	}
	
	
	

}

package fil_rouge;

import java.util.ArrayList;

public class Reservation {
	
	private int idReservation;
	private String dateReservation;
	private String lieuReservation;
	ArrayList<Activite> activites = new ArrayList<Activite>();
	ArrayList<Client> clients = new ArrayList<Client>();
	
	
	public Reservation(int idReservation, String dateReservation, String lieuReservation) {
		this.idReservation = idReservation;
		this.dateReservation = dateReservation;
		this.lieuReservation = lieuReservation;
	}


	public int getIdReservation() {
		return this.idReservation;
	}


	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}


	public String getDateReservation() {
		return this.dateReservation;
	}


	public void setDateReservation(String dateReservation) {
		this.dateReservation = dateReservation;
	}


	public String getLieuReservation() {
		return this.lieuReservation;
	}


	public void setLieuReservation(String lieuReservation) {
		this.lieuReservation = lieuReservation;
	}


	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", dateReservation=" + dateReservation
				+ ", lieuReservation=" + lieuReservation + "]";
	}
	
	public void creeReservation() {
		
	}
	
	public void modifierReservation() {
		
	}
	
	public void supprimerReservation() {
		
	}

}

package metier;

import java.time.LocalDate;

public class Client {
	
	private String nomClt;
	private String prenomClt;
	private LocalDate dateArrive;
	private int dureeArrive;
	
	public Client(String nomClt, String prenomClt, LocalDate dateArrive, int dureeArrive) {
		super();
		this.nomClt = nomClt;
		this.prenomClt = prenomClt;
		this.dateArrive = dateArrive;
		this.dureeArrive = dureeArrive;
	}

	public String getNomClt() {
		return nomClt;
	}

	public void setNomClt(String nomClt) {
		this.nomClt = nomClt;
	}

	public String getPrenomClt() {
		return prenomClt;
	}

	public void setPrenomClt(String prenomClt) {
		this.prenomClt = prenomClt;
	}

	public LocalDate getDateArrive() {
		return dateArrive;
	}

	public void setDateArrive(LocalDate dateArrive) {
		this.dateArrive = dateArrive;
	}

	public int getDureeArrive() {
		return dureeArrive;
	}

	public void setDureeArrive(int dureeArrive) {
		this.dureeArrive = dureeArrive;
	}

	@Override
	public String toString() {
		return "Client [nomClt=" + nomClt + ", prenomClt=" + prenomClt + ", dateArrive=" + dateArrive + ", dureeArrive="
				+ dureeArrive + "]";
	}
	
	

}

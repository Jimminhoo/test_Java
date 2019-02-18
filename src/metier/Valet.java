package metier;

public class Valet {

	private String nomVal;
	private String prenomVal;
	private int ageVal ;
	private int idVal;
	
	public Valet(String nomVal, String prenomVal, int ageVal, int idVal) {
		this.nomVal = nomVal;
		this.prenomVal = prenomVal;
		this.ageVal = ageVal;
		this.idVal = idVal;
	}

	public String getNomVal() {
		return nomVal;
	}

	public String getPrenomVal() {
		return prenomVal;
	}

	public int getAgeVal() {
		return ageVal;
	}

	public int getIdVal() {
		return idVal;
	}

	public void setNomVal(String nomVal) {
		this.nomVal = nomVal;
	}

	public void setPrenomVal(String prenomVal) {
		this.prenomVal = prenomVal;
	}

	public void setAgeVal(int ageVal) {
		this.ageVal = ageVal;
	}

	public void setIdVal(int idVal) {
		this.idVal = idVal;
	}
}

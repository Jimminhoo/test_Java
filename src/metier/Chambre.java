package metier;

public class Chambre {
	
	//Déclaration des variables
	private int numChambre;
	private int etage;
	private int superficie;
	private String nomClt;
	private int idVal;
	
	//Constructeur
	public Chambre(int numChambre, int etage, int superficie, String nomClt, int idVal) {
		this.numChambre = numChambre;
		this.etage = etage;
		this.superficie = superficie;
		this.nomClt = nomClt;
		this.idVal = idVal;
	}
	
	//Getters et setters
	/**
	 * @return the numChambre
	 */
	public int getNumChambre() {
		return numChambre;
	}
	/**
	 * @param numChambre the numChambre to set
	 */
	private void setNumChambre(int numChambre) {
		this.numChambre = numChambre;
	}
	/**
	 * @return the etage
	 */
	public int getEtage() {
		return etage;
	}
	/**
	 * @param etage the etage to set
	 */
	private void setEtage(int etage) {
		this.etage = etage;
	}
	/**
	 * @return the superficie
	 */
	public int getSuperficie() {
		return superficie;
	}
	/**
	 * @param superficie the superficie to set
	 */
	private void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	/**
	 * @return the nomClt
	 */
	public String getNomClt() {
		return nomClt;
	}
	/**
	 * @param nomClt the nomClt to set
	 */
	private void setNomClt(String nomClt) {
		this.nomClt = nomClt;
	}
	/**
	 * @return the idVal
	 */
	public int getIdVal() {
		return idVal;
	}
	/**
	 * @param idVal the idVal to set
	 */
	private void setIdVal(int idVal) {
		this.idVal = idVal;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " La chambre " + numChambre + ", à l'étage " + etage + 
				", d'une superficie de " + superficie + " mètres carré, est occupé par "
				+ nomClt + ". Elle sera préparée par le valet numéro " + idVal + ".";
	}
	
	
	
	

}

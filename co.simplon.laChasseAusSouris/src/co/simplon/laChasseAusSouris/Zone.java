package co.simplon.laChasseAusSouris;

public class Zone {
	
	private int nombreDeSouris;
	private String nom;
	
	
	
	
	public int getNombreDeSouris() {
		return nombreDeSouris;
	}
	public void setNombreDeSouris(int nombreDeSouris) {
		this.nombreDeSouris = nombreDeSouris;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public Zone() {
		
	}
	
	public Zone (String nom) {
		super();
		this.nom = nom;
	}
	public Zone(int nombreDeSouris) {
		super();
		this.nombreDeSouris = nombreDeSouris;
	}
	
	

}

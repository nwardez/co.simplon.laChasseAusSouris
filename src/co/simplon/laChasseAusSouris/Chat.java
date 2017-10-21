package co.simplon.laChasseAusSouris;

public class Chat {
	
	private String nom;
	private int age;
	private int nombreDeSourisAttrapees;
	private Zone zone;
	
	
	public Chat(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
		
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getNombreDeSourisAttrapees() {
		return nombreDeSourisAttrapees;
	}


	public void setNombreDeSourisAttrapees(int nombreDeSourisAttrapees) {
		this.nombreDeSourisAttrapees = nombreDeSourisAttrapees;
	}


	public Zone getZone() {
		return zone;
	}


	public void setZone(Zone zone) {
		this.zone = zone;
	}

}

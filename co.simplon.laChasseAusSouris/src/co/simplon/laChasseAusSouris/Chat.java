package co.simplon.laChasseAusSouris;

import java.util.ArrayList;

public class Chat {
	
	private String nom;
	private int age;
	private int nombreDeSourisAttrapees;
	private int tableauDeChasse;
	private Zone zone;
	private int ordreDePassage;
	private ArrayList<Chat> listeDesChats = new ArrayList<Chat>();
	
	
	public Chat(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
		
		// Ajout des chats à la liste des chats au moment de leurs créations
		this.getListeDesChats().add(this);
		
	}
	
	private int  calculHandicap() {
		int result = 0;
		int alea = (int)(Math.random() * 16 + 15);
		
		if ( this.getAge() < 3 ) {
			result = alea / 4;
		} else if (this.getAge() > 10) {
			result = alea / 3;
		} else {
			result = alea / 3;
		}
		
		return result;
		
	}
	
	public void attraperSouris(Zone zone) {
		
		// nombres de souris attrapées par le chat
		// on vérifie qu'il reste assez de souris à attraper dans la Zone
		if (this.calculHandicap() <= zone.getNombreDeSouris()) {
			this.setNombreDeSourisAttrapees(this.calculHandicap());
		} else {
			this.setNombreDeSourisAttrapees(zone.getNombreDeSouris());
		}
		
		// on décrémente le nombre de souris restant dans la zone
		zone.setNombreDeSouris(zone.getNombreDeSouris() - this.getNombreDeSourisAttrapees());
		this.setTableauDeChasse(this.getTableauDeChasse() + this.getNombreDeSourisAttrapees());
	}
	
	public void rapportDeFinDeJournée () {
		
		System.out.println(this.getNom() + " donne son rapport: " + this.getNombreDeSourisAttrapees() + " souris attrapées dans la " + this.getZone().getNom() );
		
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


	public int getOrdreDePassage() {
		return ordreDePassage;
	}


	public void setOrdreDePassage(int ordreDePassage) {
		this.ordreDePassage = ordreDePassage;
	}

	public ArrayList<Chat> getListeDesChats() {
		return listeDesChats;
	}

	public void setListeDesChats(ArrayList<Chat> listeDesChats) {
		this.listeDesChats = listeDesChats;
	}

	public int getTableauDeChasse() {
		return tableauDeChasse;
	}

	public void setTableauDeChasse(int tableauDeChasse) {
		this.tableauDeChasse = tableauDeChasse;
	}

}

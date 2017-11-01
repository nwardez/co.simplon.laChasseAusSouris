package co.simplon.laChasseAusSouris;

public class Main {
	
	//Création de la ferme
	static Ferme laFermeDeRobert = new Ferme();
	
	//Création du fermier
	static Fermier robert = new Fermier();
	
	//Création des 4 zones 
	static Zone zoneA = new Zone("Zone A");
	static Zone zoneB = new Zone("Zone B");
	static Zone zoneC = new Zone("Zone C");
	static Zone zoneD = new Zone("Zone D");
	
	//Création des 5 chats (paramètres NOM, AGE)
	static Chat chat1 = new Chat("Nemo", 5);
	static Chat chat2 = new Chat("Garfield", 1);
	static Chat chat3 = new Chat("Fripouille", 15);
	static Chat chat4 = new Chat("Lulu", 2);
	static Chat chat5 = new Chat("Mimine", 7);
	
	 

	public static void main(String[] args) {
		
		System.out.println("**********************************************");
		System.out.println("********    DEBUT DE LA CHASSE    ************");
		System.out.println("**********************************************");
		
		laFermeDeRobert.initialiserLesSourisDansLesZones(1500, zoneA, zoneB, zoneC, zoneD);
		laFermeDeRobert.setNombreDeJours(0);
		
		System.out.println("Répartition initiale des souris par zones");
		System.out.println("=========================================");
		System.out.println(zoneA.getNom() + ": " + zoneA.getNombreDeSouris() + " souris.");
		System.out.println(zoneB.getNom() + ": " + zoneB.getNombreDeSouris() + " souris.");
		System.out.println(zoneC.getNom() + ": " + zoneC.getNombreDeSouris() + " souris.");
		System.out.println(zoneD.getNom() + ": " + zoneD.getNombreDeSouris() + " souris.");
		System.out.println("                                                 ");
		
		while (!laFermeDeRobert.verifierLaFinDuJeu()) {
		laFermeDeRobert.setNombreDeJours(laFermeDeRobert.getNombreDeJours() + 1);
		robert.RepartirLesChatsDansLesZones(chat1, zoneA, zoneB, zoneC, zoneD);
		robert.RepartirLesChatsDansLesZones(chat2, zoneA, zoneB, zoneC, zoneD);
		robert.RepartirLesChatsDansLesZones(chat3, zoneA, zoneB, zoneC, zoneD);
		robert.RepartirLesChatsDansLesZones(chat4, zoneA, zoneB, zoneC, zoneD);
		robert.RepartirLesChatsDansLesZones(chat5, zoneA, zoneB, zoneC, zoneD);
		
		System.out.println("                                         ");
		System.out.println("Robert répartit ses chats dans les zones:");
		System.out.println("=======================================");
		System.out.println(chat1.getNom() + " part chasser dans la " + chat1.getZone().getNom());
		System.out.println(chat2.getNom() + " part chasser dans la " + chat2.getZone().getNom());
		System.out.println(chat3.getNom() + " part chasser dans la " + chat3.getZone().getNom());
		System.out.println(chat4.getNom() + " part chasser dans la " + chat4.getZone().getNom());
		System.out.println(chat5.getNom() + " part chasser dans la " + chat5.getZone().getNom());
		
		
		
		
		//robert.assignerUnOrdreDePassageAuxChats(chat1, chat2, chat3, chat4, chat5);
		
		// ........................................A Refaire avec une boucle FOR
		
		chat1.attraperSouris(chat1.getZone());
		chat2.attraperSouris(chat2.getZone());
		chat3.attraperSouris(chat3.getZone());
		chat4.attraperSouris(chat4.getZone());
		chat5.attraperSouris(chat5.getZone());
		
		System.out.println("                              ");
		System.out.println("Rapport de fin de journée:");
		System.out.println("==========================");
		chat1.rapportDeFinDeJournée();
		chat2.rapportDeFinDeJournée();
		chat3.rapportDeFinDeJournée();
		chat4.rapportDeFinDeJournée();
		chat5.rapportDeFinDeJournée();
		// .........................................En utilisant les ArraysLists
		
		
		// Essai pour vérifier la fonction fin du jeu
		//System.out.println(robert.verifierLaFinDuJeu(laFermeDeRobert));
		
		laFermeDeRobert.lesSourisSeDeplacent(zoneA, zoneB, zoneC, zoneD, laFermeDeRobert);
		System.out.println("                                       ");
		System.out.println("Les souris se déplacent                ");
		System.out.println("======================");
		System.out.println("Il reste " + zoneA.getNombreDeSouris() + " souris dans la zone A");
		System.out.println("Il reste " + zoneB.getNombreDeSouris() + " souris dans la zone B");
		System.out.println("Il reste " + zoneC.getNombreDeSouris() + " souris dans la zone C");
		System.out.println("Il reste " + zoneD.getNombreDeSouris() + " souris dans la zone D");
		}
		System.out.println(laFermeDeRobert.getNombreDeJours() + " jours ont été nécessaires pour éradiquer toutes les souris");
		robert.decernerLesRecompenses(chat1, chat2, chat3, chat4, chat5);
		
	}

}

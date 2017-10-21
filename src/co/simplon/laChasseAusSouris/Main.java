package co.simplon.laChasseAusSouris;

public class Main {
	
	//Cr�ation de la ferme
	static Ferme laFermeDeRobert = new Ferme();
	
	//Cr�ation du fermier
	static Fermier robert = new Fermier();
	
	//Cr�ation des 4 zones avec constructeur sans param�tres
	static Zone zoneA = new Zone("Zone A");
	static Zone zoneB = new Zone("Zone B");
	static Zone zoneC = new Zone("Zone C");
	static Zone zoneD = new Zone("Zone D");
	
	//Cr�ation des 5 chats (param�tres NOM, AGE)
	static Chat chat1 = new Chat("Mimine", 3);
	static Chat chat2 = new Chat("Gardfield", 5);
	static Chat chat3 = new Chat("Princesse", 17);
	static Chat chat4 = new Chat("Lulu", 12);
	static Chat chat5 = new Chat("Ulysse", 4);
	
	 

	public static void main(String[] args) {
		
		System.out.println("**********************************************");
		System.out.println("********    DEBUT DE LA CHASSE    ************");
		System.out.println("**********************************************");
		
		laFermeDeRobert.initialiserLesSourisDansLesZones(1500, zoneA, zoneB, zoneC, zoneD);
		
		System.out.println("R�partition initiale des souris par zones");
		System.out.println("=========================================");
		System.out.println(zoneA.getNom() + ": " + zoneA.getNombreDeSouris() + " souris.");
		System.out.println(zoneB.getNom() + ": " + zoneB.getNombreDeSouris() + " souris.");
		System.out.println(zoneC.getNom() + ": " + zoneC.getNombreDeSouris() + " souris.");
		System.out.println(zoneD.getNom() + ": " + zoneD.getNombreDeSouris() + " souris.");
		System.out.println("                                                 ");
		
		robert.RepartirLesChatsDansLesZones(chat1, zoneA, zoneB, zoneC, zoneD);
		robert.RepartirLesChatsDansLesZones(chat2, zoneA, zoneB, zoneC, zoneD);
		robert.RepartirLesChatsDansLesZones(chat3, zoneA, zoneB, zoneC, zoneD);
		robert.RepartirLesChatsDansLesZones(chat4, zoneA, zoneB, zoneC, zoneD);
		robert.RepartirLesChatsDansLesZones(chat5, zoneA, zoneB, zoneC, zoneD);
		
		System.out.println("Robert r�partit ses chats dans les zones:");
		System.out.println("=======================================");
		System.out.println(chat1.getNom() + " part chasser dans la " + chat1.getZone().getNom());
		System.out.println(chat2.getNom() + " part chasser dans la " + chat2.getZone().getNom());
		System.out.println(chat3.getNom() + " part chasser dans la " + chat3.getZone().getNom());
		System.out.println(chat4.getNom() + " part chasser dans la " + chat4.getZone().getNom());
		System.out.println(chat5.getNom() + " part chasser dans la " + chat5.getZone().getNom());
		
		
		
		
		
	}

}

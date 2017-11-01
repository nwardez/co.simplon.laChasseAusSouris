package co.simplon.laChasseAusSouris;

import java.util.ArrayList;
import java.util.Collections;

public class Fermier {

	public void RepartirLesChatsDansLesZones (Chat chat, Zone zone1, Zone zone2, Zone zone3, Zone zone4) {
		
		int alea = (int)(Math.random() * 4 + 1);
		switch (alea) {
		case 1:
			chat.setZone(zone1);
			break;
		case 2:
			chat.setZone(zone2);
			break;
		case 3:
			chat.setZone(zone3);
			break;
		case 4:
			chat.setZone(zone4);
			break;
		}
	}
	
	public void decernerLesRecompenses(Chat chat1, Chat chat2, Chat chat3, Chat chat4, Chat chat5) {
		System.out.println(chat1.getNom() + " a attrapé " + chat1.getTableauDeChasse() + " souris");
		System.out.println(chat2.getNom() + " a attrapé " + chat2.getTableauDeChasse() + " souris");
		System.out.println(chat3.getNom() + " a attrapé " + chat3.getTableauDeChasse() + " souris");
		System.out.println(chat4.getNom() + " a attrapé " + chat4.getTableauDeChasse() + " souris");
		System.out.println(chat5.getNom() + " a attrapé " + chat5.getTableauDeChasse() + " souris");
		
	}
	
	public static ArrayList assignerUnOrdreDePassageAuxChats (Chat chat1, Chat chat2, Chat chat3, Chat chat4, Chat chat5) {
		ArrayList<Chat> monTab= new ArrayList<Chat>();
		monTab.add(chat1);
		monTab.add(chat2);
		monTab.add(chat3);
		monTab.add(chat4);
		monTab.add(chat5);
		
		Collections.shuffle(monTab);
		
		
		
		for (int i = 0; i < monTab.size(); i ++) {
			monTab.get(i).setOrdreDePassage(i + 1);
		}
		
		System.out.println("                                                ");
		System.out.println("Robert attribue un ordre de passage à ses chats:");
		System.out.println("================================================");
		
		for (int i = 0; i < monTab.size(); i ++) {
			System.out.println("numéro de passage pour " + monTab.get(i).getNom() + ": " + monTab.get(i).getOrdreDePassage());
			
		}
		return monTab;
	}
}

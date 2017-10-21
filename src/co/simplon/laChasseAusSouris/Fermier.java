package co.simplon.laChasseAusSouris;

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
}

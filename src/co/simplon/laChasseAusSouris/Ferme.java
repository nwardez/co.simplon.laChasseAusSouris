package co.simplon.laChasseAusSouris;

import java.util.ArrayList;

public class Ferme {
	
	private int nombreDeSourisTotal;
	private ArrayList<Integer> tableauDeSouris = new ArrayList<Integer>();
	
	// Répartition initiale des souris dans les differentes zones
	public void initialiserLesSourisDansLesZones (int nombreDeSourisInitial, Zone zone1, Zone zone2, Zone zone3, Zone zone4) {
		
		//int[] tableauRepartition = new int[4];
		
		for (int i = 0; i < nombreDeSourisInitial; i ++) {
			int alea = (int)(Math.random() * 4 + 1);
			//this.tableauDeSouris.add(alea);	
			switch (alea) {
			case 1:
				//tableauRepartition[0] ++;
				zone1.setNombreDeSouris(zone1.getNombreDeSouris() + 1);
				break;
			case 2:
				//tableauRepartition[1] ++;
				zone2.setNombreDeSouris(zone2.getNombreDeSouris() + 1);
				break;
			case 3:
				//tableauRepartition[2] ++;
				zone3.setNombreDeSouris(zone3.getNombreDeSouris() + 1);
				break;
			case 4:
				//tableauRepartition[3] ++;
				zone4.setNombreDeSouris(zone4.getNombreDeSouris() + 1);
				break;
			}
		}
		
	}
	
	public int getNombreDeSourisTotal() {
		return nombreDeSourisTotal;
	}
	public void setNombreDeSourisTotal(int nombreDeSourisTotal) {
		this.nombreDeSourisTotal = nombreDeSourisTotal;
	}
	public ArrayList<Integer> getTableauDeSouris() {
		return tableauDeSouris;
	}
	public void setTableauDeSouris(ArrayList<Integer> tableauDeSouris) {
		this.tableauDeSouris = tableauDeSouris;
	}

}

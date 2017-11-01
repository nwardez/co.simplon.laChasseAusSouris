package co.simplon.laChasseAusSouris;

import java.util.ArrayList;

public class Ferme {
	
	private int nombreDeSourisTotal;
	private ArrayList<Integer> tableauDeSouris = new ArrayList<Integer>();
	private int nombreDeJours;
	
public boolean verifierLaFinDuJeu () {
		
		if ( this.getNombreDeSourisTotal() <= 0 ) {
			return true;
		} else {
			return false;
		}
		
	}
	

// A REVOIR............................................................................................
	public void lesSourisSeDeplacent (Zone zone1, Zone zone2, Zone zone3, Zone zone4, Ferme ferme) {
		
		int temp1 = zone1.getNombreDeSouris();
		int temp2 = zone2.getNombreDeSouris();
		int temp3 = zone3.getNombreDeSouris();
		int temp4 = zone4.getNombreDeSouris();
		
		int temp1Final = 0;
		int temp2Final = 0;
		int temp3Final = 0;
		int temp4Final = 0;
		
		int temp1aReporter = 0;
		int temp2aReporter = 0;
		int temp3aReporter = 0;
		int temp4aReporter = 0;
		
		if (temp1 % 2 == 0) {
			temp1Final= temp1 / 2;
			temp1aReporter = temp1 - temp1Final;
		} else {
			temp1Final= (int)Math.round(temp1) / 2 + 1;
			temp1aReporter = temp1 - temp1Final;
		}
		
		if (temp2 % 2 == 0) {
			temp2Final= temp2 / 2;
			temp2aReporter = temp2 - temp2Final;
		} else {
			temp2Final= (int)Math.round(temp2) / 2 + 1;
			temp2aReporter = temp2 - temp2Final;
		}
		
		if (temp3 % 2 == 0) {
			temp3Final= temp3 / 2;
			temp3aReporter = temp3 - temp3Final;
		} else {
			temp3Final= (int)Math.round(temp3) / 2 + 1;
			temp1aReporter = temp3 - temp3Final;
		}
		
		if (temp4 % 2 == 0) {
			temp4Final= temp4 / 2;
			temp4aReporter = temp4 - temp4Final;
		} else {
			temp4Final= (int)Math.round(temp4) / 2 + 1;
			temp4aReporter = temp4 - temp4Final;
		}
		
		
		zone1.setNombreDeSouris(temp4aReporter + temp1Final);
		zone2.setNombreDeSouris(temp1aReporter + temp2Final);
		zone3.setNombreDeSouris(temp2aReporter + temp3Final);
		zone4.setNombreDeSouris(temp3aReporter + temp4Final);
		ferme.nombreDeSourisTotal = zone1.getNombreDeSouris() + zone2.getNombreDeSouris() + zone3.getNombreDeSouris() + zone4.getNombreDeSouris();
		
		
			}
	
	// Répartition initiale des souris dans les differentes zones
	public void initialiserLesSourisDansLesZones (int nombreDeSourisInitial, Zone zone1, Zone zone2, Zone zone3, Zone zone4) {
		
		
		this.setNombreDeSourisTotal(nombreDeSourisInitial);
		for (int i = 0; i < nombreDeSourisInitial; i ++) {
			int alea = (int)(Math.random() * 4 + 1);
			
			switch (alea) {
			case 1:
				zone1.setNombreDeSouris(zone1.getNombreDeSouris() + 1);
				break;
			case 2:
				zone2.setNombreDeSouris(zone2.getNombreDeSouris() + 1);
				break;
			case 3:
				zone3.setNombreDeSouris(zone3.getNombreDeSouris() + 1);
				break;
			case 4:
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

	public int getNombreDeJours() {
		return nombreDeJours;
	}

	public void setNombreDeJours(int nombreDeJours) {
		this.nombreDeJours = nombreDeJours;
	}

}

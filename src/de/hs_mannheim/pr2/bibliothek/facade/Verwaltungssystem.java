package de.hs_mannheim.pr2.bibliothek.facade;

import java.util.HashMap;

import de.hs_mannheim.pr2.bibliothek.domain.medien.Medium;

public class Verwaltungssystem {
    private HashMap<Integer, Medium> inventarMedien = new HashMap<>();
    
    
    
    

    // ---------------------------------------------------------
    // SETTER & GETTER    
    public void setInventarMedien(Medium medium) {
	inventarMedien.put(medium.getBibId(), medium);
    }
    public HashMap<Integer, Medium> getInventarMedien() {
	return inventarMedien;
    }
    public String printInventarMedien() {
	StringBuilder medienAusgabe = new StringBuilder();
	medienAusgabe.append("Medienliste:\n\n");

	for (Medium m : inventarMedien.values()) {
	    medienAusgabe.append(String.format("- %s\n", m));
	}
	
	return medienAusgabe.toString();
    }

    
}

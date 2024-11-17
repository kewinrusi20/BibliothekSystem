package de.hs_mannheim.pr2.bibliothek.facade;

import java.util.HashMap;

import de.hs_mannheim.pr2.bibliothek.domain.medien.Medium;
import de.hs_mannheim.pr2.bibliothek.domain.users.User;

public class Verwaltungssystem {
    private HashMap<Integer, Medium> listeMedien = new HashMap<>();
    private HashMap<Integer, User> listeKonten = new HashMap<>();
    
    
    
    

    // ---------------------------------------------------------
    // SETTER & GETTER    
    public void setListeMedien(Medium medium) {
	listeMedien.put(medium.getBibId(), medium);
    }
    
    public HashMap<Integer, Medium> getListeMedien() {
	return listeMedien;
    }
    
    public String printListeMedien() {
	StringBuilder medienAusgabe = new StringBuilder();
	medienAusgabe.append("Medienliste:\n");

	for (Medium medium : listeMedien.values()) {
	    medienAusgabe.append(String.format("- %s\n", medium));
	}
	
	return medienAusgabe.toString();
    }
    
    
    // ---------------------------------------------------------
    public void setListeKonten(User user) {
	listeKonten.put(user.getId(), user);
    }    
    public HashMap<Integer, User> getListeKonten() {
	return listeKonten;
    }
    
    public String printKonten() {
    	StringBuilder kontenAusgabe = new StringBuilder();

    	kontenAusgabe.append("Kontenliste:\n");

	for (User user : listeKonten.values()) {
	    kontenAusgabe.append(String.format("- %s\n", user));
	}
    	
    
    	return kontenAusgabe.toString();
    }

    
    
    
    public void kontoAnmelden(User user) {
	
    }
    
}

package de.hs_mannheim.pr2.bibliothek.domain.users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

import de.hs_mannheim.pr2.bibliothek.domain.Ausleihe;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Medium;

public abstract class Kunde extends User {
    ArrayList<Integer> eigeneListeAusliehe = new ArrayList<>();
    

    
    // ---------------------------------------------------------
    // KONSTRUKTOR    
    public Kunde(String name) {
	super(name);
    }
    public Kunde(String name, int id) {
	super(name, id);
    }
    
    public void setEigeneListeAusliehe(TreeMap<Integer, Ausleihe> listeAusliehe) {
	eigeneListeAusliehe = new ArrayList<>();
	
	for (Ausleihe ausleihe : listeAusliehe.values()) {
	    if (ausleihe.getIdKunde() == this.id) {
		eigeneListeAusliehe.add(ausleihe.getIdAusleihe());
	    }
	}
    }
    public ArrayList<Integer> getEigeneListeAusliehe() {
	return eigeneListeAusliehe;
    }
}

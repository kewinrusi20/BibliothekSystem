package de.hs_mannheim.pr2.bibliothek.domain.users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

import de.hs_mannheim.pr2.bibliothek.domain.Ausleihe;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Medium;

public abstract class Kunde extends User {
    private ArrayList<Integer> listeAusliehe_Privat = new ArrayList<>();
    private ArrayList<Integer> listeAusliehe_PrivatZuZahlen = new ArrayList<>();
    private int gesamtGebuehren; 
    

    
    // ---------------------------------------------------------
    // KONSTRUKTOR    
    public Kunde(String name) {
	super(name);
    }
    public Kunde(String name, int id) {
	super(name, id);
    }
    
    public void setListeAusliehe_privat(TreeMap<Integer, Ausleihe> listeAusliehe) {
	listeAusliehe_Privat = new ArrayList<>();
	listeAusliehe_PrivatZuZahlen = new ArrayList<>();
	gesamtGebuehren = 0;
		
        for (Ausleihe ausleihe : listeAusliehe.values()) {
            if (ausleihe.getIdKunde() == this.id) {
             	if (ausleihe.getDatumRueckgabe() != null) {
             	    listeAusliehe_Privat.add(ausleihe.getIdAusleihe());
             	} else {
             	    listeAusliehe_PrivatZuZahlen.add(ausleihe.getIdAusleihe());
             	    gesamtGebuehren += ausleihe.getGebueren();
             	}
            }
	}
    }
    public ArrayList<Integer> getListeAusliehe_Privat() {
	return listeAusliehe_Privat;
    }
    
    public ArrayList<Integer> getListeAusliehe_PrivatZuZahlen() {
	return listeAusliehe_PrivatZuZahlen;
    }
}

package de.hs_mannheim.pr2.bibliothek.facade;

import java.util.HashMap;

import de.hs_mannheim.pr2.bibliothek.domain.Ausleihe;
import de.hs_mannheim.pr2.bibliothek.domain.Datum;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Medium;
import de.hs_mannheim.pr2.bibliothek.domain.users.User;

public class Verwaltungssystem {
    private HashMap<Integer, Medium> listeMedien = new HashMap<>();
    private HashMap<Integer, User> listeKonten = new HashMap<>();
    private HashMap<Integer, Ausleihe> listeAusleihe = new HashMap<>();
    private Datum datum = new Datum(17, 11, 2024);
    
    
    
    // ---------------------------------------------------------
    // MEDIEN
    public void setListeMedien(Medium medium) {
	listeMedien.put(medium.getBibId(), medium);
    }
    
    public HashMap<Integer, Medium> getListeMedien() {
	return listeMedien;
    }
    
    
    
    // ---------------------------------------------------------
    // KONTEN
    public void setListeKonten(User user) {
	listeKonten.put(user.getId(), user);
    }
    
    public HashMap<Integer, User> getListeKonten() {
	return listeKonten;
    }
    
    public boolean isKontoDa(int eingabe) {
	return getListeKonten().containsKey(eingabe);
    }

    
    
    // ---------------------------------------------------------
    // AUSLEIHE
    public void setListeAusleihen(int idKunde, int idMedium) {
	Ausleihe ausleihe = new Ausleihe(idKunde, idMedium, getDatum());
	listeAusleihe.put(ausleihe.getIdAusleihe(), ausleihe);
    }
    
    public void setListAusleihe(int idAusleihe) {
	listeAusleihe.remove(idAusleihe);
    }
    
    public HashMap<Integer, Ausleihe> getListeAusliehen(){
	return listeAusleihe;
    }
    
    
    
    // ---------------------------------------------------------
    // DATUM
    public void setDatum(int tag, int monat, int jahr) {
	datum = new Datum(17, 11, 2024);
    }
    
    public Datum getDatum() {
	return datum;
    }
    
}

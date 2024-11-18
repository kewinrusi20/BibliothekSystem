package de.hs_mannheim.pr2.bibliothek.facade;

import java.util.TreeMap;

import de.hs_mannheim.pr2.bibliothek.domain.Ausleihe;
import de.hs_mannheim.pr2.bibliothek.domain.Datum;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Medium;
import de.hs_mannheim.pr2.bibliothek.domain.users.Kunde;
import de.hs_mannheim.pr2.bibliothek.domain.users.User;

public class Verwaltungssystem {
    private TreeMap<Integer, User> listeKonten = new TreeMap<>();
    private TreeMap<Integer, Medium> listeMedien = new TreeMap<>();
    private TreeMap<Integer, Ausleihe> listeAusleihe = new TreeMap<>();
    public Datum datum = new Datum(17, 11, 2024);



    // ---------------------------------------------------------
    // KONTEN
    public void setListeKonten(User user) {
        listeKonten.put(user.getId(), user);
    }

    public TreeMap<Integer, User> getListeKonten() {
        return listeKonten;
    }

    public boolean isKontoDa(int eingabe) {
        return getListeKonten().containsKey(eingabe);
    }



    // ---------------------------------------------------------
    // MEDIEN
    public void setListeMedien(Medium medium) {
	listeMedien.put(medium.getId(), medium);
    }
    
    public TreeMap<Integer, Medium> getListeMedien() {
	return listeMedien;
    }
    

    
    // ---------------------------------------------------------
    // AUSLEIHE
    public void setListeAusleihen(int idKunde, int idMedium) {
	Ausleihe ausleihe = new Ausleihe(listeKonten.get(idKunde), listeMedien.get(idMedium), getDatum(), this);
	listeAusleihe.put(ausleihe.getIdAusleihe(), ausleihe);
	setListeAusleihen_Privat(idKunde);
    }
    
    public void setListAusleihe(int idAusleihe) {
	listeAusleihe.remove(idAusleihe);
    }
    
    public void setListAusleihe_Bezahlen(int idAusleihe) {
	listeAusleihe.get(idAusleihe).setDatumRueckgabe(datum);
	listeAusleihe.get(idAusleihe).setGebueren(100);
    }
    
    public TreeMap<Integer, Ausleihe> getListeAusleihen(){
	return listeAusleihe;
    }
    
    
    
    
    
    public void setListeAusleihen_Privat(int idUser) {
	((Kunde) listeKonten.get(idUser)).setListeAusliehe_privat(listeAusleihe);
    }
    
    
    
    // ---------------------------------------------------------
    // DATUM
    public void setDatum(int tag, int monat, int jahr) {
	datum = new Datum(tag, monat, jahr);
	for (Ausleihe ausleihe : getListeAusleihen().values()) {
	    ausleihe.setAusleiheDauer();
	}
    }
    
    public Datum getDatum() {
	return datum;
    }
    
}

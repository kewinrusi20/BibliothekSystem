package de.hs_mannheim.pr2.bibliothek.domain;

public class Ausleihe {
    int idKunde;
    int idMedium;
    int idAusleihe;
    Datum datumAusleihe;
    Datum datumRueckgabe;
    
    
    public Ausleihe(int idKunde, int idMedium, Datum datumAusleihe) {
	setIdKunde(idKunde);
	setIdMedium(idMedium);
	setIdAusleihe();
	setDatumAusleihe(datumAusleihe);
    }

    
    
    // ---------------------------------------------------------
    // SETTER & GETTER   
    public void setIdKunde(int idKunde) {
        this.idKunde = idKunde;
    }
    
    public int getIdKunde() {
        return idKunde;
    }



    public void setIdMedium(int idMedium) {
        this.idMedium = idMedium;
    }
    
    public int getIdMedium() {
        return idMedium;
    }



    public void setIdAusleihe() {
        this.idAusleihe = Integer.parseInt(String.format("%d%d", getIdKunde(), getIdMedium()));
    }
    
    public int getIdAusleihe() {
        return idAusleihe;
    }
    
    

    public void setDatumAusleihe(Datum datumAusleihe) {
        this.datumAusleihe = datumAusleihe;
    }
    
    public Datum getDatumAusleihe() {
        return datumAusleihe;
    }
    
    
    
    public void setDatumRueckgabe(Datum datumRueckgabe) {
        this.datumRueckgabe = datumRueckgabe;
    }
    public Datum getDatumRueckgabe() {
        return datumRueckgabe;
    }
    
}

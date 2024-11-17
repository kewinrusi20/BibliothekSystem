package de.hs_mannheim.pr2.bibliothek.domain;

public class Datum {
    private int tag, monat, jahr;
    
    public Datum(int tag, int monat, int jahr) {
	setTag(tag);
	setMonat(monat);
	setJahr(jahr);
    }
    
    
    
    // ---------------------------------------------------------
    // SETTER & GETTER
    public void setTag(int tag) {
        this.tag = tag;
    }
    public int getTag() {
        return tag;
    }


    
    public void setMonat(int monat) {
        this.monat = monat;
    }
    public int getMonat() {
        return monat;
    }


    
    public void setJahr(int jahr) {
        this.jahr = jahr;
    }
    public int getJahr() {
        return jahr;
    }
    
    
    
    // -----------------------------------------------
    @Override
    public String toString() {
	return String.format("%d/%d/%d", tag, monat, jahr);
    }
    
}

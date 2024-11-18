package de.hs_mannheim.pr2.bibliothek.domain;

public class Datum {
    private int tag, monat, jahr, counter;
    
    public Datum(int tag, int monat, int jahr) {
	setTag(tag);
	setMonat(monat);
	setJahr(jahr);
	setCounter(tag ,monat, jahr);
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
    
    
    public void setCounter(int tag, int monat, int jahr) {
 	this.counter = tag + (30 * monat) + (365 * jahr);
     }
    public int getCounter() {
	return this.counter;
    }
    
    
    
    // -----------------------------------------------
    @Override
    public String toString() {
	return String.format("%d/%d/%d", tag, monat, jahr);
    }
    
}

package de.hs_mannheim.pr2.bibliothek.domain.medien;

import java.util.Random;

public abstract class Medium {
    // Attribute
    int bibId;
    String name;
    
    // Ausleihe
    boolean ausleiheStatus;
    int ausleiheTage;
    int maximaleAusleiheTage;
    
    // Verlängerung
    boolean verlaengerbarkeit;
    int maximaleVerlaengerbarkeit;
    

    // ---------------------------------------------------------
    // KONSTRUKTOR
    public Medium(String name) {
	setName(name);
	setBibId();
    }    
    public Medium(String name, int id) {
	setName(name);
	setBibId(id);
    }
    
    
    // ---------------------------------------------------------
    // SETTER & GETTER    
    public void setBibId() {
        this.bibId = (new Random()).nextInt(1000000);
    }
    public void setBibId(int BibId) {
        this.bibId = BibId;
    }
    public int getBibId() {
        return bibId;
    }


    // Name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    
    // Ausleihe
    public void setAusleihe(boolean ausleihe) {
        this.ausleiheStatus = ausleihe;
    }
    public boolean isAusleihe() {
        return ausleiheStatus;
    }
    

    // AusleiheTage
    public void setAusleiheTage(int ausleiheTage) {
        this.ausleiheTage = ausleiheTage;
    }
    public int getAusleiheTage() {
        return ausleiheTage;
    }


    // MaximaleAusleiheTage
    public void setMaximaleAusleiheTage(int maximaleAusleiheTage) {
        this.maximaleAusleiheTage = maximaleAusleiheTage;
    }
    public int getMaximaleAusleiheTage() {
        return maximaleAusleiheTage;
    }


    // Verlaengerbarkeit
    public void setVerlaengerbarkeit(boolean verlaengerbarkeit) {
        this.verlaengerbarkeit = verlaengerbarkeit;
    }
    public boolean isVerlaengerbarkeit() {
        return verlaengerbarkeit;
    }

    
    // MaximaleVerlaengerbarkeit
    public void setMaximaleVerlaengerbarkeit(int maximaleVerlaengerbarkeit) {
        this.maximaleVerlaengerbarkeit = maximaleVerlaengerbarkeit;
    }
    public int getMaximaleVerlaengerbarkeit() {
        return maximaleVerlaengerbarkeit;
    }
    
    // -----------------------------------------------
    @Override
    public String toString() {
	return String.format("Name: %s, ID: %s", getName(), getBibId());
    }
}

package de.hs_mannheim.pr2.bibliothek.domain.medien;

public abstract class Medium {
    // Medium
    int id;
    String name;
    
    // Ausleihe
    boolean ausleihe;
    int ausleiheTage;
    int maximaleAusleiheTage;
    
    // Verlängerung
    boolean verlaengerbarkeit;
    int maximaleVerlaengerbarkeit;
    
    
    // KONSTRUKTOR
    public Medium(String name) {
	setName(name);
    }    
    public Medium(String name, int id) {
	setName(name);
	setId(id);
    }
    
    
    // SETTER & GETTER
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
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
        this.ausleihe = ausleihe;
    }
    public boolean isAusleihe() {
        return ausleihe;
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
	return getName();
    }
}

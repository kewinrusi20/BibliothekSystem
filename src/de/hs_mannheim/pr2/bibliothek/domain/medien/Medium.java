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

}

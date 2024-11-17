package de.hs_mannheim.pr2.bibliothek.domain.users;

public abstract class Kunde extends User {    
    // ---------------------------------------------------------
    // KONSTRUKTOR    
    public Kunde(String name) {
	super(name);
    }
    public Kunde(String name, int id) {
	super(name, id);
    }
}

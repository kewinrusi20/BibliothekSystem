package de.hs_mannheim.pr2.bibliothek.domain.users;

import java.util.HashMap;

import de.hs_mannheim.pr2.bibliothek.domain.medien.Medium;

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

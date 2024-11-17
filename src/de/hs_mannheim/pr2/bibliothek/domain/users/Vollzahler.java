package de.hs_mannheim.pr2.bibliothek.domain.users;

import java.util.Random;

public class Vollzahler extends Kunde {
    int idSignatur = 3;
    
    
    
    // ---------------------------------------------------------
    // KONSTRUKTOR    
    public Vollzahler(String name) {
	super(name);
	setId();
    }
    public Vollzahler(String name, int id) {
	super(name, id);
    }
    
    
    
    public void setId() {
	this.id = Integer.parseInt(String.format("%d%d", idSignatur, (new Random().nextInt(1000))));
    }
}

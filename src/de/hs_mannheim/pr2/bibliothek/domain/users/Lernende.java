package de.hs_mannheim.pr2.bibliothek.domain.users;

import java.util.Random;

public class Lernende extends Kunde {
    int idSignatur = 2;
    
    
    
    // ---------------------------------------------------------
    // KONSTRUKTOR    
    public Lernende(String name) {
	super(name);
	setId();
    }
    public Lernende(String name, int id) {
	super(name, id);
    }
    
    
    
    public void setId() {
	this.id = Integer.parseInt(String.format("%d%d", idSignatur, (new Random().nextInt(1000))));
    }
}

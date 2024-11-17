package de.hs_mannheim.pr2.bibliothek.domain.users;

import java.util.Random;

public class Admin extends User {
    int idSignatur = 1;
    
    
    
    // ---------------------------------------------------------
    // KONSTRUKTOR    
    public Admin(String name) {
	super(name);
	setId();
    }
    public Admin(String name, int id) {
	super(name, id);
    }
    
    
    
    public void setId() {
	this.id = Integer.parseInt(String.format("%d%d", idSignatur, (new Random().nextInt(1000))));
    }

}

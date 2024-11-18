package de.hs_mannheim.pr2.bibliothek.domain.medien;

import java.util.Random;

public abstract class Medium {
    // Attribute
    int id;
    String name;
    
    

    // ---------------------------------------------------------
    // KONSTRUKTOR
    public Medium(String name) {
	setName(name);
	setId();
    }    
    public Medium(String name, int id) {
	setName(name);
	setId(id);
    }
    
    
    
    // ---------------------------------------------------------
    // SETTER & GETTER
    // Id
    public void setId() {
        this.id = (new Random()).nextInt(1000);
    }
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

    
    
    // -----------------------------------------------
    @Override
    public String toString() {
	return String.format("%s Name: %s, ID: %s", getClass().getSimpleName(), getName(), getId());
    }
}

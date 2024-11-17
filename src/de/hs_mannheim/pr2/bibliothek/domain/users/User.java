package de.hs_mannheim.pr2.bibliothek.domain.users;

import java.util.Random;

public abstract class User {
    String name;
    int id;
    int idSignatur = 3;
    
    
    
    // ---------------------------------------------------------
    // KONSTRUKTOR    
    public User(String name) {
	setName(name);
    }
    public User(String name, int id) {
	setName(name);
	setId(id);
    }
    
    
    
    // ---------------------------------------------------------
    // SETTER & GETTER    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    

    public abstract void setId();
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    
    
    @Override
    public String toString() {
	return String.format("Name: %s, ID: %s", getName(), getId());
    }

}

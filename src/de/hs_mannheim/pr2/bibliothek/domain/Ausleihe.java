package de.hs_mannheim.pr2.bibliothek.domain;

import de.hs_mannheim.pr2.bibliothek.domain.medien.Brettspiel;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Buch;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Cd;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Dvd;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Medium;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Videospiel;
import de.hs_mannheim.pr2.bibliothek.domain.users.User;
import de.hs_mannheim.pr2.bibliothek.facade.Verwaltungssystem;

public class Ausleihe {
    User user;
    Medium medium;
    
    int idKunde;
    int idMedium;
    int idAusleihe;
    
    Datum datumAusleihe;
    Datum datumRueckgabe;
    
    int maximaleAusleiheDauer;
    int ausleiheDauer;
    int verlaengerbarkeit;
    
    public Ausleihe(User user, Medium medium, Datum datumAusleihe) {
	setUser(user);
	setUser(medium);
	setIdKunde(user.getId());
	setIdMedium(medium.getId());
	setIdAusleihe();
	setDatumAusleihe(datumAusleihe);
	setMaximaleAusleiheDauer(medium);
	setVerlaengerbarkeit(medium);
    }

    
    
    // ---------------------------------------------------------
    // SETTER & GETTER
    public void setUser(User user) {
	this.user = user;
    }
    public User getUser() {
	return user;
    }
    
    
    
    public void setUser(Medium medium) {
	this.medium = medium;
    }
    public Medium getMedium() {
	return medium;
    }
    
    
    
    public void setIdKunde(int idKunde) {
        this.idKunde = idKunde;
    }
    public int getIdKunde() {
        return idKunde;
    }



    public void setIdMedium(int idMedium) {
        this.idMedium = idMedium;
    }
    public int getIdMedium() {
        return idMedium;
    }



    public void setIdAusleihe() {
        this.idAusleihe = Integer.parseInt(String.format("%d%d", getIdKunde(), getIdMedium()));
    }
    public int getIdAusleihe() {
        return idAusleihe;
    }
    
    

    public void setDatumAusleihe(Datum datumAusleihe) {
        this.datumAusleihe = datumAusleihe;
    }
    public Datum getDatumAusleihe() {
        return datumAusleihe;
    }
    
    
    
    public void setDatumRueckgabe(Datum datumRueckgabe) {
        this.datumRueckgabe = datumRueckgabe;
    }
    public Datum getDatumRueckgabe() {
        return datumRueckgabe;
    }



    public void setMaximaleAusleiheDauer(Medium medium) {
	if (medium instanceof Buch) {
	    this.maximaleAusleiheDauer = 4*7;
	} else if (medium instanceof Dvd) {
	    this.maximaleAusleiheDauer = 1*7;
	} else if (medium instanceof Cd) {
	    this.maximaleAusleiheDauer = 2*7;
	} else if (medium instanceof Brettspiel) {
	    this.maximaleAusleiheDauer = 2*7;
	} else if (medium instanceof Videospiel) {
	    this.maximaleAusleiheDauer = 4*7;
	}
    }
    public int getMaximaleAusleiheDauer() {
        return maximaleAusleiheDauer;
    }
    

    public void setAusleiheDauer() {
	this.ausleiheDauer =  maximaleAusleiheDauer - (Verwaltungssystem.datum.getCounter() - datumAusleihe.getCounter());
    }
    public int getAusleiheDauer() {
	return ausleiheDauer;
    }



    public void setVerlaengerbarkeit(Medium medium) {
	if (medium instanceof Buch) {
	    this.verlaengerbarkeit = 3;
	} else if (medium instanceof Dvd) {
	    this.verlaengerbarkeit = 0;
	} else if (medium instanceof Cd) {
	    this.verlaengerbarkeit = 0;
	} else if (medium instanceof Brettspiel) {
	    this.verlaengerbarkeit = 0;
	} else if (medium instanceof Videospiel) {
	    this.verlaengerbarkeit = 1;
	}
    }
    public int getVerlaengerbarkeit() {
        return verlaengerbarkeit;
    }
    
    @Override
    public String toString() {
	return String.format("- ID Medium: %s, ID Kunde: %s", getIdMedium(), getIdKunde());
    }

}

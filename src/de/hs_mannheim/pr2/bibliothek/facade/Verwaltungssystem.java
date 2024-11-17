package de.hs_mannheim.pr2.bibliothek.facade;

import java.util.HashMap;

import de.hs_mannheim.pr2.bibliothek.domain.medien.Brettspiel;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Buch;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Cd;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Dvd;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Medium;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Videospiel;

public class Verwaltungssystem {
    private HashMap<String, Medium> inventarMedien = new HashMap<>();
    
    
    public void setInventarMedien(Medium medium) {
	inventarMedien.put("Wortwelten", new Buch("Wortwelten"));
	inventarMedien.put("Seitenzauber", new Buch("Seitenzauber"));
	inventarMedien.put("Kapitelkiste", new Buch("Kapitelkiste"));
	inventarMedien.put("Filmfieber", new Dvd("Filmfieber"));
	inventarMedien.put("Leinwandliebe", new Dvd("Leinwandliebe"));
	inventarMedien.put("DiscReel", new Dvd("DiscReel"));
	inventarMedien.put("Tonträume", new Cd("Tonträume"));
	inventarMedien.put("Klangschatz", new Cd("Klangschatz"));
	inventarMedien.put("Melodienbox", new Cd("Melodienbox"));
	inventarMedien.put("Spielesammlung", new Brettspiel("Spielesammlung"));
	inventarMedien.put("Würfelwelten", new Brettspiel("Würfelwelten"));
	inventarMedien.put("Taktikbox", new Brettspiel("Taktikbox"));
	inventarMedien.put("PixelPalast", new Videospiel("PixelPalast"));
	inventarMedien.put("GameVault", new Videospiel("GameVault"));
	inventarMedien.put("Controllerkiste", new Videospiel("Controllerkiste"));
	inventarMedien.put(medium.getName(), medium);
	
    }
    
    public String getInventarMedien() {
	StringBuilder medienAusgabe = new StringBuilder();
	medienAusgabe.append("Medienliste:\n\n");

	for (Medium m : inventarMedien.values()) {
	    medienAusgabe.append(String.format("- %s\n", m.getName()));
	}
	
	return medienAusgabe.toString();
    }
    
}

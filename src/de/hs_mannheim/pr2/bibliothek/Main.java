package de.hs_mannheim.pr2.bibliothek;

import de.hs_mannheim.pr2.bibliothek.domain.medien.Brettspiel;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Buch;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Cd;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Dvd;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Videospiel;
import de.hs_mannheim.pr2.bibliothek.domain.users.Admin;
import de.hs_mannheim.pr2.bibliothek.domain.users.Lernende;
import de.hs_mannheim.pr2.bibliothek.domain.users.Vollzahler;
import de.hs_mannheim.pr2.bibliothek.facade.Verwaltungssystem;
import de.hs_mannheim.pr2.bibliothek.ui.TextUi;

public class Main {
    public static void main(String[] args) {
	Verwaltungssystem vs = new Verwaltungssystem();
	TextUi ui = new TextUi(vs);
	
	// Medien
	vs.setListeMedien(new Buch("MobyDick"));
	vs.setListeMedien(new Buch("Wortwelten"));
	vs.setListeMedien(new Buch("Seitenzauber"));
	vs.setListeMedien(new Buch("Kapitelkiste"));
	vs.setListeMedien(new Dvd("Filmfieber"));
	vs.setListeMedien(new Dvd("Leinwandliebe"));
	vs.setListeMedien(new Dvd("DiscReel"));
	vs.setListeMedien(new Dvd("DiscReel"));
	vs.setListeMedien(new Dvd("DiscReel"));
	vs.setListeMedien(new Cd("Tonträume"));
	vs.setListeMedien(new Cd("Klangschatz"));
	vs.setListeMedien(new Cd("Klangschatz"));
	vs.setListeMedien(new Cd("Melodienbox"));
	vs.setListeMedien(new Brettspiel("Spielesammlung"));
	vs.setListeMedien(new Brettspiel("Würfelwelten"));
	vs.setListeMedien(new Brettspiel("Taktikbox"));
	vs.setListeMedien(new Videospiel("PixelPalast"));
	vs.setListeMedien(new Videospiel("PixelPalast"));
	vs.setListeMedien(new Videospiel("GameVault"));
	vs.setListeMedien(new Videospiel("GameVault"));
	vs.setListeMedien(new Videospiel("Controllerkiste"));
	vs.setListeMedien(new Videospiel("Controllerkiste"));
	//System.out.println(vs.printInventarMedien());
	
	
	// Konten
    }
    
}

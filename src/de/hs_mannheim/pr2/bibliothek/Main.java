package de.hs_mannheim.pr2.bibliothek;

import de.hs_mannheim.pr2.bibliothek.domain.medien.Brettspiel;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Buch;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Cd;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Dvd;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Videospiel;
import de.hs_mannheim.pr2.bibliothek.facade.Verwaltungssystem;
import de.hs_mannheim.pr2.bibliothek.ui.TextUi;

public class Main {
    public static void main(String[] args) {
	Verwaltungssystem vs = new Verwaltungssystem();
	TextUi ui = new TextUi(vs);
	
	vs.setInventarMedien(new Buch("MobyDick"));
	vs.setInventarMedien(new Buch("Wortwelten"));
	vs.setInventarMedien(new Buch("Seitenzauber"));
	vs.setInventarMedien(new Buch("Kapitelkiste"));
	vs.setInventarMedien(new Dvd("Filmfieber"));
	vs.setInventarMedien(new Dvd("Leinwandliebe"));
	vs.setInventarMedien(new Dvd("DiscReel"));
	vs.setInventarMedien(new Dvd("DiscReel"));
	vs.setInventarMedien(new Dvd("DiscReel"));
	vs.setInventarMedien(new Cd("Tonträume"));
	vs.setInventarMedien(new Cd("Klangschatz"));
	vs.setInventarMedien(new Cd("Klangschatz"));
	vs.setInventarMedien(new Cd("Melodienbox"));
	vs.setInventarMedien(new Brettspiel("Spielesammlung"));
	vs.setInventarMedien(new Brettspiel("Würfelwelten"));
	vs.setInventarMedien(new Brettspiel("Taktikbox"));
	vs.setInventarMedien(new Videospiel("PixelPalast"));
	vs.setInventarMedien(new Videospiel("PixelPalast"));
	vs.setInventarMedien(new Videospiel("GameVault"));
	vs.setInventarMedien(new Videospiel("GameVault"));
	vs.setInventarMedien(new Videospiel("Controllerkiste"));
	vs.setInventarMedien(new Videospiel("Controllerkiste"));
	
	System.out.println(vs.printInventarMedien());
    }
    
}

package de.hs_mannheim.pr2.bibliothek.ui;

import java.util.Scanner;

import de.hs_mannheim.pr2.bibliothek.domain.medien.Brettspiel;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Buch;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Cd;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Dvd;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Videospiel;
import de.hs_mannheim.pr2.bibliothek.facade.Verwaltungssystem;

public class AdminUi {
    Scanner sc = new Scanner(System.in);
    Verwaltungssystem vs;

    
    
    // ---------------------------------------------------------
    // KONSTRUKTOR
    public AdminUi(Verwaltungssystem vs) {
	this.vs = vs;
	
	// Hard Coding Objects
	mediumRegistrieren();
    }

    
    
    // ---------------------------------------------------------
    // PROGRAM LOOP
    public void hauptMenue(int idUser) {
	System.out.println("Willkommen in unserer Bibliothek");
	
	int eingabe;
	
	hauptmenue:
	while(true) {
	    System.out.print("\n\n\n\n\n\n\n\n\n\n");
	    //System.out.println("1: Medium Registieren");
	    System.out.println("2: Gebühren überarbeiten");
	    System.out.println("---------------------\n");
	    
	    eingabe = sc.nextInt();
	    switch (eingabe) {
	    //case 1: mediumRegistrieren(); break;
	    case 2: gebuehrenueberarbeiten(); break;
	    case 3: break;
	    case 4: break;
	    case 5: break;
	    case 6: break;
	    case 7: break;
	    case 8: break;
	    case 9: break;
	    case 0: break hauptmenue;
	    }
	    
	}
    } // close: hauptMenue()
    
    public void mediumRegistrieren() {
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
    }
    
    public void gebuehrenueberarbeiten() {
	
    }
}

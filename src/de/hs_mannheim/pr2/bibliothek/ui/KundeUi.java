package de.hs_mannheim.pr2.bibliothek.ui;

import java.util.HashMap;
import java.util.Scanner;

import de.hs_mannheim.pr2.bibliothek.domain.medien.Medium;
import de.hs_mannheim.pr2.bibliothek.facade.Verwaltungssystem;

public class KundeUi {
    private Scanner sc = new Scanner(System.in);
    private Verwaltungssystem vs;

    
    
    // ---------------------------------------------------------
    // KONSTRUKTOR
    public KundeUi(Verwaltungssystem vs) {
	this.vs = vs;
    }

    
    
    // ---------------------------------------------------------
    // PROGRAM LOOP
    public void hauptMenue(int idUser) {
	System.out.println("Willkommen in unserer Bibliothek");
	
	int eingabe;
	
	hauptmenue:
	while(true) {
	    System.out.print("\n\n\n\n\n\n\n\n\n\n");
	    System.out.println("1: Medien ausdrücken");
	    System.out.println("2: Medium ausleihen");
	    System.out.println("3: Medium zurückgeben\n");
	    
	    System.out.println("4: Konto Info");
	    System.out.println("5: Frist Verlängern");
	    System.out.println("6: Bezahlen");
	    System.out.println("---------------------\n");
	    
	    
	    
	    eingabe = sc.nextInt();
	    switch (eingabe) {
	    case 1: printListeMedien(); break;
	    case 2: mediumAusleihen(idUser); break;
	    case 3: mediumZurueckgeben(); break;
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
    
    public void printListeMedien() {
	HashMap<Integer, Medium> listeMedien = vs.getListeMedien();
	StringBuilder medienAusgabe = new StringBuilder("Medienliste:\n");

	for (Medium medium : listeMedien.values()) {
	    medienAusgabe.append(String.format("- %s\n", medium));
	}
	
	medienAusgabe.toString();
	
    }
    
    public void mediumAusleihen(int idUser) {
	System.out.println("Bitte Medium Id eingeben");
	vs.setListeAusleihen(idUser, sc.nextInt());
    }
    
    public void mediumZurueckgeben() {
	System.out.println("Bitte Ausleihe Id eingeben");
	vs.setListAusleihe(sc.nextInt());
    }
    
    public void kontoInfo() {
	
    }
    
    public void fristVerlaengern() {
	
    }
    
    public void bezahlen() {
	
    }
}

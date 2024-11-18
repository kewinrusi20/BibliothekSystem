package de.hs_mannheim.pr2.bibliothek.ui;

import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Scanner;

import de.hs_mannheim.pr2.bibliothek.domain.Ausleihe;
import de.hs_mannheim.pr2.bibliothek.domain.medien.Medium;
import de.hs_mannheim.pr2.bibliothek.domain.users.Kunde;
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
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	System.out.println("Willkommen " + vs.getListeKonten().get(idUser).getName());
	printEigeneListeAusliehe(idUser);
	
	int eingabe;
	
	hauptmenue:
	while(true) {
	    System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
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
	    case 3: mediumZurueckgeben(idUser); break;
	    case 4: printEigeneListeAusliehe(idUser); break;
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
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	StringBuilder medienAusgabe = new StringBuilder("Medienliste:\n");

	for (Medium medium : vs.getListeMedien().values()) {
	    medienAusgabe.append(String.format("- %s\n", medium));
	}

	System.out.println(medienAusgabe.toString());
    }



    public void mediumAusleihen(int idUser) {
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	System.out.println("Bitte Medium Id eingeben");
	vs.setListeAusleihen(idUser, sc.nextInt());
	setEigeneListeAusliehe(idUser);
	printEigeneListeAusliehe(idUser);
    }



    public void mediumZurueckgeben(int idUser) {
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	printEigeneListeAusliehe(idUser);
	System.out.println("Bitte Ausleihe Id eingeben");
	vs.setListAusleihe(sc.nextInt());
	setEigeneListeAusliehe(idUser);
	printEigeneListeAusliehe(idUser);
    }


    public void setEigeneListeAusliehe(int idUser) {
	((Kunde) vs.getListeKonten().get(idUser)).setEigeneListeAusliehe(vs.getListeAusleihen());
    }

    
    public void printEigeneListeAusliehe(int idUser) {
	

	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	StringBuilder ausleihenAusgabe = new StringBuilder("Medien Ausleiheliste:\n");
	
	ArrayList<Integer> eigeneListeAusliehe = ((Kunde) vs.getListeKonten().get(idUser)).getEigeneListeAusliehe();
	
	for (Integer ii : eigeneListeAusliehe) {
	    Ausleihe ausleihe = vs.getListeAusleihen().get(ii);
	    ausleihenAusgabe.append("\n" + ausleihe);
	    ausleihenAusgabe.append("\n noch " + ausleihe.getAusleiheDauer() + " Tage übrig");
	}
	
	System.out.println(ausleihenAusgabe.toString());
    }
    
    /*
    public void kontoInfo(int idUser) {
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	StringBuilder ausleihenAusgabe = new StringBuilder("Medien Ausleiheliste:\n");
	
	for (Ausleihe ausleihe : vs.getListeAusliehen().values()) {
	    if (ausleihe.getIdKunde() == idUser) {
		ausleihenAusgabe.append("\n- " + vs.getListeMedien().get(ausleihe.getIdMedium()));
		ausleihenAusgabe.append("\n noch " + ausleihe.getAusleiheDauer() + " Tage übrig");
	    }
	}
	System.out.println(ausleihenAusgabe.toString());
    }
     */


    public void fristVerlaengern() {
	
    }


    
    public void bezahlen() {
	
    }
}

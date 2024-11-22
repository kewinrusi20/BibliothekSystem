package de.hs_mannheim.pr2.bibliothek.ui;

import java.util.TreeMap;
import java.util.Scanner;

import de.hs_mannheim.pr2.bibliothek.domain.users.Admin;
import de.hs_mannheim.pr2.bibliothek.domain.users.Kunde;
import de.hs_mannheim.pr2.bibliothek.domain.users.Lernende;
import de.hs_mannheim.pr2.bibliothek.domain.users.User;
import de.hs_mannheim.pr2.bibliothek.domain.users.Vollzahler;
import de.hs_mannheim.pr2.bibliothek.facade.Verwaltungssystem;

public class MainUi {
    Verwaltungssystem vs;
    AdminUi adminUi;
    KundeUi kundeUi;
    Scanner sc;

    
    
    // ---------------------------------------------------------
    // KONSTRUKTOR
    public MainUi(Verwaltungssystem vs) {
	this.vs = vs;
	adminUi = new AdminUi(vs);
	kundeUi = new KundeUi(vs);

	// Hard Coding Objects
	kontoRegistieren();
    }

    
    
    // ---------------------------------------------------------
    // PROGRAM LOOP
    public void hauptMenue() {
	mainmenu:
	while(true) {
	    System.out.println("\n___MAIN MENU___");
	    System.out.println("1: Anmelung");
	    System.out.println("2: Registrieren");
	    System.out.println("3: Konte ausdrücken");
	    System.out.println("9: Close Program");
	    System.out.println("-------------------\n");
	    
	    
	    int eingabe = catchInput();
	    
	    switch (eingabe) {
	    case 1: 
    		kontoAnmelden();
    		System.out.print("\n\n\n\n\n\n\n\n\n\n\n");
    		break;
	    case 2: kontoRegistieren(); break;
	    case 3: 
		printKonten();
		System.out.print("\n\n\n\n\n\n\n\n\n\n\n");
		break;
	    case 4:
		continue;
    	    case 9:
    		break mainmenu;
    	    default:
    		System.out.println("Wrong Number, try again");
	    }
	}
	sc.close();
    } // close: hauptMenue()
    
    
    
    // CASE 1
    public void kontoAnmelden() {
	System.out.println("Bitte Konto ID eingabe:");
	int eingabe = catchInput();
	if (vs.isKontoDa(eingabe)) {
	    if (vs.getListeKonten().get(eingabe) instanceof Kunde) {
		kundeUi.hauptMenue(eingabe);
	    } else if (vs.getListeKonten().get(eingabe) instanceof Admin) {
		adminUi.hauptMenue(eingabe);
	    }
	    
	    
	}
    }
    
    
    
    // CASE 2
    public void kontoRegistieren() {
//	vs.kontoRegistieren(new Admin("Anton"));
//	vs.kontoRegistieren(new Lernende("Bob"));
//	vs.kontoRegistieren(new Vollzahler("Andrea"));;
	System.out.println("Die Konten werden registriet ...\n");
	vs.setListeKonten(new Admin("Anton", 1001));
	vs.setListeKonten(new Lernende("Bob", 2002));
	vs.setListeKonten(new Vollzahler("Andrea", 3003));;
    }
    
    
    
    // CASE 3
    public void printKonten() {
	TreeMap<Integer, User> listeKonten = vs.getListeKonten();
    	StringBuilder kontenAusgabe = new StringBuilder("Kontenliste:\n");

	for (User user : listeKonten.values()) {
	    kontenAusgabe.append(String.format("- %s\n", user));
	}

	System.out.println(kontenAusgabe.toString());
    }
    
}

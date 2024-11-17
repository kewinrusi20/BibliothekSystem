package de.hs_mannheim.pr2.bibliothek.ui;

import java.util.Scanner;

import de.hs_mannheim.pr2.bibliothek.domain.users.Admin;
import de.hs_mannheim.pr2.bibliothek.domain.users.Lernende;
import de.hs_mannheim.pr2.bibliothek.domain.users.Vollzahler;
import de.hs_mannheim.pr2.bibliothek.facade.Verwaltungssystem;

public class  TextUi {
    Scanner sc = new Scanner(System.in);
    Verwaltungssystem vs;
    
    public TextUi(Verwaltungssystem vs) {
	this.vs = vs;
	hauptMenue();
    }
    
    public void hauptMenue() {
	System.out.println("Willkommen in unserer Bibliothek");
	
	int eingabe;
	
	hauptmenue:
	while(true) {
	    System.out.print("\n\n\n\n\n\n\n\n\n\n");
	    System.out.println("1: Anmelung");
	    System.out.println("2: Registrieren");
	    System.out.println("3: Konte ausdrücken");
	    System.out.println("---------------------\n");
	    
	    
	    
	    eingabe = sc.nextInt();
	    switch (eingabe) {
	    case 1: kontoAnmelden(); break;
	    case 2: kontoRegistieren(); break;
	    case 3: printKonten();break;
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
    
    
    public void kontoAnmelden() {
	System.out.println("Bitte Konto ID eingabe:");
	int eingabe = sc.nextInt();
	if (vs.getListeKonten().containsKey(eingabe)) {
	    System.out.println("Willkommen " + vs.getListeKonten().get(eingabe).getName());
	}
    }
    
    public void kontoRegistieren() {
//	vs.kontoRegistieren(new Admin("Anton"));
//	vs.kontoRegistieren(new Lernende("Bob"));
//	vs.kontoRegistieren(new Vollzahler("Andrea"));;
	System.out.println("Die Konten werden registriet ...");
	vs.setListeKonten(new Admin("Anton", 1001));
	vs.setListeKonten(new Lernende("Bob", 2002));
	vs.setListeKonten(new Vollzahler("Andrea", 3003));;
    }
    
    public void printKonten() {
	System.out.println(vs.printKonten());
    }

}

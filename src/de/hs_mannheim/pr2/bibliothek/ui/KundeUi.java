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
	System.out.println("Willkommen " + vs.getListeKonten().get(idUser).getName());
	
	int eingabe;
	
	hauptmenue:
	while(true) {
	    System.out.println("1: Medien ausdrücken");
	    System.out.println("2: Medium ausleihen");
	    System.out.println("3: Medium zurückgeben\n");
	    
	    System.out.println("4: Konto Info");
	    System.out.println("5: Frist Verlängern");
	    System.out.println("6: Rechnung Begliechen");
	    System.out.println("7: Liste zu zahlen");
	    System.out.println("---------------------\n");
	    
	    
	    
	    eingabe = sc.nextInt();
	    switch (eingabe) {
	    case 1: printListeMedien(); break;
	    case 2: mediumAusleihen(idUser); break;
	    case 3: mediumZurueckgeben(idUser); break;
	    
	    case 4: printListeAusliehe_Privat(idUser); break;
	    case 5: fristVerlaengern(idUser); break;
	    case 6: rechnungBeglichen(idUser); break;
	    case 7: printListeAusleihen_PrivatZuZahlen(idUser); break;
	    case 8: break;
	    case 9: break;
	    case 0: break hauptmenue;
	    }
	    
	}
    } // close: hauptMenue()
    
    
    
    // CASE 1
    public void printListeMedien() {
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	StringBuilder medienAusgabe = new StringBuilder("___Medienliste:___\n");

	for (Medium medium : vs.getListeMedien().values()) {
	    medienAusgabe.append(String.format("- %s\n", medium));
	}
	
	medienAusgabe.append("\n-------------------------------------\n");
	System.out.println(medienAusgabe.toString());
    }


    
    // CASE 2
    public void mediumAusleihen(int idUser) {
	System.out.println("Bitte Medium Id eingeben");
	vs.setListeAusleihen(idUser, sc.nextInt());
    }



    // CASE 3
    public void mediumZurueckgeben(int idUser) {
	System.out.println("Bitte Ausleihe Id eingeben");
	vs.setListeAusleihen_Rueckgabe(sc.nextInt());
	vs.setListeAusleihen_Privat(idUser);
    }


    
    // CASE 4
    public void printListeAusliehe_Privat(int idUser) {
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	StringBuilder ausleihenAusgabe = new StringBuilder("___Medien Ausleiheliste:___\n");
	
	ArrayList<Integer> eigeneListeAusliehe = ((Kunde) vs.getListeKonten().get(idUser)).getListeAusliehe_Privat();
	
	for (Integer ii : eigeneListeAusliehe) {
	    Ausleihe ausleihe = vs.getListeAusleihen().get(ii);
	    ausleihenAusgabe.append("\n" + ausleihe);
	    ausleihenAusgabe.append("\n noch " + ausleihe.getAusleiheDauer() + " Tage übrig");
	}

	ausleihenAusgabe.append("\n-------------------------------------\n");
	System.out.println(ausleihenAusgabe.toString());
    }
    
    
    
    // CASE 5
    public void fristVerlaengern(int idUser) {
	System.out.println("Bitte Ausleihe ID zum Verlängerung eingeben");
	int idAusleihe = sc.nextInt();
	
	vs.getListeAusleihen().get(idAusleihe).setExtraDauer();
	vs.getListeAusleihen().get(idAusleihe).setAusleiheDauer();
    }


    
    // CASE 6
    public void rechnungBeglichen(int idUser) {
	int liveKontostand = ((Kunde) vs.getListeKonten().get(idUser)).getGesamtGebuehren();
	
	System.out.println("_______________________________________________________");
	System.out.println("Gesamtgebühren von: " + liveKontostand);
	System.out.println("Bitte Geld Einzahlen");
	
	int neuesKontostand = sc.nextInt();
	liveKontostand = vs.rechnungBeglichen(idUser, neuesKontostand);
	
	System.out.println("Ihr Kontostand beträgt " + liveKontostand + " €");
    }
    
    
    
    // CASE 7
    public void printListeAusleihen_PrivatZuZahlen(int idUser) {
	System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	StringBuilder zahlungenAusgabe = new StringBuilder("___Zahlungen Liste:___\n");
	
	ArrayList<Integer> listeAusliehen_privatZuZahlen = ((Kunde) vs.getListeKonten().get(idUser)).getListeAusliehe_PrivatZuZahlen();
	
	for (Integer ii : listeAusliehen_privatZuZahlen) {
	    Ausleihe ausleihe = vs.getListeAusleihen().get(ii);
	    zahlungenAusgabe.append("\n" + ausleihe);
	    zahlungenAusgabe.append("\n noch " + ausleihe.getGebueren() + " zu zahlen");
	}

	zahlungenAusgabe.append("\n-------------------------------------\n");
	System.out.println(zahlungenAusgabe.toString());
    }
}

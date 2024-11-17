package de.hs_mannheim.pr2.bibliothek;

import de.hs_mannheim.pr2.bibliothek.domain.medien.Buch;
import de.hs_mannheim.pr2.bibliothek.facade.Verwaltungssystem;
import de.hs_mannheim.pr2.bibliothek.ui.TextUi;

public class Main {
    public static void main(String[] args) {
	Verwaltungssystem vs = new Verwaltungssystem();
	TextUi ui = new TextUi(vs);
	
	vs.setInventarMedien(new Buch("MobyDick"));
	System.out.println(vs.getInventarMedien());
    }
}

package de.hs_mannheim.pr2.bibliothek;

import de.hs_mannheim.pr2.bibliothek.facade.Verwaltungssystem;
import de.hs_mannheim.pr2.bibliothek.ui.TextUi;

public class Main {
    public static void main(String[] args) {
	Verwaltungssystem vs = new Verwaltungssystem();
	TextUi mainUi = new TextUi(vs);

	mainUi.hauptMenue();
	
    }
    
}

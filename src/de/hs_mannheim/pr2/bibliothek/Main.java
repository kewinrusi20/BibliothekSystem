package de.hs_mannheim.pr2.bibliothek;

import de.hs_mannheim.pr2.bibliothek.facade.Verwaltungssystem;
import de.hs_mannheim.pr2.bibliothek.ui.MainUi;

public class Main {
    public static void main(String[] args) {
	Verwaltungssystem vs = new Verwaltungssystem();
	MainUi mainUi = new MainUi(vs);

	mainUi.hauptMenue();
	
    }
    
}

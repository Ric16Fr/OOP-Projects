package Menue;
import java.io.IOException;
import java.util.ArrayList;

/*
 *  Das ist nur ein Beispiel f�r die Parametrisierung eines Men�s.
 *  Jeder Eintrag ist ein MenuItem. In den Methoden getLocation() und getName()
 *  k�nnen die Eintr�ge Ihren Namen und ihren Stand im Men�baum zur�ckgeben.
 *  In der action-Methode wird ggfs. eine ausf�hrbare Aktion programmiert.
 *  
 *  Der Vorteil der vollst�ndigen Modellierung �ber Klassen, die das Interface 
 *  MenuItem realisieren, ist die einheitliche Verarbeitung (im Gegensatz zu 
 *  speziellen Aktionsklassen).
 *  
 *  public interface MenuItem {
 *      public String[] getLocation();
 *      public String getName();
 *      public boolean action();
 *  }
 */
public class MenuTest {

    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        ArrayList<MenuItem> eintraege = new ArrayList<MenuItem>();
        eintraege.add(new MenuActionAktion0());
        eintraege.add(new MenuActionAktion1());
        eintraege.add(new MenuActionAktion11());
        eintraege.add(new MenuActionAktion2());
        eintraege.add(new MenuActionAktion3());
        eintraege.add(new MenuActionAktion31());
        eintraege.add(new MenuActionAktion4());
        eintraege.add(new MenuActionAktion5());
        Menu m = new Menu();
        m.showMenu(eintraege);
    }
}

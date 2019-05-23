import java.io.*;
import java.util.ArrayList;
import java.util.TreeSet;

/*
 * Created on 30.04.2010
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author gert.faustmann
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Menue {
    private ArrayList<MenueFenster> fensterListe = new ArrayList<MenueFenster>();
    private ArrayList<MenueAktion> aktionsListe = new ArrayList<MenueAktion>();
    private MenueFenster aktuellesFenster;
    
    public void add(MenueFenster m){
        fensterListe.add(m);
    }
    
    public void add(MenueAktion a){
        aktionsListe.add(a);
    }

    /*  Der eigentliche Menueinterpreter
     *  Hier wird
     *      - das aktuelle Menuefenster gesetzt
     *      - das Fenster angezeigt
     *      - eine Auswahl vom Nutzer eingelesen
     *      - eventuell eine Aktion ausgeführt
     */
 
    public void start() throws NumberFormatException, IOException {
        aktuellesFenster = fensterListe.get(0);
        
        char wahl = 'x';
        while (wahl != 'e'){
        	
            // Auswahl anzeigen
            clearScreen();
            aktuellesFenster.zeige();
                       
            // Eingabe einlesen
            wahl = eingabe();
            
            // Pfad neu setzen bzw. Aktion ausführen
            
            // Nutzer will im Menue zurueck
            if (wahl == 'u'){
            	for(MenueFenster m:fensterListe){
            	    if (liste_enthaelt(m.getEintraege(), aktuellesFenster.titel)){
            	        aktuellesFenster = m;
            }	}   }
            
            // Programmende ausgewaehlt
            if (wahl == 'e'){
            	System.exit(0);
            }
           
            // Echte Auswahl
            // Bis jetzt nur Eingabe von 1..9 umgesetzt
            if (wahl>=49 && wahl<=(48+aktuellesFenster.getEintraege().length)){
	        	int zahl = wahl - 48;
	        	String gewaehlt = aktuellesFenster.getEintraege()[zahl-1];
	        	
	        	//Submenü bzw Aktion suchen
	        	for(MenueFenster m :fensterListe){
	        	    if (m.titel.equals(gewaehlt)){
                        aktuellesFenster = m;          // Submenue gefunden? Dann aktuelles setzen.
                }   }
	        	for(MenueAktion a : aktionsListe){
	        	    if (a.titel.equals(gewaehlt)){
	        	        a.action();                   // Aktion gefunden? Dann ausfuehren.
	        	}    }      
            }
        }
    }
    
    
    private boolean liste_enthaelt(String[] eintraege, String titel) {
        for(String s: eintraege){
            if (s.equals(titel)){
                return true;
        }   }
        return false;
    }


	private char eingabe() throws NumberFormatException, IOException{
        System.out.print("Bitte treffen Sie Ihre Auswahl (u = up, e = end): ");
        BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
        return din.readLine().charAt(0);
    }


    
    private void clearScreen() throws IOException{
        for(int i=1; i<100; i++){
            System.out.println();
        }
    }
}

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
public class Menu {

    //private ArrayList<MenuItem> menuObjects = new ArrayList<MenuItem>();
    private ArrayList<String> aktPos = new ArrayList<String>();

    public void showMenu(ArrayList<MenuItem> menus) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        char wahl = 'x';
        while (wahl != 'e'){
        	
            // Auswahl berechnen
        	ArrayList<MenuItem> relMen = new ArrayList<MenuItem>();
            for(int i=0; i<menus.size(); i++){
                MenuItem m = menus.get(i);
                // Relevante Menüeinträge finden
                if(isOnPath(m) && !isInList(m, relMen)){
                	relMen.add(m);
                }
            }
                	
            // Auswahl anzeigen
            // System.out.println();
            clearScreen();
            System.out.print("Sie befinden sich: Hauptmenue ");
            for (int i=0; i<aktPos.size(); i++){
            	System.out.print("-> ");
            	System.out.print(aktPos.get(i)+" ");
            }
            System.out.println();
            System.out.println();
            for(int i=0; i<relMen.size(); i++){
                System.out.print("("+(i+1)+") ");	// Auswahlnummer
                MenuItem m = (MenuItem)relMen.get(i);
                int tiefe = aktPos.size();
                if(m.getLocation().length>tiefe){
                		System.out.println("Submenue: "+m.getLocation()[tiefe]);
                }else{
                		System.out.println("Befehl: "+m.getName());
                }
            }
            
            
            // Eingabe einlesen
            wahl = eingabe();
            
            // Pfad neu setzen bzw. Aktion ausführen
            
            // Nutzer will im Menue zurueck
            if (wahl == 'u'){
            	if(aktPos.size()>0){
            		aktPos.remove(aktPos.size()-1);
            	}
            }
            
            // Programmende ausgewaehlt
            if (wahl == 'e'){
            	System.exit(0);
            }
           
            // Echte Auswahl
            // Bis jetzt nur Eingabe von 1..9 umgesetzt
            if (wahl>=49 && wahl<=(48+relMen.size())){
	        	int zahl = wahl - 48;
	        	MenuItem m = (MenuItem)relMen.get(zahl-1);
	        	int tiefe = aktPos.size();
	        	if(m.getLocation().length>tiefe){
	        		aktPos.add(m.getLocation()[tiefe]);
	        	}else{
	        	    System.out.println("\n------------");
	        		m.action();
	        		System.out.println("------------");
	        	}
            }
        }
    }
    
    
    /**
	 * @param m
	 * @param relMen
	 * @return
	 */
	private boolean isInList(MenuItem m, ArrayList<MenuItem> relMen) {
		// TODO Auto-generated method stub
		int tiefe = aktPos.size();
    	for (int j=0; j<relMen.size(); j++){
    		if(m.getLocation().length > aktPos.size() &&
    			((MenuItem)(relMen.get(j))).getLocation().length > aktPos.size()&&
    			m.getLocation()[tiefe].equals(((MenuItem)(relMen.get(j))).getLocation()[tiefe])){
    			return true;
    		}
    	}
		return false;
	}

	/**
	 * @param m
	 * @return
	 */
	private boolean isOnPath(MenuItem m) {
		// TODO Auto-generated method stub
	    if(aktPos.size() > m.getLocation().length) return false;
		for(int i=0; i<aktPos.size(); i++){
			if(!aktPos.get(i).equals(m.getLocation()[i])){
				return false;
			}
		}
		return true;
	}

	private char eingabe() throws NumberFormatException, IOException{
        System.out.print("Bitte treffen Sie Ihre Auswahl (u = up, e = end): ");
        BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
        return din.readLine().charAt(0);
    }

//    private String[] readMenuClasses(){
//		File projPfad = new File(".");
//		String[] eintraege = projPfad.list(new MenuFilter());
//		for(int i=0; i<eintraege.length; i++){
//			eintraege[i] = eintraege[i].substring(0, eintraege[i].indexOf('.'));
//		}
//		return eintraege;
//	}
    
    private void clearScreen() throws IOException{
        for(int i=1; i<100; i++){
            System.out.println();
        }
    }
}

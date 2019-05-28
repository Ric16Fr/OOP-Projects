import java.io.*;
import java.util.*;

import de.baberlin.konto.Konto;
import de.baberlin.konto.spezial.Giro;
import de.baberlin.konto.spezial.Spar;
import de.hwrberlin.datum.Datum;

/*
 * Created on 10.05.2007
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
public class ArtikelSortTest {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		ArrayList<Artikel> liste = new ArrayList<Artikel>();
		
		Artikel a1 = new Artikel(10, "Hut", 20.99);
		a1.erstellt = new Datum(1,1,2000);
		a1.geaendert = new Datum (1,3, 2005);
		Artikel a2 = new Artikel(2, "Socken", 15.29);
		a2.erstellt = new Datum (12, 3, 2004);
		a2.geaendert = new Datum(15,3,2004);
		Artikel a3 = new Artikel(7, "Schuhe", 89.29);
		a3.erstellt = new Datum(17, 03, 1999);
		a3.geaendert = new Datum(1, 4, 2005);
		liste.add(a1);
		liste.add(a2);
		liste.add(a3);
		
		Collections.sort(liste, new DatumComparable("geaendert"));
		ausgabe(liste);
		
		Collections.sort(liste, new DatumComparable("erstellt"));
        ausgabe(liste);
        
        Spar s1 = new Spar(12346, "Gerda Schulze", 657.34F, 3.0F);
        s1.erstellung = new Datum(1,1,2000);
        Giro g1 = new Giro(12347, "Emil Meier", -223.89F, 1000.0F, 8.9F);
        g1.erstellung = new Datum(13, 5, 1987);
        Giro g2 = new Giro(12348, "Emilie Beier", -4223.89F, 500.0F, 8.9F);
        g2.erstellung = new Datum(23, 5, 2002);
        ArrayList<Konto> kontenliste = new ArrayList<Konto>();
        kontenliste.add(s1);
        kontenliste.add(g1);
        kontenliste.add(g2);
        
        Collections.sort(kontenliste, new DatumComparable("erstellung"));
        ausgabe(kontenliste);
        
	}
	
	public static void ausgabe(ArrayList<?> l){
	    Iterator<?> i = l.iterator();
	    while (i.hasNext()){
	        System.out.println(i.next());
	    }
	    System.out.println();
	}
}

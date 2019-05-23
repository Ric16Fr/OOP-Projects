import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import de.baberlin.konto.Konto;
import de.baberlin.konto.spezial.*;

/*
 * Created on 19.04.2007
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
public class MeineBank {
	private Konto[] liste;
	int anzahl;
	final int MAX_ANZAHL = 100;
	
	public MeineBank(){
		liste = new Konto[MAX_ANZAHL];
		anzahl = 0;
	}
	
	public void displayAll(){
		for(int i=0; i<anzahl; i++){
			System.out.println("Konto "+(i+1)+": ");
			liste[i].display();
			System.out.println();
		}
	}
	
	public boolean insertSpar(int nr, String name, float stand, float habenzinssatz){
		if(anzahl>=MAX_ANZAHL) return false;
		liste[anzahl] = new Spar(nr, name, stand, habenzinssatz);
		anzahl++;
		return true;
	}
	
	public boolean insertGiro(int nr, String name, float stand, float ueberziehungslimit,
			float sollzinssatz){
		if(anzahl>=MAX_ANZAHL) return false;
		liste[anzahl] = new Giro(nr, name, stand, ueberziehungslimit, sollzinssatz);
		anzahl++;
		return true;
	}
	
	public void speicherKonten(String datei){
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(datei));
			out.writeObject(liste);
			out.writeObject(new Integer(anzahl));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void ladeKonten(String datei){
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(datei));
			liste = (Konto[])in.readObject();
			anzahl = ((Integer)(in.readObject())).intValue();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	

}

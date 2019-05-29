package artikel2;

import java.util.*;

public class Artikel {
    private int nr;
    private String bezeichnung;
    private double preis; 
    private Datum imSortimentSeit;
    private int quantity; 
    private Datum letzteAktualisierung; 
    private Datum letzterVerkauf; 
    static private int anzahl = 0;

    public Artikel(int nr, String bezeichnung, double preis) {
        this.nr = nr;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        this.letzteAktualisierung = new Datum(); 
        
        imSortimentSeit = new Datum();
        anzahl++;
    }
    
    public Artikel(int nr, String bezeichnung, double preis,int quantity,  Datum imSortimentSeit) {
        this.nr = nr;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
        this.quantity = quantity; 
        this.imSortimentSeit = imSortimentSeit;
        this.letzteAktualisierung = new Datum(); 
        anzahl++;
    }
    
    
    public static int getAnzahl() {
        return anzahl;
    }

    public void print(){
        System.out.println("Artikelnummer:\t\t"+nr+"\t");
        System.out.println("Bezeichnung:\t\t"+bezeichnung+"\t");
        System.out.println("Verkaufspreis:\t\t"+preis+"\t");
        System.out.println("Anzahl Artikel:\t\t"+quantity+"\t");
        System.out.print("Im Sortiment seit:\t");
        imSortimentSeit.print();
        System.out.println();
    }
    
    public static void listeAusgeben(Collection<Artikel> liste){
		Iterator<Artikel> it = liste.iterator();
		while(it.hasNext()){
			((Artikel)it.next()).print();
		}}
    
    public static void listeAusgeben(ArrayList<Artikel> liste){
		Iterator<Artikel> it = liste.iterator();
		while(it.hasNext()){
			((Artikel)it.next()).print();
		}}
    
    // Getter&Setter

	public int getNr() {
		return nr;
		
	}

	public void setNr(int nr) {
		this.letzteAktualisierung = new Datum(); 
		this.nr = nr;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
		this.letzteAktualisierung = new Datum(); 
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
		this.letzteAktualisierung = new Datum(); 
	}

	public Datum getImSortimentSeit() {
		return imSortimentSeit;
	}

	public void setImSortimentSeit(Datum imSortimentSeit) {
		this.imSortimentSeit = imSortimentSeit;
		this.letzteAktualisierung = new Datum(); 
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(this.quantity < quantity){
			this.letzterVerkauf = new Datum(); 
		}
		this.quantity = quantity;
		this.letzteAktualisierung = new Datum(); 
	}

	public Datum getLetzteAktualisierung() {
		return letzteAktualisierung;
	}

	public void setLetzteAktualisierung(Datum letzteAktualisierung) {
		this.letzteAktualisierung = letzteAktualisierung;
	}

	public Datum getLetzterVerkauf() {
		return letzterVerkauf;
	}

	public void setLetzterVerkauf(Datum letzterVerkauf) {
		this.letzterVerkauf = letzterVerkauf;
	}

	public static void setAnzahl(int anzahl) {
		Artikel.anzahl = anzahl;
		
	}
    
}
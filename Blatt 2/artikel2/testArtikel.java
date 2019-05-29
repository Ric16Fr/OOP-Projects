package artikel2;


import java.util.*;

public class testArtikel {

	public static class ArtikelSortTest {

		public static void main(String[] args) {
			ArrayList<Artikel> liste = new ArrayList<Artikel>();
			
			liste.add(new Artikel(10, "Hut", 24.99, 5, new Datum(17, 5, 1989)));
			liste.add(new Artikel(2, "Socken", 4.29, 5, new Datum(22, 1, 2005)));
			liste.add(new Artikel(7, "Schuhe", 55.29, 5, new Datum(28, 3, 1989)));
			liste.add(new Artikel(3, "Hose", 40.99, 2, new Datum())); 
			
			listeAusgeben(liste);
			System.out.println("-------------Nummer");
			Collections.sort(liste, new ArtikelNachNummerComparator());
			listeAusgeben(liste);
			System.out.println("-------------Bezeichner");
			Collections.sort(liste, new ArtikelNachBezComparator());
			listeAusgeben(liste);
			System.out.println("-------------Preis");
			Collections.sort(liste, new ComperatorALLG("preis"));
			listeAusgeben(liste);
			System.out.println("-------------Erstellung");
			Collections.sort(liste, new ArtikelNachErstellungComparator());
			listeAusgeben(liste);
		
			
			}

		public static void listeAusgeben(ArrayList<Artikel> liste){
			Iterator<Artikel> it = liste.iterator();
			while(it.hasNext()){
				((Artikel)it.next()).print();
			}}

		
			
		}

}

		
		
	



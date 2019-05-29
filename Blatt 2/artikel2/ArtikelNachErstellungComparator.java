package artikel2;

import java.util.Comparator;

public class ArtikelNachErstellungComparator implements Comparator<Artikel>{
	   
public int compare(Artikel a1, Artikel a2) {
	 
	if(a1.getImSortimentSeit().getJahr() <= a2.getImSortimentSeit().getJahr()) {
		if(a1.getImSortimentSeit().getMonat() <= a2.getImSortimentSeit().getMonat()) {
			if(a1.getImSortimentSeit().getTag() <= a2.getImSortimentSeit().getTag()) {
				if(a1.getImSortimentSeit().getTag() == a2.getImSortimentSeit().getMonat()) {
					return 0; 
				}
				else return -1; 
			}
			else return 1; 
		}
		else return 1; 
	}
	
	else return 1; 

}

}

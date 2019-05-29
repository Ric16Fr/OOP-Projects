package artikel2;

import java.util.Comparator;

public class ArtikelNachVerkaufsDatum implements Comparator<Artikel>{
	   
public int compare(Artikel a1, Artikel a2) {
	 
	if(a1.getLetzterVerkauf().getJahr() <= a2.getLetzterVerkauf().getJahr()) {
		if(a1.getLetzterVerkauf().getMonat() <= a2.getLetzterVerkauf().getMonat()) {
			if(a1.getLetzterVerkauf().getTag() <= a2.getLetzterVerkauf().getTag()) {
				if(a1.getLetzterVerkauf().getMonat() == a2.getLetzterVerkauf().getMonat()) {
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

package artikel2;

import java.util.Comparator;

public class ArtikelNachAktualisierung  implements Comparator<Artikel>{
	   
public int compare(Artikel a1, Artikel a2) {
	 
	if(a1.getLetzteAktualisierung().getJahr() <= a2.getLetzteAktualisierung().getJahr()) {
		if(a1.getLetzteAktualisierung().getMonat() <= a2.getLetzteAktualisierung().getMonat()) {
			if(a1.getLetzteAktualisierung().getTag() <= a2.getLetzteAktualisierung().getTag()) {
				if(a1.getLetzteAktualisierung().getMonat() == a2.getLetzteAktualisierung().getMonat()) {
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

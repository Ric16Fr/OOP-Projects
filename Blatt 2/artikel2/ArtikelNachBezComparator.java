package artikel2;

import java.util.Comparator;

 


public class ArtikelNachBezComparator implements Comparator<Artikel> {
    public int compare(Artikel a1, Artikel a2) {
    	
    	char[] a = a1.getBezeichnung().substring(0, 1 ).toCharArray();
    	char use1 = a[0]; 
    	char[] b = a2.getBezeichnung().substring(0, 1).toCharArray(); 
    	char use2 = b[0]; 
    	
        if(use1 > use2) return  1;
        if(use1 < use2) return -1;
        return 0;
    }
}
package artikel2;

import java.util.Comparator;

public class ArtikelNachNummerComparator implements Comparator<Artikel>{
    public int compare(Artikel a1, Artikel a2) {
        if(a1.getNr()>a2.getNr()) return 1;
        if(a1.getNr()<a2.getNr()) return -1;
        return 0;
    }
}


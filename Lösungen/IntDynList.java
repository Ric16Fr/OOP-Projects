

public class IntDynList extends IntList {
    public IntDynList(int anzahl){
        super(anzahl);
    }
    
    public boolean insertLast(int zahl){
        if (laenge >= liste.length) erweiterListe();
        liste[laenge] = zahl;
        laenge++;
        return true;
    }
    
    private void erweiterListe() {
        int[] tmpFeld = new int[liste.length+10];
        for(int i=0; i<liste.length; i++){
            tmpFeld[i] = liste[i];
        }
        liste = tmpFeld;       
    }

    public boolean insertPos(int zahl, int pos){
        if (laenge >= liste.length) erweiterListe();
        if(pos<1 || pos>laenge+1) return false; // keine gueltige Position
        for(int i=laenge; i>=pos; i--){
            liste[i] = liste[i-1];
        }
        liste[pos-1] = zahl;
        laenge++;
        return true;
    }
}

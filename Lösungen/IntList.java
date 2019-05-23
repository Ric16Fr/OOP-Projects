

public class IntList {
    protected int[] liste;
    protected int laenge;
    
    public IntList(int anz){
        liste = new int[anz];
        laenge = 0;
    }
    
    public int getLaenge(){
        return laenge;
    }
    
    public int getLastPos(){
        if (laenge == 0){
            return 0;
        }
        return liste[laenge-1];
    }
    
    public int get(int pos){
        if(pos<1 || pos>laenge){
            return 0;
        }
        return liste[pos-1];
    }
    
    public boolean insertLast(int zahl){
        if (laenge >= liste.length) return false;
        liste[laenge] = zahl;
        laenge++;
        return true;
    }
    
    public boolean insertPos(int zahl, int pos){
        if (laenge >= liste.length) return false; // kein freier Platz mehr
        if(pos<1 || pos>laenge+1) return false; // keine gueltige Position
        for(int i=laenge; i>=pos; i--){
            liste[i] = liste[i-1];
        }
        liste[pos-1] = zahl;
        laenge++;
        return true;
    }
    
    public boolean delete(int pos){
        if(pos<1 || pos>laenge) return false;
        for(int i=pos; i<laenge; i++){
            liste[i-1] = liste[i];
        }
        laenge--;
        return true;
    }
    
    public void displayAll(){
        for(int i=0; i<laenge; i++){
            System.out.print(liste[i]+" ");
        }
    }
}

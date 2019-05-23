import java.util.ArrayList;

public class MedienVerwalter {
    private ArrayList<Medium> medienListe = new ArrayList<Medium>();
    
    public void add(Medium m ){
        medienListe.add(m);
    }
    
    public void zeigeAlleMedien(){
        for(Medium m: medienListe){
            System.out.println(m);
        }
    }
    
    public void suche(String suchString){
        for(Medium m: medienListe){
            if(m.enthaelt(suchString)){
                System.out.println(m+"\n");
            }
        }
    }
}

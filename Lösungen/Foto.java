
public class Foto extends PhysMedium {
    public Foto(String titel, int erscheinungsjahr, String standort) {
        this.titel = titel;
        this.erscheinungsjahr = erscheinungsjahr;
        this.standort = standort;
    }
    
    public String toString(){
        String s = "----- Medium: Buch ------";
        s += "\nTitel: "+titel;
        s += "\terschienen: "+erscheinungsjahr;
        s += "\tStandort: "+standort;
        return s;
    }
}

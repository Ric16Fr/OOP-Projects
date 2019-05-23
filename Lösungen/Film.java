

public class Film extends PhysMedium {
    private String regisseur;
    private double spieldauer;
    
    public Film(String titel, String regisseur, int erscheinungsjahr, int spieldauer, String standort) {
        this.titel = titel;
        this.regisseur = regisseur;
        this.erscheinungsjahr = erscheinungsjahr;
        this.spieldauer = spieldauer;
        this.standort = standort;
    }
    
    public String toString(){
        String s = "----- Medium: Film ------";
        s += "\nTitel: "+titel;
        s += "\nRegisseur: "+regisseur;
        s += "\terschienen: "+erscheinungsjahr;
        s += "\nSpieldauer: "+spieldauer;
        s += "\tStandort: "+standort;
        return s;
    }
 
}

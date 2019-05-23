public class Buch extends PhysMedium{
    private String autor;
    private String verlag;
    private int seitenzahl;

    public Buch(String titel, String autor, int jahr, String verlag, String standort, int seitenzahl) {
        this.titel = titel;
        this.autor = autor;
        this.erscheinungsjahr = jahr;
        this.verlag = verlag;
        this.standort = standort;
        this.seitenzahl = seitenzahl;
    }
    
    public String toString(){
        String s = "----- Medium: Buch ------";
        s += "\nTitel: "+titel;
        s += "\nAutor: "+autor;
        s += "\terschienen: "+erscheinungsjahr;
        s += "\nVerlag: "+verlag;
        s += "\t\tSeitenzahl: "+seitenzahl;
        s += "\nStandort: "+standort;
        return s;
    }
}

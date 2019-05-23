

public class FotoDigital extends EMedium {
    public FotoDigital(String titel, int erscheinungsjahr, String speicherort) {
        this.titel = titel;
        this.erscheinungsjahr = erscheinungsjahr;
        this.speicherort = speicherort;
    }
    
    public String toString(){
        String s = "----- Medium: Digitalfoto ------";
        s += "\nTitel: "+titel;
        s += "\terschienen: "+erscheinungsjahr;
        s += "\tSpeicherort: "+speicherort;
        return s;
    }
}



public class Song extends EMedium {
    private String interpret;
    
    public Song(String titel, String interpret, int erscheinungsjahr, String speicherort) {
        this.titel = titel;
        this.interpret = interpret;
        this.erscheinungsjahr = erscheinungsjahr;
        this.speicherort = speicherort;
    }
    
    public String toString(){
        String s = "----- Medium: Song digital ------";
        s += "\nTitel: "+titel;
        s += "\nInterpret: "+interpret;
        s += "\terschienen: "+erscheinungsjahr;
        s += "\tSpeicherort: "+speicherort;
        return s;
    }
}

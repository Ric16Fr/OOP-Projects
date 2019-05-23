public class EBook extends EMedium {
    private String autor;
    private String verlag;

    public EBook(String titel, String autor, int erscheinungsjahr, String verlag, String speicherort) {
        this.titel = titel;
        this.autor = autor;
        this.erscheinungsjahr = erscheinungsjahr;
        this.verlag = verlag;
        this.speicherort = speicherort;
    }
    
    public String toString(){
        String s = "----- Medium: E-Book ------";
        s += "\nTitel: "+titel;
        s += "\nAutor: "+autor;
        s += "\terschienen: "+erscheinungsjahr;
        s += "\nVerlag: "+verlag;
        s += "\tSpeicherort: "+speicherort;
        return s;
    }
}

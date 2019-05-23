

public abstract class Medium {
    protected String titel;
    protected int erscheinungsjahr;
    
    public boolean enthaelt(String suchString){
        return titel.contains(suchString);
    }
}

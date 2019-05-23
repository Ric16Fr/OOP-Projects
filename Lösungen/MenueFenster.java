

public class MenueFenster extends MenueEintrag{
    private String[] eintraege;
    
    public MenueFenster(String titel, String[] eintraege){
        this.titel = titel;
        this.eintraege = eintraege;
    }
    
    public String[] getEintraege(){
        return eintraege;               
    }

    public void zeige() {
        System.out.println("Menue: "+titel);
        System.out.println();
        
        for(int i=0; i<eintraege.length; i++){
            System.out.println((i+1)+" - "+eintraege[i]);
        }
        System.out.println();
    }
}

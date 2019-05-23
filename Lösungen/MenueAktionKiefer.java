import javax.swing.JFrame;

public class MenueAktionKiefer extends MenueAktion {
    public MenueAktionKiefer(String titel){
        this.titel = titel;
    }

    public void action() {        
        JFrame f = new BildanzeigeKiefer();
        f.setVisible(true);      
    }

    @Override
    public void zeige() {
        action();        
    }

}

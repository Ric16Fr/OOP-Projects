import javax.swing.JFrame;

public class MenueAktionErle extends MenueAktion {

        public MenueAktionErle(String titel){
            this.titel = titel;
        }

        public void action() {        
            JFrame f = new BildanzeigeErle();
            f.setVisible(true);      
        }

        @Override
        public void zeige() {
            action();        
        }

}

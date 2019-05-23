import javax.swing.*;

public class BildanzeigeKiefer extends JFrame { 
        public BildanzeigeKiefer() {
                super( "Kiefer");
                setLocation( 10, 10);
                setSize( 512,384 );
                ImageIcon icon = new ImageIcon ("src//Kiefer.jpg");
                JLabel l1 = new JLabel (icon);
                add(l1); // Label hinzufügen
        }
}

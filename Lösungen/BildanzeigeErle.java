import javax.swing.*;

public class BildanzeigeErle extends JFrame { 
        public BildanzeigeErle() {
                super( "Erle");
                setLocation( 10, 10);
                setSize( 512,384 );
                ImageIcon icon = new ImageIcon ("src//Erle.jpg");
                JLabel l1 = new JLabel (icon);
                add(l1); // Label hinzufügen
        }
}

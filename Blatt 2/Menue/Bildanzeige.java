package Menue;
import javax.swing.*;

@SuppressWarnings("serial")
public class Bildanzeige extends JFrame{
    public Bildanzeige(String titel, String datei) {
        super(titel);
        setLocation( 600, 50);
        setSize( 300,400 );
        ImageIcon icon = new ImageIcon (datei);
        JLabel l1 = new JLabel (icon);
        add(l1); // Label hinzufügen
}   }

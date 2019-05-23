import javax.swing.JOptionPane;

public class MenueAktionTanne extends MenueAktion {

    public MenueAktionTanne(String s){
        titel = s;
    }
    
    public void action() {
        JOptionPane.showMessageDialog(null, "Die Tannen (Abies) bilden eine Pflanzengattung in der Familie \n"
                + "der Kieferngew‰chse (Pinaceae). Je nach taxonomischer Auffassung \n"
                + "werden heute entweder 40 Arten oder 47 Arten sowie etliche \n"
                + "Gruppen hybriden Ursprungs oder Variet‰ten, die alle in der gem‰ﬂigten \n"
                + "Zone der Nordhalbkugel und zumeist in Gebirgsregionen vorkommen, unterschieden.");
    }

    @Override
    public void zeige() {
        // TODO Auto-generated method stub
        action();
    }

}

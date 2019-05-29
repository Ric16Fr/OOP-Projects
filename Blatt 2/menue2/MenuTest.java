package menue2;


import java.io.IOException;
import java.util.ArrayList;
public class MenuTest {

    public static void main(String[] args) throws NumberFormatException, IOException {
        // TODO Auto-generated method stub
        ArrayList<MenuItem> eintraege = new ArrayList<MenuItem>();
        eintraege.add(new MenuActionAktion0());
        eintraege.add(new MenuActionAktion1());
        eintraege.add(new MenuActionAktion11());
        eintraege.add(new MenuActionAktion2());
        Menue m = new Menue();
        m.showMenu(eintraege);
    }
}

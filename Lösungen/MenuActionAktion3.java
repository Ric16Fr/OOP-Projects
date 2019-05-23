
/*
 * Created on 04.05.2010
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author gert.faustmann
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class MenuActionAktion3 implements MenuItem {

    /* (non-Javadoc)
     * @see MenuItem#getLocation()
     */
    public String[] getLocation() {
        // TODO Auto-generated method stub
        String[] loc = {"Auswahl3"};
        return loc;
    }

    /* (non-Javadoc)
     * @see MenuItem#getName()
     */
    public String getName() {
        // TODO Auto-generated method stub
        return "Aktion3";
    }

    /* (non-Javadoc)
     * @see MenuItem#action()
     */
    public boolean action() {
        // TODO Auto-generated method stub
        System.out.println("Jetzt Aktion3 ausfuehren.");
        return true;
    }

}

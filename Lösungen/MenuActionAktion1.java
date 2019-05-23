
/*
 * Created on 30.04.2010
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
public class MenuActionAktion1 implements MenuItem {

    /* (non-Javadoc)
     * @see MenuItem#getLocation()
     */
    public String[] getLocation() {
        // TODO Auto-generated method stub
    	String[] locs = {"Auswahl1"};
        return locs;
    }

    /* (non-Javadoc)
     * @see MenuItem#getName()
     */
    public String getName() {
        // TODO Auto-generated method stub
        return "Aktion1";
    }

    /* (non-Javadoc)
     * @see MenuItem#action()
     */
    public boolean action() {
        // TODO Auto-generated method stub
        System.out.println("Aktion1 ausgeführt");
        return true;
    }
}

/*
 * Created on 30.04.2010
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author fm
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class MenuActionAktion11 implements MenuItem {

	/* (non-Javadoc)
	 * @see MenuItem#getLocation()
	 */
	public String[] getLocation() {
		// TODO Auto-generated method stub
		String[] locs = {"Auswahl1", "Auswahl1.1"};
        return locs;
	}

	/* (non-Javadoc)
	 * @see MenuItem#getName()
	 */
	public String getName() {
		// TODO Auto-generated method stub
		return "Aktion 1.1";
	}

	/* (non-Javadoc)
	 * @see MenuItem#action()
	 */
	public boolean action() {
		// TODO Auto-generated method stub
		System.out.println("Aktion 1.1");
		return true;
	}

}

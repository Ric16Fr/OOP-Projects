import java.io.File;
import java.io.FilenameFilter;

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
public class MenuFilter implements FilenameFilter, MenuConstants{
	public boolean accept(File dir, String name) {
        if (name.startsWith(MUSTER) && name.endsWith(".class")) {
            return true;
        }
        return false;
    }
}

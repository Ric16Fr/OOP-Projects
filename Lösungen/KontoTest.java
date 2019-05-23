import de.baberlin.konto.Konto;
import de.baberlin.konto.spezial.*;
//import de.baberlin.konto.spezial.Spar;

/*
 * Created on 17.04.2007
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
public class KontoTest {

	public static void main(String[] args) {
		Spar s1 = new Spar(12346, "Gerda Schulze", 657.34F, 3.0F);
		Giro g1 = new Giro(12347, "Emil Meier", -2223.89F, 1000.0F, 8.9F);
		
		System.out.println("Sparkonto:");
		System.out.println(s1);
		System.out.print("Zinsberechnung: ");
		System.out.println(s1.berechnung()+"\n");
		
		System.out.println("Girokonto:");
		System.out.println(g1);
		System.out.print("Zinsberechnung: ");
		System.out.println(g1.berechnung()+"\n");
	}
}

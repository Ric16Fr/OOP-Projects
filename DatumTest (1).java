import java.util.Arrays;

import de.hwrberlin.datum.Datum;

/*
 * Created on 03.04.2007
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
public class DatumTest {

	public static void main(String[] args) {
		Datum[] dateList = new Datum[5];
		dateList[0] = new Datum(20, 3, 2007);
		dateList[1] = new Datum(8, 4, 2008);
		dateList[2] = new Datum();
		dateList[3] = new Datum(1, 1, 2014);
		dateList[4] = new Datum(20, 4, 2007);
		
		System.out.println("Unsortierte Liste:");
		for(int i=0; i<dateList.length; i++){
			dateList[i].print();
		}
		
		Arrays.sort(dateList);
		
		
		System.out.println("Sortierte Liste:");
		for(int i=0; i<dateList.length; i++){
			dateList[i].print();
		}
	}
}

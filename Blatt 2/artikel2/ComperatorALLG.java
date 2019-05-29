package artikel2;

import java.util.Comparator;

public class ComperatorALLG {

	public ComperatorALLG(String s) {

	public int compare(Object a1, Object a2) {
		 Datum d1 = a1.getClass().getField(s).get(a1);
		 Datum d2 =a2.getClass().getField(s).get(a2);
		if(a1.getPreis()>a2.getPreis()) return 1;
		if(a1.getPreis()<a2.getPreis()) return -1;
		return d1.compareTo(d2);
		  	
	}

}
}

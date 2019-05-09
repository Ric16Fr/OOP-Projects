
package IntList;

import java.util.Collections;

public class SortList extends Liste

{

	public void insert(int wert)

	{

		super.insertLast(wert);

		Collections.sort(super.getList());

	}

}
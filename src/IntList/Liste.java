package IntList;

import java.util.ArrayList;

public class Liste

{

	private ArrayList<Integer> list = new ArrayList<Integer>();

	public int getLastPos()

	{

		int letztePos = list.size();

		return letztePos;

	}

	public int get(int pos)

	{

		int wert = list.get(pos - 1);

		return wert;

	}

	public boolean insertLast(int zahl)

	{

		int gr��e = list.size();

		list.add(zahl);

		if (list.size() > gr��e)

			return true;

		else

			return false;

	}

	public boolean insertPos(int zahl, int pos)

	{

		int gr��e = list.size();

		list.add(pos - 1, zahl);

		if (list.size() > gr��e)

			return true;

		else

			return false;

	}

	public boolean delete(int pos)

	{

		int gr��e = list.size();

		list.remove(pos - 1);

		if (list.size() > gr��e)

			return true;

		else

			return false;

	}

	public void displayAll()

	{

		list.forEach((n) -> System.out.println(n));

	}

	public ArrayList<Integer> getList() {

		return list;

	}

	public void setList(ArrayList<Integer> list) {

		this.list = list;

	}

}
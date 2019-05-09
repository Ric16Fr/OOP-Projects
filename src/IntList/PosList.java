package IntList;

public class PosList extends Liste

{

	private int position = 0;

	public boolean setPos(int pos)

	{

		position = pos - 1;

		if (position == pos - 1)

			return true;

		else

			return false;

	}

	public int next()

	{

		int wert = super.getList().get(position);

		position++;

		return wert;

	}

	public int getLaenge()

	{

		return super.getList().size();

	}

}
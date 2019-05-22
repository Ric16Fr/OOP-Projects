package arithmetik;

public class Addition extends Ausdruck {
	private Ausdruck sum1;
	private Ausdruck sum2;

	public Addition(Ausdruck sum1, Ausdruck sum2) {
		this.sum1 = sum1;
		this.sum2 = sum2;

		// TODO Auto-generated constructor stub
	}

	@Override
	public float auswerten() {
		int x;
		x = (int) (sum1.auswerten() + sum2.auswerten());
		return x;
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return sum1 + " + " + sum2 ;
	}

}

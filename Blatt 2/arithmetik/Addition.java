package arithmetik;

public class Addition extends Ausdruck {

	public Addition(int a, int b) {
		this.a = a;
		this.b = b;

		// TODO Auto-generated constructor stub
	}

	@Override
	public float auswerten() {
		int x;
		x = getA() + getB();
		return x;
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}

package arithmetik;

public class Multiplikation extends Ausdruck {
	public Multiplikation(int a, int b) {
		this.a = a;
		this.b = b;

		// TODO Auto-generated constructor stub
	}

	@Override
	public float auswerten() {
		float x;
		float a;
		float b;
		a = getA();
		b = getB();
		x = a * b;

		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}

package arithmetik;

public class Multiplikation extends Ausdruck {
	Ausdruck a;
	Ausdruck b;

	public Multiplikation(Ausdruck a, Ausdruck b) {
		this.a = a;
		this.b = b;

		// TODO Auto-generated constructor stub
	}

	@Override
	public float auswerten() {
		float x;

		x = a.auswerten() * b.auswerten();

		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public String toString() {
		float x;
		x = a.auswerten() * b.auswerten();
		// TODO Auto-generated method stub
		return a + " * " + b + " = " + x;
	}

}

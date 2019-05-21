package arithmetik;

public class Subtraktion extends Ausdruck {

	public Subtraktion(int a, int b) {
		this.a = a;
		this.b = b;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float auswerten() {
		float x;
		x = getA() - getB();
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public String toString() {
		return null;
//float y;
//y=auswerten();
//		return y;
	}

}

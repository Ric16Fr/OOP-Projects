package arithmetik;

public class Division extends Ausdruck {
	public Division(int a, int b) {
		this.a = a;
		this.b = b;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float auswerten() {
		float x;
		x = getA() / getB();
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}

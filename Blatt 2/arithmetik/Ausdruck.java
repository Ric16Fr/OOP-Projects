package arithmetik;

public abstract class Ausdruck {
	int a;
	int b;

	public abstract float auswerten();

	public abstract String toString();

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}

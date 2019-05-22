package arithmetik;

public class Subtraktion extends Ausdruck {
	Ausdruck min;
	Ausdruck sub;

	public Subtraktion(Ausdruck min, Ausdruck sub) {
		this.min = min;
		this.sub = sub;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float auswerten() {
		float x;
		x = min.auswerten() - sub.auswerten();
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public String toString() {
		float x;
		x = min.auswerten() - sub.auswerten();
		return min + " - " + sub + " = " + x;
	}

}

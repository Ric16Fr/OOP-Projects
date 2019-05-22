package arithmetik;

public class Division extends Ausdruck {
	Ausdruck divd;
	Ausdruck divi;

	public Division(Ausdruck divd, Ausdruck divi) {
		this.divd = divd;
		this.divi = divi;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float auswerten() {
		float x;
		x = divd.auswerten() / divi.auswerten();
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + divd + " / " + divi + ")";
	}

}

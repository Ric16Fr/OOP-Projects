package arithmetik;

public class Zahl extends Ausdruck {
	Ausdruck number;
	public Zahl(Ausdruck number) {
		this.number=number;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float auswerten() {
		return number;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

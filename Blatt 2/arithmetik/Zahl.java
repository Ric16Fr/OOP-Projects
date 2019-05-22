package arithmetik;

public class Zahl extends Ausdruck {
	int number;

	public Zahl(int number) {
		this.number = number;
		// TODO Auto-generated constructor stub
	}

	@Override
	public float auswerten() {
		return number;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(number);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}

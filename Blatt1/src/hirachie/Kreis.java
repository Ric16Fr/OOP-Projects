package hirachie;

public class Kreis extends Eindimensional {

	public Kreis(double length) {
		super(length);

	}

	public double getFlaeche() {
		double l;
		double a;
		l = getLength();
		a = Math.PI * (l * l);
		return a;

	}

	public double getUmfang() {
		double u;
		double l;
		l = getLength();
		u = 2 * Math.PI * l;
		return u;
	}
}

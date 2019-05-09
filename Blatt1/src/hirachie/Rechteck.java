package hirachie;

public class Rechteck extends Zweidimensional {

	public Rechteck(double length, double high) {
		super(length, high);

	}

	public double getFlaeche() {
		double a;
		double l;
		double h;
		l = getLength();
		h = getHigh();
		a = l * h;
		return a;

	}

	public double getUmfang() {
		double u;
		double l;
		double h;
		l = getLength();
		h = getHigh();
		u = 2 * l + 2 * h;
		return u;
	}
}

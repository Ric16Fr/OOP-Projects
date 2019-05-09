package hirachie;

public class Würfel extends Eindimensional {

	public Würfel(double length) {
		super(length);
		// TODO Auto-generated constructor stub
	}



	public double getVolumen() {
		double l;
		double a;
		l = getLength();
		a = l * l * l;
		return a;

	}
}

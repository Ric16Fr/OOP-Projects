package hirachie;

public class W�rfel extends Eindimensional {

	public W�rfel(double length) {
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

package hirachie;

public class Zylinder extends Zweidimensional {

	public Zylinder(double length, double high) {
		super(length, high);
		// TODO Auto-generated constructor stub
	}



	public double getVolumen() {
		double l;
		double h;
		double a;
		l = getLength();
		h = getHigh();
		a = Math.PI * (l * l) * h;
		return a;

	}
}

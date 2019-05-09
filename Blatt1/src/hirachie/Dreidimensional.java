package hirachie;

public class Dreidimensional extends Zweidimensional {

	double deep;

	public Dreidimensional(double length, double high, double deep) {
		super(length, high);
		this.deep = deep;

	}

	public double getDeep() {
		return deep;
	}

	public void setDeep(double deep) {
		this.deep = deep;
	}

	public void print() {
		System.out.println("Höhe: " + getHigh());
		System.out.println("Breite: " + getLength());
		System.out.println("Tiefe: " + getDeep());
	}
}

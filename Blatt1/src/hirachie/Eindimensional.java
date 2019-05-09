package hirachie;

public class Eindimensional extends Form {
 double length;

	public Eindimensional(double length) {
		this.length = length;
		super.display();
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	public void print() {
		System.out.println(("Breite: "+getLength()));
	}
}

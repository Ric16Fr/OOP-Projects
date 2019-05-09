package hirachie;

public class Zweidimensional extends Eindimensional {

	double high;
	
	public Zweidimensional(double length, double high) {
		super(length);
	this.high=high;
	
	}
	
public void print() {
	System.out.println("Höhe: "+getHigh());
	System.out.println(("Breite: "+getLength()));
}

public double getHigh() {
	return high;
}

public void setHigh(double high) {
	this.high = high;
}

}

package hirachie;

public class Dreieck extends Zweidimensional {
	double hypo;

	public Dreieck(double length, double high, double hypo) {
		super(length, high);
		this.hypo = hypo;
	}

	public double getFlaeche() {
		double a;
		double l;
		double h;
		double u;
		double hyp;
		l = getLength();
		h = getHigh();
		hyp = getHypo();
		u = (l + h + hyp) / 2;
		a = u * (u - l) * (u - h) * (u - hyp);
		a = Math.sqrt(a);
		return a;

	}

	public double getHypo() {
		return hypo;
	}

	public void setHypo(double hypo) {
		this.hypo = hypo;
	}

	public double getUmfang() {
		double u;
		double l;
		double h;
		double hyp;
		l = getLength();
		h = getHigh();
		hyp = getHypo();
		u = l + h + hyp;
		return u;
	}
}

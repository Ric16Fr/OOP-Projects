/*
 * Created on 17.04.2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package de.baberlin.konto.spezial;

import de.baberlin.konto.Konto;

/**
 * @author gert.faustmann
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Spar extends Konto{
	float habenzinssatz;
	
	public Spar(int nr, String name, float stand, float habenzinssatz) {
		super(nr, name, stand);
		this.habenzinssatz = habenzinssatz;
	}
	
	public double zinssatz(){
		return habenzinssatz;
	}
	
	public double berechnung(){
		if (this.getStand() > 0){
			return (habenzinssatz/100)*this.getStand();
		}else{
			return 0.0;
		}
	}
	public boolean equals(Object o){
		if (o instanceof Spar){
			Spar g = (Spar) o;
			return (g.habenzinssatz == habenzinssatz &&
					super.equals(o));
		}
		return super.equals(o);
	}

	public String toString(){
		String s = super.toString();
		s += "Habenzins:\t"+habenzinssatz+"\n";
		return s;
	}
	
	public float getHabenzinssatz() {
		return habenzinssatz;
	}
	public void setHabenzinssatz(float habenzinssatz) {
		this.habenzinssatz = habenzinssatz;
	}
}

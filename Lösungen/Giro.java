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
public class Giro extends Konto{
	private float ueberziehungslimit;
	private float sollzinssatz;
	
	public double zinssatz(){
		return sollzinssatz;
	}
	
	public double berechnung(){
		if (this.getStand() < 0){
			return (sollzinssatz/100)*this.getStand();
		}else{
			return 0.0;
		}
	}
	public Giro(int nr, String name, float stand, float ueberziehungslimit,
			float sollzinssatz) {
		super(nr, name, stand);
		this.ueberziehungslimit = ueberziehungslimit;
		this.sollzinssatz = sollzinssatz;
	}
	
	public String toString(){
		String s = super.toString();
		s += "Limit:\t\t"+ueberziehungslimit+"\n";
		s += "Sollzins:\t"+sollzinssatz+"\n";
		return s;
	}
	
	public boolean equals(Object o){
		if (o instanceof Giro){
			Giro g = (Giro) o;
			return (g.sollzinssatz == sollzinssatz &&
					g.ueberziehungslimit == ueberziehungslimit &&
					super.equals(o));
		}
		return super.equals(o);
	}
	
	public float getSollzinssatz() {
		return sollzinssatz;
	}
	public void setSollzinssatz(float sollzinssatz) {
		this.sollzinssatz = sollzinssatz;
	}
	public float getUeberziehungslimit() {
		return ueberziehungslimit;
	}
	public void setUeberziehungslimit(int ueberziehungslimit) {
		this.ueberziehungslimit = ueberziehungslimit;
	}
}

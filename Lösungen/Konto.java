/*
 * Created on 17.04.2007
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package de.baberlin.konto;

/**
 * @author gert.faustmann
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
abstract public class Konto implements Zinsen{
	private int nr;
	private String name;
	private float stand;
	
	public Konto(int nr, String name, float stand) {
		this.nr = nr;
		this.name = name;
		this.stand = stand;
	}
	
	public boolean equals(Object o){
		if (o instanceof Konto){
			Konto k = (Konto) o;
			return (nr == k.nr &&
					name.equals(k.name) &&
					stand == stand);
		}
		return false;
	}
	
	public String toString(){
		String s = new String("Nr:\t\t"+nr+"\n");
		s += "Name:\t\t"+name+"\n";
		s += "Stand:\t\t"+stand+"\n";
		return s;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	public float getStand() {
		return stand;
	}
	public void setStand(float stand) {
		this.stand = stand;
	}
}

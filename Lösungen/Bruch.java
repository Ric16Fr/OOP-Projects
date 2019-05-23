package de.baberlin;

/*
 * Created on 10.05.2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author gert.faustmann
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Bruch {
    
    
	int zaehler;
	int nenner;
	
	public Bruch(int zaehler, int nenner) throws DivisionByZero{
		if(nenner == 0){
			throw new DivisionByZero();
		}
		if(zaehler == 0){
		    this.zaehler = zaehler;
		    this.nenner = Math.abs(nenner);
		    return;
		}
		int ggt = ggt(Math.abs(zaehler), Math.abs(nenner));
		this.zaehler = zaehler/ggt;
		this.nenner = nenner/ggt;
		if(this.nenner<0){
				this.nenner *= -1;
				this.zaehler *= -1;
		}
	}
	
	private int ggt(int zaehler, int nenner) {
		if(zaehler == nenner){
			return zaehler;
		}
		if(zaehler<nenner){
			return ggt(zaehler, nenner-zaehler);
		}
		if(nenner<zaehler){
			return ggt(nenner, zaehler-nenner);
		}
		return 1;
	}

	public Bruch div(Bruch b) throws DivisionByZero{
		return new Bruch(zaehler*b.nenner, nenner*b.zaehler);
	}
	
	public Bruch add(Bruch b) {
		return new Bruch(zaehler*b.nenner+b.zaehler*nenner, nenner*b.nenner);
	}
	
	public String toString(){
		return ""+zaehler+"/"+nenner;
	}
	
	/**
     * @return Returns the nenner.
     */
    public int getNenner() {
        return nenner;
    }
	/**
     * @param nenner The nenner to set.
     */
    public void setNenner(int nenner) {
        this.nenner = nenner;
    }
    /**
     * @return Returns the zaehler.
     */
    public int getZaehler() {
        return zaehler;
    }
    /**
     * @param zaehler The zaehler to set.
     */
    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }
}

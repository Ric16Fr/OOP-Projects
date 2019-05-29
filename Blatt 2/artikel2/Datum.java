package artikel2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Datum {
    private int tag;
    private int monat;
    private int jahr;
    
    
    
    public Datum(int tag, int monat, int jahr){
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }
    
    public Datum(){
        GregorianCalendar c = new GregorianCalendar();
        
        this.tag = c.get(Calendar.DATE);
        this.monat = c.get(Calendar.MONTH)+1;
        this.jahr = c.get(Calendar.YEAR);
    }
    
    public void print (){
        System.out.println(tag+"."+monat+"."+jahr);
    
    }

	public int getTag() {
		return tag;
	}

	public void setTag(int tag) {
		this.tag = tag;
	}

	public int getMonat() {
		return monat;
	}

	public void setMonat(int monat) {
		this.monat = monat;
	}

	public int getJahr() {
		return jahr;
	}

	public void setJahr(int jahr) {
		this.jahr = jahr;
	}
    
    
}
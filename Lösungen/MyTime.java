import java.text.DecimalFormat;

/*
 * Created on 05.04.2007
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
public class MyTime {

	private int stunde;
	private int minute;
	private int sekunde;
	
	
	public MyTime(int stunde, int minute, int sekunde) {
		this.sekunde = Math.abs(sekunde);
		this.minute = Math.abs(minute);
		this.stunde = Math.abs(stunde);
		evaluate();
	}
	
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = Math.abs(minute);
		evaluate();
	}
	public int getSekunde() {
		return sekunde;
	}
	public void setSekunde(int sekunde) {
		this.sekunde = Math.abs(sekunde);
		evaluate();
	}
	public int getStunde() {
		return stunde;
	}
	public void setStunde(int stunde) {
		this.stunde = Math.abs(stunde);
		evaluate();
	}
	
	public void evaluate(){
	    if(sekunde >=60){
            minute+=sekunde/60;
            sekunde = sekunde%60;
	    }
        if(minute >= 60){
            stunde  += minute/60;
            minute = minute%60;
        }
        if(stunde >= 24){
            stunde = stunde%24;
        }
	}
	
	public void advance(int st, int min, int sek) {		
		stunde += st;
		minute += min;
		sekunde += sek;
		evaluate();
	}
	
	public void reset(int stunde, int minute, int sekunde) {
	    this.sekunde = Math.abs(sekunde);
        this.minute = Math.abs(minute);
        this.stunde = Math.abs(stunde);
		evaluate();
	}
	
	public void print(){
		DecimalFormat df = new DecimalFormat("00");
		System.out.println(df.format(stunde)+":"+df.format(minute)+":"+df.format(sekunde));
	}
}

import java.util.*;


public class Datum {
    private int tag;
    private int monat;
    private int jahr;
    
    public void init(int tag, int monat, int jahr){
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }
    
    public void print(){
        System.out.println(""+tag+"."+monat+"."+jahr);
    }
    
    public void init(){
        GregorianCalendar cal = new GregorianCalendar();
        tag = cal.get(Calendar.DATE);
        monat = cal.get(Calendar.MONTH)+1;
        jahr = cal.get(Calendar.YEAR);
    }
    
}

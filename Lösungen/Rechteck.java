

public class Rechteck extends Form2Dimensional {
    private double a;
    private double b;
    
    public Rechteck(double a, double b) {
        this.a = a;
        this.b = b;
        this.flaeche = a*b;
        this.umfang = 2*a + 2*b;
    }

    public double getA() {
        return a;
    }
    
    public void setA(double a) {
        this.a = a;
        this.flaeche = a*b;
        this.umfang = 2*a + 2*b;
    }
    
    public double getB() {
        return b;
    }
    
    public void setB(double b) {
        this.b = b;
        this.flaeche = a*b;
        this.umfang = 2*a + 2*b;
    }
    
    
    
    
}

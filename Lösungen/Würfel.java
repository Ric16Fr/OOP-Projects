

public class Würfel extends Form3Dimensional {
    private double a;

    public Würfel(double a) {
        this.a = a;
        this.volumen = a*a*a;
    }
    
    public double getA() {
        return a;
    }
    
    public void setA(double a) {
        this.a = a;
        this.volumen = a*a*a;
    }
    
    
    
    
}

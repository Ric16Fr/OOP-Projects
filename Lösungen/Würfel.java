

public class W�rfel extends Form3Dimensional {
    private double a;

    public W�rfel(double a) {
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

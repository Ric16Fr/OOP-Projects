

public class Zylinder extends Form3Dimensional {
    private double radius;
    private double hoehe;
    
    public Zylinder(double radius, double hoehe) {
        this.radius = radius;
        this.hoehe = hoehe;
        this.volumen = Math.PI*radius*radius*hoehe;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
        this.volumen = Math.PI*radius*radius*hoehe;
    }
    
    public double getHoehe() {
        return hoehe;
    }
    
    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
        this.volumen = Math.PI*radius*radius*hoehe;
    }  
}

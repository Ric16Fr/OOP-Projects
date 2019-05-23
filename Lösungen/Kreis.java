

public class Kreis extends Form2Dimensional {
    private double radius;

    public Kreis(double radius) {
        this.radius = radius;
        this.flaeche = Math.PI * radius * radius;
        this.umfang = 2* Math.PI * radius;
    }
    
    public void setRadius(double r){
        this.radius = r;
        this.flaeche = Math.PI * radius * radius;
        this.umfang = 2* Math.PI * radius;
    }
    
}

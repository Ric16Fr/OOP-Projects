

public class Dreieck extends Form2Dimensional {
    private double a;
    private double b;
    private double c;
    
    public Dreieck(double a, double b, double c) {
        this.a = Math.abs(a);
        this.b = Math.abs(b);
        this.c = Math.abs(c);
        
        this.umfang = this.a+this.b+this.c;
        double max = Math.max(Math.max(this.a, this.b), c);
        
        if(max>=umfang-max){
            System.out.println("Seitenlängen ergeben kein Dreieck. Objekt nicht initialisiert!");
            this.a = 0;
            this.b = 0;
            this.c = 0;
            this.umfang = 0;
            return;
        }
       
        
        double halberUmfang = umfang/2;
        this.flaeche = Math.sqrt(halberUmfang*(halberUmfang-this.a)*(halberUmfang-this.b)*(halberUmfang-this.c));
    }
    
    
}

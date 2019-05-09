package hirachie;


public class FormTest {

    public static void main(String[] args) {
        Dreieck d = new Dreieck(2, 3, 4.999999);
        System.out.println("Fläche des Dreiecks: "+d.getFlaeche());
        System.out.println("Umfang des Dreiecks: "+d.getUmfang());
        
        Zylinder z = new Zylinder(5, 10);
        System.out.println("Volumen des Zylinders: "+z.getVolumen());
            
        Kreis k = new Kreis(10);
        System.out.println("Umfang des Kreises: "+k.getUmfang());
        System.out.println("Fläche des Kreises: "+k.getFlaeche());
    }
//
}

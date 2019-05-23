

/**
 * @author gert.faustmann
 *
 */
public class AusdruckTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ausdruck a = new Addition(new Zahl(3), new Zahl(7));
        Ausdruck b = new Addition(a, new Zahl(12));
        System.out.println(b + " = " + b.auswerten(null));
        
        Bindungen bind = new Bindungen();
        bind.set("x", 23);
        bind.set("y", 20);
        
        Ausdruck c = new Addition(new Variable("x"), new Zahl(7));
        Ausdruck d = new Division(c, new Zahl(3)); 
        Ausdruck e = new Subtraktion(new Zahl(5), d);
        Ausdruck f = new Multiplikation(e, new Zahl(10));
        System.out.println(f + " = " + f.auswerten(bind));
        System.out.println(bind);
        
        bind.set("x", 32);
        System.out.println(f + " = " + f.auswerten(bind));
        System.out.println(bind);
    }

}


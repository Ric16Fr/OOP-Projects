

public class Multiplikation extends Binaeroperation {

    public Multiplikation(Ausdruck a1, Ausdruck a2){
        ausdruck1 = a1;
        ausdruck2 = a2;
    }
    
    @Override
    public int auswerten(Bindungen b) {
        return ausdruck1.auswerten(b) * ausdruck2.auswerten(b);
    }

    public String toString(){
        return "("+ausdruck1.toString()+" * "+ausdruck2.toString()+")";
    }

}

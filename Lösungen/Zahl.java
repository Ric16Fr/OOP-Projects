

public class Zahl extends Literal {
    int z;
    
    public Zahl(int z){
        this.z = z;
    }
    
    public int auswerten(){
        return z;
    }
    
    public String toString(){
        return ""+z;
    }

    @Override
    public int auswerten(Bindungen b) {
        // TODO Auto-generated method stub
        return z;
    }
}

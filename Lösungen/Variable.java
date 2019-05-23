

public class Variable extends Literal{
    private String name;
    
    public Variable(String name){
        this.name = name;
    }
    
    public String toString() {
        return name;
    }

    public int auswerten(Bindungen b) {
        int valValue=0;
        try{
            valValue = b.getValue(name); 
        }catch(Exception e){
            System.out.println("Die Variable "+name+" hat keine Bindung!");
            System.exit(0);
        }
        return valValue;
    }
}

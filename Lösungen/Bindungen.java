import java.util.ArrayList;



public class Bindungen {
    ArrayList<String> variablen = new ArrayList<String>();
    ArrayList<Integer> werte = new ArrayList<Integer>();
    
    public String toString(){
        String ausgabe = "";
        for(int i=0; i<variablen.size(); i++){
            ausgabe += variablen.get(i) + " = " + werte.get(i)+"\n";
        }
        return ausgabe;
    }
    
    public void set(String var, int wert){
        if (variablen.contains(var)){
            int x = variablen.indexOf(var);
            werte.remove(x);
            werte.add(x, wert);
        }else{
            variablen.add(var);
            werte.add(wert);
        }
    }
    
    public int getValue(String var) throws NoSuchFieldException{
        int pos = variablen.indexOf(var);
        if(pos==-1)throw new NoSuchFieldException();
        return werte.get(pos);
    }
}

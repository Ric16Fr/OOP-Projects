

public class IntPositionList extends IntDynList{
    private int positionIndex;
    
    public IntPositionList(int anz) {
        super(anz);
        positionIndex = 0;
    }

    public boolean setPos(int pos){
        if(pos<1 || pos>laenge) return false;
        positionIndex = pos-1;
        return true;
    }
    
    public int next(){
        int gelesen = liste[positionIndex];
        if (positionIndex == laenge-1){
            positionIndex = 0;
        }else{
            positionIndex++;
        }
        return gelesen;
    }
}

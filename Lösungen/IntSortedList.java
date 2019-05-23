

public class IntSortedList extends IntDynList {
    public IntSortedList(int anz) {
        super(anz);
        // TODO Auto-generated constructor stub
    }

    public boolean insert(int zahl){
        if (laenge >= liste.length) return false;
        int index = 0;
        while(index<laenge && zahl>liste[index]){
            index++;
        }
        super.insertPos(zahl, index+1);
        return true;
    }
    
    public boolean insertLast(int zahl){
        return insert(zahl);
    }
    
    public boolean insertPos(int zahl, int pos){
        return insert(zahl);
    }
}

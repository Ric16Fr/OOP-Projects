package IntList;


public class IntListTest {

    /**
     * @param ar
     */
    public static void main(String[] args) {
        
        //
        // Test der IntList
        //
        System.out.println("================");
        System.out.println("Test der IntList");
        System.out.println("================");
        System.out.println("Definition einer IntList mit den folgenden Werten:");
        System.out.println("5 2 35 17 23");
        Liste l = new Liste();
        l.insertLast(5);
        l.insertLast(2);
        l.insertLast(35);
        l.insertLast(17);
        l.insertLast(23);
        l.displayAll();
        
        System.out.println("\nEinsetzen von 100 an Position 2:");
        l.insertPos(100, 2);
        l.displayAll();
        System.out.println("\nEinsetzen von 123 an Position 3:");
        l.insertPos(123, 3);
        l.displayAll();
        System.out.println("\nLoeschen der Position 4:");
        l.delete(4);
        l.displayAll();
        System.out.println("\nLoeschen der Position 1:");
        l.delete(1);
        l.displayAll();

        //
        // Test der PositionList
        //
        System.out.println("\n=====================");
        System.out.println("Test der PositionList");
        System.out.println("=====================");
        PosList p = new PosList();
       
        System.out.println("Definition einer PositionList mit den folgenden Werten:");
        System.out.println("5 2 35 17 23");
        p.insertLast(5);
        p.insertLast(2);
        p.insertLast(35);
        p.insertLast(17);
        p.insertLast(23);
        p.displayAll();
        System.out.println();
        
        System.out.println("Durchlaufen der Liste mit next():");
        for(int i=0; i<p.getLaenge(); i++){
            System.out.print(p.next()+" ");
        }
        
        //
        // Test SortedList
        //
        System.out.println("\n=====================");
        System.out.println("Test der SortedList");
        System.out.println("=====================");
        System.out.println("Definition einer SortedList mit den Werten:");
        System.out.println("5 25 1 33 7 26 0");
        SortList s = new SortList();
        s.insert(5);
        s.insert(25);
        s.insert(1);
        s.insert(33);
        s.insert(7);
        s.insert(26);
        s.insert(0);
        s.insertLast(2);
        System.out.println("Liste nach sortiertem Einfuegen:");
        s.displayAll();
}
}

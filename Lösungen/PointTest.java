

public class PointTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Point p1 = new Point();
        Point p2 = new Point(3, 4, 5);
        
        System.out.print("Der erste Punkt: ");
        p1.print();
        System.out.println("Abstand vom Ursprung: "+p1.norm());
        
        System.out.print("Der zweite Punkt: ");
        p2.print();
        System.out.println("Abstand vom Ursprung: "+p2.norm());
        System.out.print("Negierter Punkt: ");
        p2.negate();
        p2.print();
        System.out.println("Abstand vom Ursprung: "+p2.norm());
    }

}

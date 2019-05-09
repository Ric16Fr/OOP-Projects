package Blatt1;

import java.text.NumberFormat;

public class PointTest {

	public static void main(String[] args) {
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);

		Pointer p1 = new Pointer();
		Pointer p2 = new Pointer(13, 7, -9);

		System.out.print("Der erste Punkt: ");
		p1.print();
		System.out.println();
		System.out.println("Abstand vom Ursprung: " + p1.norm());
		System.out.println();
		System.out.print("Der zweite Punkt: ");
		p2.print();
		System.out.println();
		System.out.println("Abstand vom Ursprung: " + p2.norm());
		System.out.println();
		System.out.print("Negierter Punkt: ");
		p2.negate();
		System.out.println();
		System.out.println("Abstand vom Ursprung: " + p2.norm());
	}

}

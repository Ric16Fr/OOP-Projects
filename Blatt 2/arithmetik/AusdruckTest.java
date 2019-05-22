package arithmetik;

public class AusdruckTest {

	public static void main(String[] args) {
		System.out.println("Erster Test (ohne Variablen): ((3 + 7) * 5) = 50");
		Ausdruck a = new Addition(3, 7);
		System.out.println(a.auswerten());
		a.toString();
		Ausdruck b = new Multiplikation(a, 5);
		System.out.println(b + " = " + b.auswerten());
		System.out.println();
		System.out.println("Zweiter Test (ohne Variablen): (10 * (27 - (51 / 3))) = 100");
		Ausdruck c = new Division(new Zahl(51), new Zahl(3));
		Ausdruck d = new Subtraktion(new Zahl(27), c);
		Ausdruck e = new Multiplikation(new Zahl(10), d);
		System.out.println(e + " = " + e.auswerten());
		System.out.println();
		System.out.println("Dritter Test (mit Variablen): (10 * (((x + 7) / 3) - y)) = 50 mit x=23 und y=5");
		Bindungen bind = new Bindungen();
		bind.set("x", 23);
		bind.set("y", 5);
		Ausdruck f = new Addition(new Variable("x"), new Zahl(7));
		Ausdruck g = new Division(f, new Zahl(3));
		Ausdruck h = new Subtraktion(g, new Variable("y"));
		Ausdruck i = new Multiplikation(new Zahl(10), h);
		System.out.println(i + " = " + i.auswerten(bind));
		System.out.println(bind);

//		System.out.println("Vierter Test (mit Variablen): (10 * (((x + 7) / 3) - y)) = 100 mit x=32 und y=3");
//		bind.set("x", 32);
//		bind.set("y", 3);
//		System.out.println(i + " = " + i.auswerten(bind));
//		System.out.println(bind);
	}
}

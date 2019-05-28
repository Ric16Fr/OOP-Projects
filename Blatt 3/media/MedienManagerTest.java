package media;

public class MedienManagerTest {

	public static void main(String[] args) {
		myMedia m = new myMedia();
		m.add(new EBook("Objektorientierte Programmierung in Java", "Niemann, Alexander", 2012, "bhv",
				"/Dokumente/Uni/eBooks"));
		m.add(new buch("java ist auch eine insel", "Ullenboom, Christian", 2011, "Gallileo", "HWR Lichtenberg", 578));
		System.out.println("***************************");
		System.out.println("Erste Suche nach \"Java\": ");
		System.out.println("***************************");
		m.suche("Java");

		System.out.println("***************************");
		System.out.println("Erweiterung um Medium (Digitalfoto).");
		System.out.println("Zweite Suche nach \"Java\":");
		System.out.println("***************************");
		m.add(new FotoDigital("Java-Funktionen", 2016, "C:\\Java\\Bilder"));
		m.suche("Java");

		System.out.println("_________");
		System.out.println("TEST ÜBUNGSBLATT 3");
		System.out.println("____________");

		Foto urlaub = new Foto("London", 2019, "Regal");
		m.writeObject(urlaub);
		FotoDigital geburtstag = new FotoDigital("Feier 2018", 2018, "C:\\Bilder\\Geburtstag");
		m.writeObject(geburtstag);
		Filme aladdin = new Film("Essen leicht gemacht", 100, 128, "Tim");
		m.writeObject(aladdin);
	}
}
}
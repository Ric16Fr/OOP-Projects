
public class MedienManagerTest {

    public static void main(String[] args) {
        MedienVerwalter m = new MedienVerwalter(); 
        m.add(new EBook("Objektorientierte Programmierung in Java", "Niemann, Alexander", 2012, "bhv", "/Dokumente/Uni/eBooks"));
        m.add(new Buch("Java ist auch eine Insel", "Ullenboom, Christian", 2011, "Gallileo", "HWR Lichtenberg", 578));
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
    }
}

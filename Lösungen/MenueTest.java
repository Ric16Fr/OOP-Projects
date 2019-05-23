import java.io.IOException;

public class MenueTest {

    public static void main(String[] args) throws NumberFormatException, IOException {
       Menue baumMenue = new Menue();
       baumMenue.add(new MenueFenster("Baeume", new String[]{"Laubb�ume", "Nadelb�ume"}));
       baumMenue.add(new MenueFenster("Laubb�ume", new String[]{"Ahorn", "Erle", "Eiche"}));
       baumMenue.add(new MenueFenster("Nadelb�ume", new String[]{"Kiefer", "Tanne", "Zypresse"}));
       baumMenue.add(new MenueAktionKiefer("Kiefer"));  // Anzeige eines JPEGs
       baumMenue.add(new MenueAktionTanne("Tanne"));    // Anzeige eines Textfensters
       baumMenue.add(new MenueAktionErle("Erle"));      // anzeige eines JPEGs
       baumMenue.start();
    }
}

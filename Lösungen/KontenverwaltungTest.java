
public class KontenverwaltungTest {

	public static void main(String[] args) {
		MeineBank b = new MeineBank();
		b.insertSpar(12346, "Gerda Schulze", 657.34F, 3.0F);
		b.insertSpar(12347, "Heinz Schulze", 123.78F, 2.5F);
		b.insertGiro(12348, "Emil Meier", 23.89F, 1000.0F, 8.9F);
		b.insertGiro(12349, "Herbert Mueller", 8769.0F, 2000.0F, 5.9F);		
		b.displayAll();
		b.speicherKonten("test.dat");
		
		MeineBank c = new MeineBank();
        c.ladeKonten("test.dat");        
        c.displayAll();
		
	}
}

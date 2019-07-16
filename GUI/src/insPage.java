import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.DateTime;

public class insPage extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public insPage(Composite parent, int style) {
		super(parent, style);
		setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_GRAY));
		
		Button btnZurckZumHauptmen = new Button(this, SWT.NONE);
		btnZurckZumHauptmen.setBounds(284, 265, 142, 25);
		btnZurckZumHauptmen.setText("Zur\u00FCck zum Hauptmen\u00FC");
		
		Label lblHierKnnenSie = new Label(this, SWT.NONE);
		lblHierKnnenSie.setAlignment(SWT.CENTER);
		lblHierKnnenSie.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.BOLD));
		lblHierKnnenSie.setBounds(29, 10, 397, 30);
		lblHierKnnenSie.setText("Hier k\u00F6nnen Sie neue Produkte erfassen ");
		
		Label lblProduktart = new Label(this, SWT.NONE);
		lblProduktart.setBounds(29, 82, 65, 15);
		lblProduktart.setText("Produktart:");
		
		Combo combo = new Combo(this, SWT.NONE);
		combo.setBounds(135, 74, 132, 30);
		
		Label lblMenge = new Label(this, SWT.NONE);
		lblMenge.setBounds(29, 146, 65, 15);
		lblMenge.setText("Menge: ");
		
		Spinner spinner = new Spinner(this, SWT.BORDER);
		spinner.setBounds(135, 139, 132, 22);
		
		Label lblEinkaufspreis = new Label(this, SWT.NONE);
		lblEinkaufspreis.setText("Einkaufspreis:");
		lblEinkaufspreis.setBounds(29, 193, 79, 15);
		
		Spinner spinner_1 = new Spinner(this, SWT.BORDER);
		spinner_1.setBounds(135, 186, 132, 22);
		
		Label lblVerkaufspreis = new Label(this, SWT.NONE);
		lblVerkaufspreis.setText("Verkaufspreis:");
		lblVerkaufspreis.setBounds(29, 232, 79, 15);
		
		Spinner spinner_2 = new Spinner(this, SWT.BORDER);
		spinner_2.setBounds(135, 225, 132, 22);
		
		Label lblMindestensHaltbarBis = new Label(this, SWT.NONE);
		lblMindestensHaltbarBis.setBounds(530, 60, 132, 25);
		lblMindestensHaltbarBis.setText("Mindestens haltbar bis:");
		
		DateTime dateTime = new DateTime(this, SWT.BORDER);
		dateTime.setBounds(587, 104, 76, 24);
		
		Label lblOderAlternativAnzahl = new Label(this, SWT.NONE);
		lblOderAlternativAnzahl.setBounds(516, 146, 235, 15);
		lblOderAlternativAnzahl.setText("oder alternativ Anzahl an Tagen ab heute:");
		
		Spinner spinner_3 = new Spinner(this, SWT.BORDER);
		spinner_3.setBounds(615, 167, 47, 22);
		
		Button btnArtikelEintragen = new Button(this, SWT.NONE);
		btnArtikelEintragen.setBounds(587, 222, 147, 54);
		btnArtikelEintragen.setText("Artikel eintragen");
		}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}

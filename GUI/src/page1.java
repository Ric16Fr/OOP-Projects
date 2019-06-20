import org.eclipse.swt.widgets.Composite;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseListener;
import java.util.function.Consumer;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class page1 extends Composite {
	private DataBindingContext m_bindingContext;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public page1(Composite parent, int style) {
		super(parent, SWT.NONE);
		setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_FOREGROUND));
		
		Button btnNeuenArtikelIns = new Button(this, SWT.NONE);
		btnNeuenArtikelIns.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		btnNeuenArtikelIns.setBounds(29, 110, 215, 31);
		btnNeuenArtikelIns.setText("Neuen Artikel ins Sortiment aufnehmen");
		
		Button button = new Button(this, SWT.NONE);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button.setText("Artikel entnehmen");
		button.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		button.setBounds(275, 110, 215, 31);
		
		Button button_1 = new Button(this, SWT.NONE);
		button_1.setText("Liste aller Artikel anzeigen");
		button_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		button_1.setBounds(527, 110, 215, 31);
		setM_bindingContext(initDataBindings());

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	protected DataBindingContext initDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		//
		IObservableValue observeBackgroundThisObserveWidget = WidgetProperties.background().observe(this);
		IObservableValue parentGetMenuObserveValue = PojoProperties.value("parent").observe(getMenu());
		bindingContext.bindValue(observeBackgroundThisObserveWidget, parentGetMenuObserveValue, null, null);
		//
		return bindingContext;
	}

	public DataBindingContext getM_bindingContext() {
		return m_bindingContext;
	}

	public void setM_bindingContext(DataBindingContext m_bindingContext) {
		this.m_bindingContext = m_bindingContext;
	}
}

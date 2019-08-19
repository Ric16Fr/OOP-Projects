package app;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import controllers.EditController;
import controllers.InsertController;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @author Julius Kiekbusch (kiekbjul@b-tu.de)
 * @category Programmierpraktikum
 */
public class Article {

	public final StringProperty name = new SimpleStringProperty();
	public final StringProperty storage = new SimpleStringProperty();
	public final ObjectProperty<LocalDate> wasted = new SimpleObjectProperty<>();
	public final IntegerProperty amount = new SimpleIntegerProperty();
	public final IntegerProperty income = new SimpleIntegerProperty();
	public final IntegerProperty outcome = new SimpleIntegerProperty();
	
	public Article(InsertController controller) {
		this.name.set(controller.label_name.getText());
		this.storage.set(controller.str_storage.getText());
		this.wasted.set(controller.date_wasted.getValue());
		this.amount.set(parseInt(controller.int_amount.getText()));
		this.income.set(parseInt(controller.cur_income.getText()));
		this.outcome.set(parseInt(controller.cur_outcome.getText()));
	}
	
	public Article(String str) {
		String[] values = str.split(";");
		this.name.set(values[0]);
		this.wasted.set(parseDate(values[1]));
		this.amount.set(parseInt(values[2]));
		this.storage.set(values[3]);
		this.income.set(parseInt(values[4]));
		this.outcome.set(parseInt(values[5]));
	}

	public void update(EditController controller) {
		this.name.set(controller.label_name.getText());
		this.storage.set(controller.str_storage.getText());
		this.wasted.set(controller.date_wasted.getValue());
		this.amount.set(parseInt(controller.int_amount.getText()));
		this.income.set(parseInt(controller.cur_income.getText()));
		this.outcome.set(parseInt(controller.cur_outcome.getText()));
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name.get());
		sb.append(';');
		sb.append(wasted.get());
		sb.append(';');
		sb.append(amount.get());
		sb.append(';');
		sb.append(storage.get());
		sb.append(';');
		sb.append(income.get());
		sb.append(';');
		sb.append(outcome.get());
		return sb.toString();
	}
	
	public String getName() {
		return name.get();
	}
	
	public void setName(String value) {
		name.set(value);
	}
	
	public String getStorage() {
		return storage.get();
	}
	
	public void setStorage(String value) {
		storage.set(value);
	}
	
	public LocalDate getWasted() {
		return wasted.get();
	}
	
	public void setWasted(LocalDate value) {
		wasted.set(value);
	}
	
	public int getAmount() {
		return amount.get();
	}
	
	public void setAmount(int value) {
		amount.set(value);
	}
	
	public int getIncome() {
		return income.get();
	}
	
	public void setIncome(int value) {
		income.set(value);
	}
	
	public int getOutcome() {
		return outcome.get();
	}
	
	public void setOutcome(int value) {
		outcome.set(value);
	}
	
	private int parseInt(String val) {
		if(val == null || val.isEmpty()) {
			return 0;
		}
		try {
			return Integer.parseInt(val);
		} catch(NumberFormatException ex) {
			return 0;
		}
	}
	
	private LocalDate parseDate(String val) {
		if(val == null || val.isEmpty()) {
			return LocalDate.now();
		}
		try {
			return LocalDate.parse(val);
		} catch(DateTimeParseException ex) {
			return LocalDate.now();
		}
	}
	
	
}

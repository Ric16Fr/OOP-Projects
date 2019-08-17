package app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;

public abstract class TableImport extends Application {

	public class Record {
		// Assume each record have 6 elements, all String

		private SimpleStringProperty Name, Menge, Gewinn, Ablaufdatum, Lagerplatz;

		public String getName() {
			return Name.get();
		}

		public String getMenge() {
			return Menge.get();
		}

		public String getGewinn() {
			return Gewinn.get();
		}

		public String getAblaufdatum() {
			return Ablaufdatum.get();
		}

		public String getLagerplatz() {
			return Lagerplatz.get();
		}

		Record(String f1, String f2, String f3, String f4, String f5) {
			this.Name = new SimpleStringProperty(f1);
			this.Menge = new SimpleStringProperty(f2);
			this.Gewinn = new SimpleStringProperty(f3);
			this.Ablaufdatum = new SimpleStringProperty(f4);
			this.Lagerplatz = new SimpleStringProperty(f5);
		}

	}

	private final TableView<Record> tableAll = new TableView<>();

	private final ObservableList<Record> dataList = FXCollections.observableArrayList();

	public void readCSV() {

		String CsvFile = "..\\content.csv";
		String FieldDelimiter = ",";

		BufferedReader br;

		try {
			br = new BufferedReader(new FileReader(CsvFile));

			String line;
			while ((line = br.readLine()) != null) {
				String[] fields = line.split(FieldDelimiter, -1);

				Record record = new Record(fields[0], fields[1], fields[2], fields[3], fields[4]);
				dataList.add(record);

			}

		} catch (FileNotFoundException ex) {

		} catch (IOException ex) {

		}

	}

	public TableView<Record> getTableAll() {
		return tableAll;
	}

}
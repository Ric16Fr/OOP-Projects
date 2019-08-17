package app;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 import controllers.ListController;

public abstract class TableImport extends Application {
 
    public class Record {
        //Assume each record have 6 elements, all String
 
        private SimpleStringProperty f1, f2, f3, f4, f5, f6;
 
        public String getF1() {
            return f1.get();
        }
 
        public String getF2() {
            return f2.get();
        }
 
        public String getF3() {
            return f3.get();
        }
 
        public String getF4() {
            return f4.get();
        }
 
        public String getF5() {
            return f5.get();
        }
 
        public String getF6() {
            return f6.get();
        }
 
        Record(String f1, String f2, String f3, String f4,
                String f5, String f6) {
            this.f1 = new SimpleStringProperty(f1);
            this.f2 = new SimpleStringProperty(f2);
            this.f3 = new SimpleStringProperty(f3);
            this.f4 = new SimpleStringProperty(f4);
            this.f5 = new SimpleStringProperty(f5);
            this.f6 = new SimpleStringProperty(f6);
        }
 
    }
 
    private final TableView<Record> tableAll = new TableView<>();
 
    private final ObservableList<Record> dataList
            = FXCollections.observableArrayList();
 
    private void readCSV() {
 
        String CsvFile = "C:\\Users\\Richard\\git\\OOP-Projects\\OOP-Projects\\OOP-Lagerverwaltung\\src\\content.csv";
        String FieldDelimiter = ",";
 
        BufferedReader br;
 
        try {
            br = new BufferedReader(new FileReader(CsvFile));
 
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(FieldDelimiter, -1);
 
                Record record = new Record(fields[0], fields[1], fields[2],
                        fields[3], fields[4], fields[5]);
                dataList.add(record);
 
            }
 
        } catch (FileNotFoundException ex) {
          
        } catch (IOException ex) {
           
        }
 
    }
 
    public static void main(String[] args) {
        launch(args);
    }

	public TableView<Record> getTableAll() {
		return tableAll;
	}
 
}
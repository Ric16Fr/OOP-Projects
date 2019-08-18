package controllers;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import app.AppMain;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.input.MouseEvent;

public class EditController {

	@FXML
	void abortAction(ActionEvent event) {
		AppMain.instance.loadScene("list");
	}

	@FXML
	void saveAction(ActionEvent event) {
		try {
			PrintWriter contentWriter = new PrintWriter(new FileWriter("src\\content.csv"), true);
			// contentWriter.println("Name: ");
			contentWriter.print(label_name.getText());
			contentWriter.print(";");
			// contentWriter.println("Ablaufdatum: ");
			contentWriter.print(date_wasted.getValue());
			contentWriter.print(";");
			// contentWriter.println("Menge: ");
			contentWriter.print(int_amount.getText());
			contentWriter.print(";");
			// contentWriter.println("Einkaufspreis: ");
			contentWriter.print(cur_income.getText());
			contentWriter.print(";");
			// contentWriter.println("Lagerplatz: ");
			contentWriter.print(str_storage.getText());
			contentWriter.print(";");
			// contentWriter.println("Verkaufspreis: ");
			contentWriter.print(cur_outcome.getText());
			contentWriter.println();
			contentWriter.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		AppMain.instance.loadScene("list");
	}

	@FXML
	private TextField label_name;

	@FXML
	private Button bt_save;

	@FXML
	private Button bt_abort;

	@FXML
	private ChoiceBox<?> articleID;

	@FXML
	private DatePicker date_wasted;

	@FXML
	private TextField str_storage;

	@FXML
	private TextField cur_income;

	@FXML
	private TextField cur_outcome;

	@FXML
	private TextField int_amount;

	@FXML
	void articleName(ActionEvent event) {

	}

	@FXML
	void changeArticle(MouseEvent event) {

	}

	@FXML
	void setAmount(ActionEvent event) {

	}

	@FXML
	void setIncome(ActionEvent event) {

	}

	@FXML
	void setStorage(ActionEvent event) {

	}

	@FXML
	void set_outcome(ActionEvent event) {

	}

	@FXML
	void wastedDate(ActionEvent event) {

	}

	@FXML
	private TitledPane frame;

}

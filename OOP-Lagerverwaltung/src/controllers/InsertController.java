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
import javafx.scene.input.MouseEvent;

public class InsertController {

	@FXML
	void abortAction(ActionEvent event) {
		AppMain.instance.loadScene("index");
	}

	@FXML
	void saveAction(ActionEvent event) {
		try {
			PrintWriter contentWriter = new PrintWriter(new FileWriter("content.txt"), true);
			contentWriter.println("Test");
			contentWriter.print(label_name.getText().toString());
			contentWriter.print(date_wasted.getConverter().toString());
			contentWriter.print(int_amount.getText().toString());
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
}

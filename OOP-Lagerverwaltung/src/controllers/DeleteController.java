package controllers;

import app.AppMain;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class DeleteController {

	@FXML
	private Slider int_amount;

	@FXML
	void setAmount(MouseEvent event) {

	}

	@FXML
	private Button bt_sell;

	@FXML
	private Button bt_delete;

	@FXML
	private Button bt_abort;

	@FXML
	void abortAction(ActionEvent event) {
		AppMain.instance.loadScene("list");
	}

	@FXML
	void deleteObject(ActionEvent event) {
		AppMain.instance.loadScene("list");
	}

	@FXML
	void sellObject(ActionEvent event) {
		AppMain.instance.loadScene("list");
	}

	@FXML
	private Button bt_abortMain;

	@FXML
	void abortActionMain(ActionEvent event) {
		AppMain.instance.loadScene("index");
	}

	@FXML
	private TextField cur_income;

	@FXML
	private TextField cur_outcome;

	@FXML
	private TextField cur_marge;

	@FXML
	private ChoiceBox<?> articleID;
}

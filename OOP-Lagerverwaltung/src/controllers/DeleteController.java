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
	int setAmount(MouseEvent int_amount) {
		int x = equal(int_amount);
		return x;
	}

	private int equal(MouseEvent int_amount) {
		return int_amount.getClickCount();
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
		// deleter(articleID, setAmount(null)); // TODO umändern auf reader
		AppMain.instance.loadScene("list");
	}

	private boolean deleter(ChoiceBox<?> articleID, int setAmount) {

		boolean success = false;
		return success;

	}

	@FXML
	void sellObject(ActionEvent event) {
		seller(articleID, setAmount(null)); // TODO umändern, auf reader
		AppMain.instance.loadScene("list");
	}

	private boolean seller(ChoiceBox<?> articleID, int setAmount) {
		boolean success = false;
		return success;

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

	@FXML
	void loadArticle(MouseEvent event) {

	}
}

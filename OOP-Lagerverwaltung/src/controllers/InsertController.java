package controllers;

import app.AppMain;
import app.Article;
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
		AppMain.instance.articles.add(new Article(this));
		AppMain.instance.saveArticles();
		AppMain.instance.editArticle = null;
		AppMain.instance.loadScene("list");
	}

	@FXML
	public TextField label_name;

	@FXML
	public Button bt_save;

	@FXML
	public Button bt_abort;

	@FXML
	public ChoiceBox<?> articleID;

	@FXML
	public DatePicker date_wasted;

	@FXML
	public TextField str_storage;

	@FXML
	public TextField cur_income;

	@FXML
	public TextField cur_outcome;

	@FXML
	public TextField int_amount;

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

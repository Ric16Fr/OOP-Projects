package controllers;

import app.AppMain;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ListController<Artikel> {

	@FXML
	private CheckBox check_filter;

	@FXML
	private Button bt_edit;

	@FXML
	private Button bt_delete;

	@FXML
	private Button bt_abort;

	@FXML
	void abortAction(ActionEvent event) {
		AppMain.instance.loadScene("index");
	}

	@FXML
	void deleteArticle(ActionEvent event) {
		AppMain.instance.loadScene("delete");
	}

	@FXML
	void editArticle(ActionEvent event) {
		AppMain.instance.loadScene("edit");
	}

	@FXML
	void filterDate(ActionEvent event) {

	}

	@FXML
	private TextField articleID;

	@FXML
	private TableView<Artikel> tableAll;
	
	@FXML
	private TableColumn<?, ?> label_name;

	@FXML
	private TableColumn<?, ?> str_amount;

	@FXML
	private TableColumn<?, ?> cur_income;

	@FXML
	private TableColumn<?, ?> cur_outcome;

	@FXML
	private TableColumn<?, ?> date_wasted;

	@FXML
	private TableColumn<?, ?> str_storage;

}

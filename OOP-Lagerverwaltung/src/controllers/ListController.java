package controllers;

import java.time.LocalDate;

import app.AppMain;
import app.Article;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class ListController {

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
		AppMain.instance.editArticle = tableAll.selectionModelProperty().get().getSelectedItem();
		AppMain.instance.loadScene("delete");
	}

	@FXML
	void editArticle(ActionEvent event) {
		AppMain.instance.editArticle = tableAll.selectionModelProperty().get().getSelectedItem();
		AppMain.instance.loadScene("edit");
	}

	@FXML
	void filterDate(ActionEvent event) {

	}
	
	@FXML
	void initialize() {
		tableAll.setItems(AppMain.instance.articles);
		tableAll.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		label_name.setCellValueFactory(new PropertyValueFactory<Article, String>("name"));
		str_amount.setCellValueFactory(new PropertyValueFactory<Article, Integer>("amount"));
		cur_income.setCellValueFactory(new PropertyValueFactory<Article, Integer>("income"));
		cur_outcome.setCellValueFactory(new PropertyValueFactory<Article, Integer>("outcome"));
		date_wasted.setCellValueFactory(new PropertyValueFactory<Article, LocalDate>("wasted"));
		str_storage.setCellValueFactory(new PropertyValueFactory<Article, String>("storage"));
	}

	@FXML
	private TextField articleID;

	@FXML
	private TableView<Article> tableAll;
	
	@FXML
	private TableColumn<Article, String> label_name;

	@FXML
	private TableColumn<Article, Integer> str_amount;

	@FXML
	private TableColumn<Article, Integer> cur_income;

	@FXML
	private TableColumn<Article, Integer> cur_outcome;

	@FXML
	private TableColumn<Article, LocalDate> date_wasted;

	@FXML
	private TableColumn<Article, String> str_storage;

}

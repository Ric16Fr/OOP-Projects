package de.ricfr.app.controllers;

import de.ricfr.app.AppMain;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

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
		AppMain.instance.loadScene("delete");
	}

	@FXML
	void editArticle(ActionEvent event) {
		AppMain.instance.loadScene("edit");
	}

	@FXML
	void filterDate(ActionEvent event) {

	}

}

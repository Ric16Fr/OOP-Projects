package de.ricfr.app.controllers;


import de.ricfr.app.AppMain;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class IndexController {

    @FXML
    private Button bt_new;

    @FXML
    private Button bt_view;

    @FXML
    private Button bt_delete;

    @FXML
    void deleteArticle(ActionEvent event) {
    	AppMain.instance.loadScene("delete");
    }

    @FXML
    void newArticle(ActionEvent event) {
    	AppMain.instance.loadScene("insert");
    }

    @FXML
    void viewArticles(ActionEvent event) {
    	AppMain.instance.loadScene("list");
    }

}

package de.ricfr.app.controllers;

import de.ricfr.app.AppMain;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class DeleteController {

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
    	AppMain.instance.loadScene("index");
    }

    @FXML
    void sellObject(ActionEvent event) {
    	AppMain.instance.loadScene("list");
    }

}

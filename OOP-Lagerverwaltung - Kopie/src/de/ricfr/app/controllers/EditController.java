package de.ricfr.app.controllers;

import de.ricfr.app.AppMain;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class EditController {

    @FXML
    private Button bt_save;

    @FXML
    private Button bt_abort;

    @FXML
    void abortAction(ActionEvent event) {
    	AppMain.instance.loadScene("list");
    }

    @FXML
    void saveAction(ActionEvent event) {
    	AppMain.instance.loadScene("list");
    }

}

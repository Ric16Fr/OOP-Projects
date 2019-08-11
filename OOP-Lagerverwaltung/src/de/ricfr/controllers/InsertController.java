package de.ricfr.controllers;

import de.ricfr.app.AppMain;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class InsertController {

    @FXML
    private TextField label_name;

    @FXML
    private Spinner<?> int_amount;

    @FXML
    private ChoiceBox<?> str_storage;

    @FXML
    private Spinner<?> cur_income;

    @FXML
    private Spinner<?> cur_outcome;

    @FXML
    private ComboBox<?> date_wasted;

    @FXML
    private Button bt_save;

    @FXML
    private Button bt_abort;

    @FXML
    void abortAction(ActionEvent event) {
    	AppMain.instance.loadScene("index");
    }

    @FXML
    void articleName(ActionEvent event) {

    }

    @FXML
    void saveAction(ActionEvent event) {
    	AppMain.instance.loadScene("list");
    }

    @FXML
    void setAmount(MouseEvent event) {

    }

    @FXML
    void setIncome(MouseEvent event) {

    }

    @FXML
    void setStorage(MouseEvent event) {

    }

    @FXML
    void set_outcome(MouseEvent event) {

    }

    @FXML
    void wastedDate(ActionEvent event) {

    }

}

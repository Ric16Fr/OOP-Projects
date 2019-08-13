package controllers;

import app.AppMain;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class EditController {

	@FXML
	void abortAction(ActionEvent event) {
		AppMain.instance.loadScene("list");
	}

	@FXML
	void saveAction(ActionEvent event) {
		AppMain.instance.loadScene("list");
	}

    @FXML
    private TextField label_name;

    @FXML
    private Button bt_save;

    @FXML
    private Button bt_abort;

    @FXML
    private ChoiceBox<?> articleID;

    @FXML
    private DatePicker date_wasted;

    @FXML
    private TextField str_storage;

    @FXML
    private TextField cur_income;

    @FXML
    private TextField cur_outcome;

    @FXML
    private TextField int_amount;



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

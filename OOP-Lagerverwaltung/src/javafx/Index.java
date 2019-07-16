package javafx;


import javafx.fxml.FXMLLoader;

import javafx.scene.Parent;

import javafx.scene.Scene;

import javafx.stage.Stage;
import javafx.application.Application;

public class Index extends Application {

	@Override

	public void start(Stage primaryStage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("index.fxml"));

		primaryStage.setTitle("Hello World");

		primaryStage.setScene(new Scene(root));

		primaryStage.show();

	}

//    @Override
//    public void start(Stage stage) throws Exception {
//       Parent root = FXMLLoader.load(getClass().getResource("fxml_example.fxml"));
//    
//        Scene scene = new Scene(root, 300, 275);
//    
//        stage.setTitle("FXML Welcome");
//        stage.setScene(scene);
//        stage.show();
//    }
	public static void main(String[] args) {

		launch(args);

	}

}
package de.ricfr.app;
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {
	
	public static AppMain instance;
	private Stage stage;

	// https://github.com/openjfx/samples/tree/master/IDE/Eclipse/Non-Modular/Java/hellofx/src/hellofx
	// JavaFX SceneBuilder
	@Override
	public void start(Stage primaryStage) throws Exception {
		AppMain.instance = this;
		stage = primaryStage;

		loadScene("index");

		
		primaryStage.setTitle("StuPaCa Lagerverwaltung");
		primaryStage.centerOnScreen();
		primaryStage.show();
	}
	public void loadScene(String name) {

		try {
			setRoot();
			Parent root = FXMLLoader.load(getClass().getResource("layouts/" + name + ".fxml"));
			Scene scene = new Scene(root);
			
			scene.getStylesheets().add("de/ricfr/app/style.css");
			
			stage.setScene(scene);
			stage.sizeToScene();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
	private void setRoot() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}

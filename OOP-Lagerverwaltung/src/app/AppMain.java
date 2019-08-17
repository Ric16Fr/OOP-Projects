package app;

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
//	--module-path "<Pfad zum Installationsverzeichnis>\OOP-Lagerverwaltung\src\javafx-sdk-12.0.1\lib" --add-modules javafx.controls,javafx.fxml
	@Override
	public void start(Stage primaryStage) throws Exception {
		AppMain.instance = this;
		stage = primaryStage;

		loadScene("index");

		primaryStage.setTitle("StuPaCa Lagerverwaltung"); // Festlegen des Haupttitels
		primaryStage.centerOnScreen(); // Ausrichtung des Fensters
		primaryStage.show(); // Einblendung
	}

	public void loadScene(String name) {

		try {
			// Methode um die zu den einzelnen Seiten passende FXML Datei zu laden
			setRoot();
			Parent root = FXMLLoader.load(getClass().getResource("../layouts/" + name + ".fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add("app/style.css");
			stage.setScene(scene);
			stage.sizeToScene();
		} catch (IOException e) {
			// Fehler, falls eine Seite nicht gefunden wird
			System.out.println("Seite nicht gefunden, hier noch die Fehlermeldung:");
			System.out.println();
			e.printStackTrace();
		}

	}

	private void setRoot() {
		// setzt die Hauptseite. Wird eh durch die Suche überschrieben und kann daher
		// leer bleiben

	}

	public static void main(String[] args) {
		launch(args); // Aufruf der ersten Seite
	}

}

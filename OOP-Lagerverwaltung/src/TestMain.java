import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TestMain extends Application {

	// https://github.com/openjfx/samples/tree/master/IDE/Eclipse/Non-Modular/Java/hellofx/src/hellofx
	// JavaFX SceneBuilder
	@Override
	public void start(Stage stage) throws Exception {
		
		VBox parent = new VBox();
		
		parent.getChildren().add(new Label("Hallo, Welt 2!"));
		
		Scene scene = new Scene(parent, 500, 300);
		Scene scene2 = new Scene(new Group(new Label("Haupmenü")), 500, 300);
		
		Button changeScene = new Button("Szene Wechseln");
		changeScene.setOnAction((event) -> {
			stage.setScene(scene2);
		});
		
		parent.getChildren().add(changeScene);
		
		stage.setScene(scene);
		stage.setTitle("Hallo, Welt!");
		stage.sizeToScene();
		stage.centerOnScreen();
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}

package hust.soict.hedspi.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PhucNH_Painter extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/hust/soict/hedspi/javafx/PhucNH_Painter.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("PhucNH_Painter");
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}

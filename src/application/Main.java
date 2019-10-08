package application;
	
import Auto.Model.Archivio;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader aloader=new FXMLLoader(getClass().getResource("/application/Sample.fxml"));
			BorderPane root = aloader.load();
			Scene scene = new Scene(root,400,400);
			SampleController aController=aloader.getController();
			Archivio arch=new Archivio();
			aController.setModel(arch);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

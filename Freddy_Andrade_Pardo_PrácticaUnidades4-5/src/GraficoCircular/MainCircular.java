package GraficoCircular;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainCircular extends Application {
	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		try {
			
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Grafico circular");
			
			 // Icono de la aplicaci�n
		    this.primaryStage.getIcons().add(new Image("file:img/graficoCircular.jpg"));
			
			// Carga el XML con el dise�o principal
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainCircular.class.getResource("Circular.fxml"));
			AnchorPane rootLayout = (AnchorPane) loader.load();

			// Descomentar para ver CSS
			rootLayout.getStylesheets().addAll(this.getClass().getResource("Circular.css").toExternalForm());

			// Se a�ade el dise�o principal a la escena
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}

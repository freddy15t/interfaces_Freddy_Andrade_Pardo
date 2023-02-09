package GraficoArea;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * 
 * @author Freddy Andrade Pardo
 * @version 1.0

 */
public class MainArea extends Application {
	private Stage primaryStage;
	

	@Override
	public void start(Stage primaryStage) {
		try {
			
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Grafico de Area");
			
			 // Icono de la aplicacion
		    this.primaryStage.getIcons().add(new Image("file:img/graficoArea.jpg"));
			
			// Carga el XML con el diseno principal
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainArea.class.getResource("Area.fxml"));
			TabPane rootLayout = (TabPane) loader.load();
			
			

			// Descomentar para ver CSS
			rootLayout.getStylesheets().addAll(this.getClass().getResource("area.css").toExternalForm());

			// Se anade el diseno principal a la escena
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param args es lo principal para que funcione
	 */
	public static void main(String[] args) {
		launch(args);
	}
}

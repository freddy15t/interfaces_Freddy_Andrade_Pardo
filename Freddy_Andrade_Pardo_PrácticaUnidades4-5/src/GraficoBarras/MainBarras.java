package GraficoBarras;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * 
 * @author Freddy Andrade Pardo
 *
 */
public class MainBarras extends Application {
	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		try {
			
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Gr�fico de barras");
			 // Icono de la aplicaci�n
		    this.primaryStage.getIcons().add(new Image("file:img/graficoBarras.jpg"));
			
			
			
			// Carga el XML con el dise�o principal
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainBarras.class.getResource("Barras.fxml"));
			TabPane rootLayout = (TabPane) loader.load();

			// Descomentar para ver CSS
			rootLayout.getStylesheets().addAll(this.getClass().getResource("bar.css").toExternalForm());

			// Se a�ade el dise�o principal a la escena
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param args es lo principal para que funcioone
	 */
	public static void main(String[] args) {
		launch(args);
	}
}

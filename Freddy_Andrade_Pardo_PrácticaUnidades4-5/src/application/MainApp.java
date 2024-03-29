package application;
import javafx.application.Application;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;

import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;

/**
 * Clase Main donde se inicia la aplicación
 * @author Freddy Andrade Pardo
 * @version 1.0
 */
public class MainApp extends Application {
	
	 private Stage primaryStage;
	private GridPane rootLayout2;
	private BorderPane rootLayout;
	  @FXML
	    private VBox vboxMovimiento;
	 
	  // la que aparece al inicio
	  Image img1 = new Image(getClass(). getResourceAsStream("logo.jpg"));
	  // para mostrar la imagen al ejecutar la practica
	  Image img2 = new Image(getClass(). getResourceAsStream("logo.jpg"));

	 
	@Override
	public void start(Stage primaryStage) { //esto es para las ventanas
		this.primaryStage = primaryStage;
		primaryStage.setTitle("Práctica (unidades 4-5)");
		iniciPrincipal();
		
	}

	
	
	public void iniciPrincipal() {
		try {
			// Carga el dise�o del archivo FXML en la variable rootLayout
			FXMLLoader loader2 = new FXMLLoader();
			loader2.setLocation(MainApp.class.getResource("Sesion.fxml"));
			rootLayout2 = (GridPane) loader2.load();
			
			ControllerMenu controller =  loader2.getController();
			controller.setMainApp(this);
			
			// Mostramos la escena del BorderPane de la variable rootLayot
			Scene scene = new Scene(rootLayout2);
			primaryStage.getIcons().add(img1);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			/*Manejador de rat�n sobre la escena iniciar sesi�n muestra el valor de donde pulsa*/
			primaryStage.setTitle("Práctica (unidades 4-5)");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	//abrir General
	public void  abrirGeneral() {
		try {
			// Carga el dise�o del archivo FXML en la variable rootLayout
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("Menu.fxml"));
			primaryStage.setTitle("Práctica (unidades 4-5)");

			rootLayout = (BorderPane) loader.load();
			
		// Pasamos al controlador de menu el objeto con el BorderPane principal
			ControllerMenu controllerMeu = loader.getController();
			controllerMeu.setRootLayout(rootLayout);
			;

			// Mostramos la escena del BorderPane de la variable rootLayot
			Scene scene = new Scene(rootLayout);
			Stage stage= new Stage();
			stage.getIcons().add(img1);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("Práctica unidades 4-5");
			stage.show();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	    }
	

	/**
	 * 
	 * @return me devuelve el elemento raiz
	 */
	public BorderPane getRootLayout() {
		return rootLayout;
	}
/**
 * 
 * @param rootLayout el cual se encarga de darle un valor a un atributo de un objeto
 */

	public void setRootLayout(BorderPane rootLayout) {
		this.rootLayout = rootLayout;
	}

/**
 * 
 * @param args es lo principal para que funcioone
 */
	public static void main(String[] args) {
		launch(args);
	}

}

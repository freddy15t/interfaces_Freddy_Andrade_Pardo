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



public class PracticaMain extends Application {
	 private Stage primaryStage;
	//private BorderPane rootLayout;	
	private GridPane rootLayout2;
	private BorderPane rootLayout;
	  @FXML
	    private VBox vboxMovimiento;
	Image img1 = new Image(getClass(). getResourceAsStream("logo.jpg"));
	Image img2 = new Image(getClass(). getResourceAsStream("logo.jpg"));

	@Override
	public void start(Stage primaryStage) { //esto es para las ventanas
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle(" Práctica unidades 4-5 ");
		iniciPrincipal();
		
	}

	/*En el main en este caso me he creado las dos ventanas principales de la aplicaci�n
	 * para tener manejo de ellas solo istanciando el main*/
	public void iniciPrincipal() {
		try {
			// Carga el dise�o del archivo FXML en la variable rootLayout
			FXMLLoader loader2 = new FXMLLoader();
			loader2.setLocation(PracticaMain.class.getResource("Sesion.fxml"));
			rootLayout2 = (GridPane) loader2.load();
			
			ControllerMenu controller =  loader2.getController();
			controller.setMain(this);
			
			// Mostramos la escena del BorderPane de la variable rootLayot
			Scene scene = new Scene(rootLayout2);
			primaryStage.getIcons().add(img1);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			/*Manejador de rat�n sobre la escena iniciar sesi�n muestra el valor de donde pulsa*/
			scene.setOnMouseClicked(
			        new EventHandler<MouseEvent>() {

			            @Override
			            public void handle(MouseEvent event) {
			           System.out.println(event.getPickResult());
			            }
			          });
			primaryStage.setTitle("Práctica unidades 4-5");
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
			loader.setLocation(PracticaMain.class.getResource("Menu.fxml"));
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
			
		
			
			
	
			stage.setOnCloseRequest(e-> iniciPrincipal());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	    }
	
	
	

	public BorderPane getRootLayout() {
		return rootLayout;
	}


	public void setRootLayout(BorderPane rootLayout) {
		this.rootLayout = rootLayout;
	}


	public static void main(String[] args) {
		launch(args);
	}

}

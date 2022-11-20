package application;
	


import java.io.IOException;

import Utilidades.Utilidades;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;

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


	@Override
	public void start(Stage primaryStage) { 
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Inciar sesión");
		iniciPrincipal();
		
	}

	
	
	public void iniciPrincipal() {
		try {
			FXMLLoader loader2 = new FXMLLoader();
			loader2.setLocation(PracticaMain.class.getResource("IniciarSesion.fxml"));
			rootLayout2 = (GridPane) loader2.load();
			
			ControllerMenu controller =  loader2.getController();
			controller.setMain(this);
			
			Scene scene = new Scene(rootLayout2);
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			scene.setOnMouseClicked(
			        new EventHandler<MouseEvent>() {

			            @Override
			            public void handle(MouseEvent event) {
			           System.out.println(event.getPickResult());
			            }
			          });
			primaryStage.setTitle("Iniciar sesión");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
    @FXML
    private void abrirFormulario(ActionEvent event) {    	
    	try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(ControllerMenu.class.getResource("/PaginaUno/ControlesPagUno.fxml"));
			GridPane listadoControles = (GridPane) loader.load();

			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
	
	public void  abrirGeneral() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(PracticaMain.class.getResource("Menu.fxml"));
			rootLayout = (BorderPane) loader.load();
			
			ControllerMenu controllerMeu = loader.getController();
			controllerMeu.setRootLayout(rootLayout);
			
			;

			Scene scene = new Scene(rootLayout);
			Stage stage= new Stage();
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("Inicar sesión");
			stage.show();
			
			
			scene.setOnKeyReleased((KeyEvent keyEvent) -> {
			    System.out.println(" -> " + keyEvent.getCode().toString( )); 
			    if(keyEvent.isControlDown()) {
			    	if(keyEvent.getCode().toString( ).equals("a")|| keyEvent.getCode().toString( ).equals("A")) {
			    		Utilidades.modalFormulario();
			    	
			    	}else if ((keyEvent.getCode().toString( ).equals("B")|| keyEvent.getCode().toString( ).equals("b")) ) {
			    			Utilidades.mostrarCita();
			    	}
			    }
			});
			
			
	
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

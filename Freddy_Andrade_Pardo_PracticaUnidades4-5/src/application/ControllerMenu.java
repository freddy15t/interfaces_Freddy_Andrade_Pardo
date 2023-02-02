package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;


public class ControllerMenu {
	// Pantalla principal en la que se a�ade o quita contenido
		private BorderPane rootLayout;
		//Image image2 = new Image(getClass(). getResourceAsStream("pngwing.com.png"));
			        
	    private Button entrar;
	
	    @FXML
	    private PasswordField psw;

	    @FXML
	    private TextField usuario;
	    
	    @FXML
	    private RadioMenuItem idpendientes;
	    

	    @FXML
	    private RadioMenuItem idacabadas;
	    
	    
	   public static String cualPulsa;
	    
	    PracticaMain main;


	    
	  @FXML
	    private void initialize() {
		  
		 
 
	    }
	  
	    public void setMain(PracticaMain main) {
	        this.main = main;
	        
	    }
	    
	    String cadenaOpcion="";
	    Utilidades util;
	  

	    @FXML
	    void iniciarSesion(ActionEvent event) {
	    	if(usuario.getText().equals("usu") && psw.getText().equals("usu")) {
	    		main.abrirGeneral();
	    		Stage ventana =(Stage) this.entrar.getScene().getWindow();
				ventana.close();
	    	}else {
	    		 Alert alert = Utilidades.crearAlert(AlertType.ERROR, "ERROR", "Usuario o contraseña incorrectos","vuelva a intentarlo" );
	       	  alert.showAndWait();
	    	}
		}
	    
	    
	    
	@FXML
	void abrirFormulario(ActionEvent event) {
		
		try {
			// Cargamos el archivo Controles Din�micos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(ControllerMenu.class.getResource("/formulario/FormularioCitas.fxml"));
			GridPane formularioCitas = (GridPane) loader.load();
			formularioCitas.getStylesheets().add("css/formulario.css");
 
			// Se sit�a en el centro del dise�o principal
			rootLayout.setCenter(formularioCitas);
		} catch (IOException e) {
			e.printStackTrace();
		}

	    }
	
	@FXML
	/*Ventana creada manualmente para probar funcionalidad, al salir queda esta ventana en la central*/
	   private void cerrarListado(ActionEvent event) throws IOException { 
		main.abrirGeneral();
		//Image image1 = new Image(getClass(). getResourceAsStream("pngwing.com.png"));
		//ImageView imag= new ImageView(image1);	
	//	imag.setFitHeight(198);
		//imag.setFitWidth(300);	
		 VBox vbox=new VBox();
		 vbox.setPrefHeight(200);
		 vbox.setPrefWidth(100);
		 vbox.setAlignment(Pos.CENTER);
		// vbox.getChildren().addAll(imag);
		rootLayout.setCenter(vbox);
		
	}
    @FXML
    void abrirTodasLasCitas(ActionEvent event) {
    	
    }
    
    @FXML
    void abrirPendientes(ActionEvent event) {
    	
    	if(idpendientes.isSelected()) {
    		
    		ControllerMenu.cualPulsa="pendientes";
    	}else if(idacabadas.isSelected()) {
    		
    		ControllerMenu.cualPulsa="acabadas";
    	}
    	try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(PracticaMain.class.getResource("/datos/Proceso.fxml"));
			AnchorPane pendiente = (AnchorPane) loader.load();
			//desde aqui con el pendiente se carga el css de la misma forma que se hace con la escena

			// Se sit�a en el centro del dise�o principal
			rootLayout.setCenter(pendiente);
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	

	    }
 
    public static String cualPulsaUsuario() {
    	
		return cualPulsa;
    	
    }
    
    @FXML
    void abrirTutorial(ActionEvent event) {
  	 
    	try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(PracticaMain.class.getResource("/tutorial/Tutorial.fxml"));
			TabPane tutorial=(TabPane) loader.load();
			rootLayout.setCenter(tutorial);
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
   
		
	    
	
	public BorderPane getRootLayout() {
		return rootLayout;
	}

		// Necesario para poder cargar la escena
	public void setRootLayout(BorderPane rootLayout) {
		this.rootLayout = rootLayout;
	}
	
	
    @FXML
    void abrirEstadisticas(ActionEvent event) {
    	System.out.println("entra");

    	try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(PracticaMain.class.getResource("/estadisticas/Estadisticas.fxml"));
			TabPane tutorial=(TabPane) loader.load();
			rootLayout.setCenter(tutorial);
			

		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    
	
	
	
	
}

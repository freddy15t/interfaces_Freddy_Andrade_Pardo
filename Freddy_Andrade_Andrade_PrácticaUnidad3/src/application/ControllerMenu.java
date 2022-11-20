package application;

import java.io.IOException;

import PaginaTres.MainLayouts_Controles;
import Utilidades.Utilidades;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;


public class ControllerMenu {
		private BorderPane rootLayout;
			        
	    @FXML
	    private Button entrar;
	
	    @FXML
	    private PasswordField contraseña;

	    @FXML
	    private TextField usuario;
	    
	   
	    
	    
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
	    	if(usuario.getText().equals("freddy") && contraseña.getText().equals("1234")) {
	    		antesEmpeza();
	    		main.abrirGeneral();
	    		Stage ventana =(Stage) this.entrar.getScene().getWindow();
				ventana.close();
	    	}else {
	    		 Alert alert = Utilidades.crearAlert(AlertType.ERROR, "ERROR", "Usuario o contraseña incorrectos",
	    				 "vuelva a iniciar" );
	       	  alert.showAndWait();
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

	
	@FXML
	   private void cerrarListado(ActionEvent event) throws IOException { 
		main.abrirGeneral();
		Image image1 = new Image(getClass(). getResourceAsStream("pelupelu.jpf"));
		ImageView imag= new ImageView(image1);	
		imag.setFitHeight(198);
		imag.setFitWidth(300);	
		 VBox vbox=new VBox();
		 vbox.setPrefHeight(200);
		 vbox.setPrefWidth(100);
		 vbox.setAlignment(Pos.CENTER);
		 vbox.getChildren().addAll(imag);
		rootLayout.setCenter(vbox);
		
	}
    @FXML
    void abrirTodasLasCitas(ActionEvent event) {
    	try {
    		FXMLLoader loader = new FXMLLoader();
        	loader.setLocation(ControllerMenu.class.getResource("/datos/DatosCitas.fxml"));
			SplitPane datosCitas= (SplitPane) loader.load();
			
			rootLayout.setCenter(datosCitas);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
   
    
    
    @FXML
    void abrirTutorial(ActionEvent event) {    	
    	try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainLayouts_Controles.class.getResource("/PaginaTres/MainLayouts_Controles.fxml"));
			BorderPane controlavanzado = (BorderPane) loader.load();

			rootLayout.setCenter(controlavanzado);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    
    @FXML
    void Abrir(ActionEvent event) {
    	try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainLayouts_Controles.class.getResource("/PaginaDos/Control.fxml"));
			GridPane abrirFormulario = (GridPane) loader.load();

			rootLayout.setCenter(abrirFormulario);
		} catch (IOException e) {
			e.printStackTrace();
		}

    }
    
    
		public void antesEmpeza() {
			Utilidades.modalPaginator();
		}
		
	    
	
	public BorderPane getRootLayout() {
		return rootLayout;
	}

	public void setRootLayout(BorderPane rootLayout) {
		this.rootLayout = rootLayout;
	}
	
	
	
	
}

package application;

import java.io.IOException;

import PaginaTres.MainLayouts_Controles;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;


public class ControllerMenu {
	// Pantalla principal en la que se a�ade o quita contenido
		private BorderPane rootLayout;
		Image image2 = new Image(getClass(). getResourceAsStream("logo.jpg"));
			        
	    @FXML
	    private Button entrar;
	
	    @FXML
	    private PasswordField psw;

	    @FXML
	    private TextField usuario;
	    
	   
	    
	    PracticaMain main;


	    public static  Alert crearAlert(AlertType type, String title, String header, String contextText) {
	    	Alert auxAlert = new Alert(type);
	    	
	    	auxAlert.setTitle(title);
	    	auxAlert.setHeaderText(header);
	    	auxAlert.setContentText(contextText);
	    	
	    	return auxAlert;
	    }
	    
	  @FXML
	    private void initialize() {
		 
 
	    }
	  
	    public void setMain(PracticaMain main) {
	        this.main = main;
	        
	    }
	    
	    String cadenaOpcion="";
	    ControllerMenu util;
	  
	 
	    @FXML
	    void iniciarSesion(ActionEvent event) {
	    	if(usuario.getText().equals("user") && psw.getText().equals("user")) {
	    		main.abrirGeneral();
	    		Stage ventana =(Stage) this.entrar.getScene().getWindow();
				ventana.close();
	    	}else {
	    		 Alert alert = ControllerMenu.crearAlert(
	    				 AlertType.ERROR, "ERROR", "Usuario o contraseña incorrectos","vuelva a intentarlo" );
	       	  alert.showAndWait();
	    	}
		}
	    
	    
	    
	    
	    
	    @FXML
	    void abrirFormulario(ActionEvent event) {
	    	try {
				// Cargamos el archivo Controles Din�micos
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(ControllerMenu.class.getResource("/PaginaUno/ControlesPagUno.fxml"));
				GridPane listadoControles = (GridPane) loader.load();

				// Se sit�a en el centro del dise�o principal
				rootLayout.setCenter(listadoControles);
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

				// Se sit�a en el centro del dise�o principal
				rootLayout.setCenter(abrirFormulario);
			} catch (IOException e) {
				e.printStackTrace();
			}

	    }
	    
	    

	    @FXML
	    void abrirTutorial(ActionEvent event) {
	    	try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainLayouts_Controles.class.getResource("/PaginaTres/MainLayouts_Controles.fxml"));
				BorderPane controlavanzado = (BorderPane) loader.load();

				// Se sit�a en el centro del dise�o principal
				rootLayout.setCenter(controlavanzado);
			} catch (IOException e) {
				e.printStackTrace();
			}

	    }

	    
	    @FXML
	    private void cerrarListado(ActionEvent event) {    	
	    	// Se elimina el contenido del nodo central
	    	rootLayout.setCenter(null);	
	    }
	    
	    
	    
	    
	    @FXML
	    void abrirGrafArea(ActionEvent event) {
	    	try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(PracticaMain.class.getResource("/GraficoArea/Area.fxml"));
				TabPane tutorial=(TabPane) loader.load();
				tutorial.getStylesheets().add("css/area.css");
				rootLayout.setCenter(tutorial);
				

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }

	    @FXML
	    void abrirGrafBarras(ActionEvent event) {
	    	try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(PracticaMain.class.getResource("/GraficoBarras/Barras.fxml"));
				TabPane tutorial=(TabPane) loader.load();
				tutorial.getStylesheets().add("css/bar.css");
				rootLayout.setCenter(tutorial);
				

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }

	    @FXML
	    void abrirGrafCirculares(ActionEvent event) {
	    	try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(PracticaMain.class.getResource("/GraficoCircular/Circular.fxml"));
				AnchorPane tutorial=(AnchorPane) loader.load();
				tutorial.getStylesheets().add("css/Circular.css");
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
	
	
	
	
}

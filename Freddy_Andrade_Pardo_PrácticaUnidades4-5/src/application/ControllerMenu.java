package application;

import java.io.IOException;

import PaginaTres.MainpagTres;
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

/**
 * 
 * @author freddy Andrade Pardo
  * @version 1.0
 */
public class ControllerMenu {
	// Pantalla principal en la que se anade o quita contenido
		private BorderPane rootLayout;
		Image image2 = new Image(getClass(). getResourceAsStream("logo.jpg"));
			 
		/**
		 * variabales
		 */
	    @FXML
	    private Button entrar;
	
	    @FXML
	    private PasswordField psw;

	    @FXML
	    private TextField usuario;
	    MainApp main;


	    /**
	     * 
	     * @param alerta
	     * @param titulo
	     * @param cabezera
	     * @param contexto
	     * @return
	     */
	    public static  Alert crearAlert(AlertType type, String title, String header, String contextText) {
	    	Alert auxAlert = new Alert(type);
	    	
	    	auxAlert.setTitle(title);
	    	auxAlert.setHeaderText(header);
	    	auxAlert.setContentText(contextText);
	    	
	    	return auxAlert;
	    }
	    
	
	  /**
	   * 
	   * @param main
	   */
	    public void setMainApp(MainApp main) {
	        this.main = main;   
	    }
	    
	  
	 /**
	  * 
	  * @param metodo iniciar sesion para entrar con usuario y contraseña
	  * al ponerlo mal te saca la alerta de error
	  */
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
	    
	    
	        /**
	         * 
	         * @param metodo abrir informacion para el cliente desde el menu
	         */
	    @FXML
	    void abrirFormulario(ActionEvent event) {
	    	try {
				// Cargamos el archivo Controles Din�micos
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(ControllerMenu.class.getResource("/PaginaUno/Cliente.fxml"));
				GridPane listadoControles = (GridPane) loader.load();

				// Se sit�a en el centro del dise�o principal
				rootLayout.setCenter(listadoControles);
			} catch (IOException e) {
				e.printStackTrace();
			}

	    }
	    
	    
	    /**
	     * 
	     * @param cerrar los recursos de la informacion del cliente
	     */
	    @FXML
	    private void cerrarListado(ActionEvent event) {    	
	    	// Se elimina el contenido del nodo central
	    	rootLayout.setCenter(null);	
	    }
	    
	    
	    
	    /**
	     * 
	     * @param abrir formulario desde el menu
	     */
	    @FXML
	    void Abrir(ActionEvent event) {
	    	try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainpagTres.class.getResource("/PaginaDos/Control.fxml"));
				GridPane abrirFormulario = (GridPane) loader.load();

				// Se sit�a en el centro del dise�o principal
				rootLayout.setCenter(abrirFormulario);
			} catch (IOException e) {
				e.printStackTrace();
			}

	    }
	    
			    
		/**
		 * 
		 * @param abrir tutorial desde el menu 
		 */
	    @FXML
	    void abrirTutorial(ActionEvent event) {
	    	try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainpagTres.class.getResource("/PaginaTres/MainpagTres.fxml"));
				BorderPane controlavanzado = (BorderPane) loader.load();

				// Se situa en el centro del diseno principal
				rootLayout.setCenter(controlavanzado);
			} catch (IOException e) {
				e.printStackTrace();
			}

	    }

	    
	   
	    
	    /**
	     * 
	     * @param abrir el grafico de area
	     */
	    
	    @FXML
	    void abrirGrafArea(ActionEvent event) {
	    	try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainApp.class.getResource("/GraficoArea/Area.fxml"));
				TabPane tutorial=(TabPane) loader.load();
				tutorial.getStylesheets().add("css/area.css");
				rootLayout.setCenter(tutorial);
				

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }

	  /**
	   * 
	   * @param abrir el grafico de barras
	   */
	    @FXML
	    void abrirGrafBarras(ActionEvent event) {
	    	try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainApp.class.getResource("/GraficoBarras/Barras.fxml"));
				TabPane tutorial=(TabPane) loader.load();
				tutorial.getStylesheets().add("css/bar.css");
				rootLayout.setCenter(tutorial);
				

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	    }

	    
	    /**
	     * 
	     * @param abrir el grafico circular
	     */
	    @FXML
	    void abrirGrafCirculares(ActionEvent event) {
	    	try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(MainApp.class.getResource("/GraficoCircular/Circular.fxml"));
				AnchorPane tutorial=(AnchorPane) loader.load();
				tutorial.getStylesheets().add("css/Circular.css");
				rootLayout.setCenter(tutorial);
				

			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	    
	    
	
	public BorderPane getRootLayout() {
		return rootLayout;
	}

	/**
	 * 
	 * @param rootLayout necesario para cargar la escena
	 */
		// Necesario para poder cargar la escena
	public void setRootLayout(BorderPane rootLayout) {
		this.rootLayout = rootLayout;
	}
	
	
	
	
}

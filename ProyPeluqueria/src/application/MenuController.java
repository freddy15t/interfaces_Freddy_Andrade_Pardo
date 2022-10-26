package application;

import java.io.IOException;

import PaginaTres.MainLayouts_Controles;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class MenuController {
	
	// Pantalla principal en la que se a�ade o quita contenido
	private BorderPane rootLayout;
  
    @FXML
    private void initialize() {
        
    }
    
    @FXML
    void Volver(ActionEvent event) {
    	try {
			// Cargamos el archivo Controles Din�micos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/application/Menu.fxml"));
			BorderPane volver = (BorderPane) loader.load();

			// Se sit�a en el centro del dise�o principal
			rootLayout.setCenter(volver);
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
    private void abrirFormulario(ActionEvent event) {    	
    	try {
			// Cargamos el archivo Controles Din�micos
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/PaginaUno/ControlesPagUno.fxml"));
			GridPane listadoControles = (GridPane) loader.load();

			// Se sit�a en el centro del dise�o principal
			rootLayout.setCenter(listadoControles);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    
    
    
    @FXML
    private void cerrarListado(ActionEvent event) {    	
    	// Se elimina el contenido del nodo central
    	rootLayout.setCenter(null);	
    }

	public BorderPane getRootLayout() {
		return rootLayout;
	}

	public void setRootLayout(BorderPane rootLayout) {
		this.rootLayout = rootLayout;
	}	
    
}

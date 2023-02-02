package application;

import java.io.IOException;


import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Utilidades {
	
	
	  public static  Alert crearAlert(AlertType type, String title, String header, String contextText) {
	    	Alert auxAlert = new Alert(type);
	    	
	    	auxAlert.setTitle(title);
	    	auxAlert.setHeaderText(header);
	    	auxAlert.setContentText(contextText);
	    	
	    	return auxAlert;
	    }
	  
	  public static void modalFormulario() {
		  try {
	            // Cargue el archivo fxml y cree una nueva etapa para el cuadro de di�logo emergente.
	        	FXMLLoader loader = new FXMLLoader();
				loader.setLocation(ControllerMenu.class.getResource("/formulario/empleados.fxml"));
				GridPane page = (GridPane) loader.load();

	            // Create the dialog Stage.
	            Stage dialogStage = new Stage();
	            dialogStage.initModality(Modality.APPLICATION_MODAL);
	            Scene scene = new Scene(page);
	            scene.getStylesheets().add("css/formulario.css");
	            dialogStage.setScene(scene);
	            
	            
	         
	            dialogStage.showAndWait(); // como no se cierra ok no va haber hasta que pulse el ok
	        } catch (IOException e) {
	            e.printStackTrace();
	           
	        }
	  }
	  
	
	 
	 
	 public static void mostrarPendiente() {
    	 try {
	            // Cargue el archivo fxml y cree una nueva etapa para el cuadro de di�logo emergente.
    		 FXMLLoader loader = new FXMLLoader();
	 			loader.setLocation(PracticaMain.class.getResource("/datos/Proceso.fxml"));
	 			AnchorPane page = (AnchorPane) loader.load();

	            // Create the dialog Stage.
	            Stage dialogStage = new Stage();
	            dialogStage.initModality(Modality.APPLICATION_MODAL);
	            Scene scene = new Scene(page);
	            dialogStage.setScene(scene);
	            
	            // Show the dialog and wait until the user closes it
	            dialogStage.showAndWait(); // como no se cierra ok no va haber hasta que pulse el ok
	        } catch (IOException e) {
	            e.printStackTrace();
	           
	        }
    }
	 
	 
    }
	 




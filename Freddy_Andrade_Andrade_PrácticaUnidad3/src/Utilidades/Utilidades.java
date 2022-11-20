package Utilidades;

import java.io.IOException;

import application.ControllerMenu;
import application.PracticaMain;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;

import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import pagPrevia.ControllerPagPrevia;

public class Utilidades {
	
	/*Clase com�n para poder ser usadas por todas donde implemento los diferente modales
	 * y un constructor de alertas para poder usarlos m�s c�modamente*/
	
	  public static  Alert crearAlert(AlertType type, String title, String header, String contextText) {
	    	Alert auxAlert = new Alert(type);
	    	
	    	auxAlert.setTitle(title);
	    	auxAlert.setHeaderText(header);
	    	auxAlert.setContentText(contextText);
	    	
	    	return auxAlert;
	    }
	  
	 

	 public static void previa() {
    	 try {
 			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(ControllerPagPrevia.class.getResource("/pagPrevia/pagPrevia.fxml"));
			AnchorPane page = (AnchorPane) loader.load();

	            Stage dialogStage = new Stage();
	            dialogStage.setTitle("Página previa");
	            dialogStage.initModality(Modality.APPLICATION_MODAL);
	            Scene scene = new Scene(page);
	            dialogStage.setScene(scene);
	            ControllerPagPrevia controller = loader.getController();
		           controller.setDialogStage(dialogStage);
	            
		           dialogStage.showAndWait();
	        } catch (IOException e) {
	            e.printStackTrace();
	           
	        }
    }

	public static void pagPrevia() {
		
	}

	 


}

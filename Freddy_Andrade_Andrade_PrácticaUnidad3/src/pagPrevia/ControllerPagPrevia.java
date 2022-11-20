package pagPrevia;

import java.util.ArrayList;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Pagination;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class ControllerPagPrevia {
	
	
	
    private ArrayList<String> atajos = new ArrayList<String>();
    private static final int limite = 2;
    
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

   
    
    
    @FXML
    private Button okBoton;
    
    private Stage dialogStage;

    @FXML
    /*Clase adaptada de un ejercicio visto en clase una vez entendida, para a�adir una forma de avisar al usuario
     * de los atajos que encontrar� en la aplicaci�n antes de usarla */
    void initialize() {
    	
    	
    	
    	    	    	
    	
    	
    	// Cada vez que se selecciona una p�gina se cambia la barra de progreso
    	
    	    	 	
    	// Valor inicial de la barra de progreso
    
    	okBoton.setOnAction(e->{
    		this.dialogStage.close();
    	});

    }
    
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
    
   
    
    

    // Creaci�n de la visra es llamado desde la principal cuando pulsa entrar
    public static void modalPaginator() {
   	 try {
	            // Cargue el archivo fxml y cree una nueva etapa para el cuadro de di�logo emergente.
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(ControllerPagPrevia.class.getResource("/pagPrevia/paginator.fxml"));
			AnchorPane page = (AnchorPane) loader.load();

	            // Create the dialog Stage.
	            Stage dialogStage = new Stage();
	            dialogStage.setTitle("ANTES DE EMPEZAR");
	            dialogStage.initModality(Modality.APPLICATION_MODAL);
	            Scene scene = new Scene(page);
	            dialogStage.setScene(scene);
	            
	            dialogStage.showAndWait();
	        } catch (IOException e) {
	            e.printStackTrace();
	           
	        }
   }

}

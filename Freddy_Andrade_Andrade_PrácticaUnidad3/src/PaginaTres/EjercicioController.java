package PaginaTres;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TreeView;

public class EjercicioController {

	@FXML
    private ListView<String> qualificationsList;

	@FXML
	private ComboBox<String> langChoice;
	
    @FXML
    private ChoiceBox<Object> locationChoice;
        
    @FXML
    private TreeView<String> dataTree;
    
    // Listas para qualificationsList
    private ObservableList<String> names = FXCollections.observableArrayList();
    private ObservableList<String> data = FXCollections.observableArrayList();
    
    
   
  /*  @FXML
	private void abrirTutorial(ActionEvent event) {    	
    	try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MenuController.class.getResource("/PaginaUno/ControlesPagUno.fxml"));
			AnchorPane controlavanzado = (AnchorPane) loader.load();

			// Se sitúa en el centro del diseño principal
			rootLayout.setCenter(controlavanzado);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }*/
    
    	
    	
    	
        
    }
    


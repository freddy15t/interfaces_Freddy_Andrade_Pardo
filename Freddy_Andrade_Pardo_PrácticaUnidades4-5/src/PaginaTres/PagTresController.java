package PaginaTres;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TreeView;

public class PagTresController {

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
    
    
   
  
  	
    	
    	
        
    }
    


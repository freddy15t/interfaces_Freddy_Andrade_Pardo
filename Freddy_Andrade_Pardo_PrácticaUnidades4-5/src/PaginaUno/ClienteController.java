package PaginaUno;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.control.cell.TextFieldTreeCell;

/**
 * 
 * @author Freddy Andrade Pardo
  * @version 1.0
 *
 */
public class ClienteController {


    @FXML
    private ChoiceBox<String> choice1;

    @FXML
    private ListView<String> list1;
    
    @FXML
    private ComboBox<String> combo1;
    
    @FXML
    private TableView<Cliente> table1;
    
    @FXML
    private TableColumn<Cliente, String> nombreC;

    @FXML
    private TableColumn<Cliente, String> apellidoC;

    @FXML
    private TableColumn<Cliente, String> emailCol;
    
    @FXML
    private TableColumn<Cliente, Integer> edadC;
    
    @FXML
    private TreeView<String> tree1;
    
    
     // Lista auxiliar para TableView
    private ObservableList<Cliente> data = FXCollections.observableArrayList(
    	    new Cliente("Luis", "P�rez", "luispz@gmail.com", 645326352),
    	    new Cliente("Ana", "Martinez", "Anamrt@gmail.com", 654987239),
    	    new Cliente("Laura", "Guarniz", "Lauragr@gmail.com", 650236947),
    	    new Cliente("Pablo", "Gutierrez", "Pabg.@gmail.com", 618195432),
    	    new Cliente("Mario", "Bautista", "Mariobt@gmail.com", 684205637)
    	);

    @FXML
    private void initialize() {   
        // Controles de JavaFX a los que se anaden directamente los items 
    	// Items del ChoiceBox
        choice1.getItems().addAll("Corte clasico", "Corte militar ", "Corte Undercut", "Corte fade",
        		"Corte taper", "Corte degrafilado", "Corte comb over", 
        		"Corte hongo", "Corte mohicano", "corte degradado");      
        
        // Items del ComboBox
        combo1.getItems().addAll("Acondicionador de cabello", "Fijador para el pelo", "Champ�", 
        		"Laca para el cabello", "Tinte para el cabello", "Crema de afeitar",
        		"Jab�n de afeitar");
                
        
 
        // Asociamos cada columna del TableView a una propiedad de la clase Person 
        nombreC.setCellValueFactory(new PropertyValueFactory<Cliente,String>("nombre"));
        apellidoC.setCellValueFactory(new PropertyValueFactory<Cliente,String>("apellido"));
        emailCol.setCellValueFactory(new PropertyValueFactory<Cliente,String>("email"));
        edadC.setCellValueFactory(new PropertyValueFactory<Cliente,Integer>("edad"));
        // Se rellena la tabla con objetos de la clase Person
        table1.setItems(data);     
        
                  
    }
    
}

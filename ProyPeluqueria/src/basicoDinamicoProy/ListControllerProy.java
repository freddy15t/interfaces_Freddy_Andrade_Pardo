package basicoDinamicoProy;

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

public class ListControllerProy {

    @FXML
    private ChoiceBox<String> choice1;

    @FXML
    private ListView<String> list1;
    
    @FXML
    private ComboBox<String> combo1;
    
    @FXML
    private TableView<Cliente> table1;
    
    @FXML
    private TableColumn<Cliente, String> firstNameCol;

    @FXML
    private TableColumn<Cliente, String> lastNameCol;

    @FXML
    private TableColumn<Cliente, String> emailCol;
    
    @FXML
    private TableColumn<Cliente, Integer> ageColumn;
    
    @FXML
    private TreeView<String> tree1;
    
     // Lista auxiliar para TableView
    private ObservableList<Cliente> data = FXCollections.observableArrayList(
    	    new Cliente("Jacob", "Smith", "jacob.smith@example.com", 30),
    	    new Cliente("Isabella", "Johnson", "isabella.johnson@example.com", 40),
    	    new Cliente("Ethan", "Williams", "ethan.williams@example.com", 50),
    	    new Cliente("Emma", "Jones", "emma.jones@example.com", 61),
    	    new Cliente("Michael", "Brown", "michael.brown@example.com", 34)
    	);

    @FXML
    private void initialize() {   
        // Controles de JavaFX a los que se añaden directamente los items 
    	// Ítems del ChoiceBox
        choice1.getItems().addAll("Corte clásico", "Corte militar ", "Corte Undercut", "Corte fade",
        		"Corte taper", "Corte degrafilado", "Corte comb over", "Corte hongo", "Corte mohicano", "corte degradado");      
        
        // Ítems del ComboBox
        combo1.getItems().addAll("Acondicionador de cabello", "Fijador para el pelo", "Champú", "Laca para el cabello", "Tinte para el cabello", "Crema de afeitar",
        		"Jabón de afeitar");
                
        // Ítems del ListView (con la segunda línea se asigna un CellFactory para permitir que sean editables)
        list1.getItems().addAll("Lista1", "Lista2", "Lista3");
        list1.setCellFactory(TextFieldListCell.forListView());
        // Para seleccionar más de un ítem a la vez
        list1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        // Asociamos cada columna del TableView a una propiedad de la clase Person 
        firstNameCol.setCellValueFactory(new PropertyValueFactory<Cliente,String>("firstName"));
        lastNameCol.setCellValueFactory(new PropertyValueFactory<Cliente,String>("lastName"));
        emailCol.setCellValueFactory(new PropertyValueFactory<Cliente,String>("email"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<Cliente,Integer>("age"));
        // Se rellena la tabla con objetos de la clase Person
        table1.setItems(data);     
        
        // Ítems para el TreeView
        // Ítem raíz
        TreeItem<String> rootItem = new TreeItem<String>("Tutorials");

        // Ítem de primer nivel
        TreeItem<String> webItem = new TreeItem<String>("Web Tutorials");
        webItem.getChildren().add(new TreeItem<String>("HTML  Tutorial"));
        webItem.getChildren().add(new TreeItem<String>("HTML5 Tutorial"));
        webItem.getChildren().add(new TreeItem<String>("CSS Tutorial"));
        webItem.getChildren().add(new TreeItem<String>("SVG Tutorial"));
        rootItem.getChildren().add(webItem);
        
        // Otro ítem de primer nivel
        TreeItem<String> javaItem = new TreeItem<String>("Java Tutorials");
        javaItem.getChildren().add(new TreeItem<String>("Java Language"));
        javaItem.getChildren().add(new TreeItem<String>("Java Collections"));
        javaItem.getChildren().add(new TreeItem<String>("Java Concurrency"));
        rootItem.getChildren().add(javaItem);
        
        // Para que sea editable necesitamos especificar un CellFactory con el tipo que corresponda
        tree1.setCellFactory(TextFieldTreeCell.forTreeView());
        
        // Expadimos por defecto el ítem raíz
        rootItem.setExpanded(true); 
        tree1.setRoot(rootItem);               
    }
    
}

package PaginaUno;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PersonOverviewController {
    @FXML
    private TableView<Person> TablaPersona;
    @FXML
    private TableColumn<Person, String> ColumnaNombre;
    @FXML
    private TableColumn<Person, String> ColumnaApellido;

	
    @FXML
    private Label LabelNombre;
    @FXML
    private Label LabelApellido;
    @FXML
    private Label LabelCalle;
    @FXML
    private Label LabelCodPostal;
    @FXML
    private Label LabelCiudad;
    @FXML
    private Label LabelCumple;

    // Referencia a la aplicación principal
    private Main mainApp;
    
    /**
     * Método para inicializar el controlador que se llama cuando se carga el FXML
     */
    @FXML
    private void initialize() {
    	// Se inicializan las columnas firstName y lastName
        ColumnaNombre.setCellValueFactory(cellData -> cellData.getValue().NombreProperty());
        ColumnaApellido.setCellValueFactory(cellData -> cellData.getValue().ApellidoProperty());
    	
      	// TODO Versión con map 
    	// Se crea un objecto que herede de ObservableValue
    	/*ColumnaNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().get("firstName").toString()));
    	ColumnaApellido.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().get("lastName").toString()));*/   
    }

    /**
     * Referencia a la aplicación principal
     * 
     * @param mainApp
     */
    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;

        TablaPersona.setItems(this.mainApp.getPersonData());
               
        // TODO Versión con map
        //TablaPersona.setItems(this.mainApp.getMapData()); 
    }
    
    /**
     * Se llama cuando el usuario hace click en el botón nuevo 
     * Se añade una nueva persona a la tabla
     */
    @FXML
    
    private void AsigNuevPers(ActionEvent event) {
        Person tempPerson = new Person();
        boolean okClicked = mainApp.showPersonEditDialog(tempPerson);
        if (okClicked) {
            mainApp.getPersonData().add(tempPerson);
        }       
    }    
}
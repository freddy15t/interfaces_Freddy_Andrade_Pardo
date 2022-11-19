package PaginaUno;


import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ClienteDialogController {

    @FXML
    private TextField CampoNombre;

    @FXML
    private TextField CampoApellido;

    @FXML
    private TextField CampoEmail;

    @FXML
    private TextField CampoEdad;
    


   
    
    // Este componente será un diálogo. Campos auxiliares para su gestión
    private Stage dialogStage;
    private Cliente Cliente;
    private boolean okClicked = false;

    /**
     * Método para inicializar el controlador que se llama cuando se carga el FXML
     */
    @FXML
    private void initialize() {
    	
    }
    
    /**
     * Rellena los datos de la Clientea que va a ser añadida o modificada en el diálogo
     * 
     * @param Cliente
     */
    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;

        CampoNombre.setText(Cliente.getNombre());
        CampoApellido.setText(Cliente.getApellido());
        CampoEmail.setText(Cliente.getEmail());
        CampoEdad.setText(Integer.toString(Cliente.getEdad()));
    }

    /**
     * Devuelve true si el usuario hace click en el botón "OK"
     * 
     * @return
     */
    public boolean isOkClicked() {
        return okClicked;
    }

    /**
     * Manejador del botón "OK"
     */
    @FXML
    private void handleOk() {
        if (isInputValid()) {
            Cliente.setNombre(CampoNombre.getText());
            Cliente.setApellido(CampoApellido.getText());
            Cliente.setEmail(CampoEmail.getText());
            Cliente.setEdad(Integer.parseInt(CampoEdad.getText()));
          

            okClicked = true;
            dialogStage.close();
        }
    }

    /**
     * Manejador del botón "Cancel" 
     */
    @FXML
    private void handleCancel() {
        dialogStage.close();
    }

    /**
     * Valida los campos de texto del usuario
     * 
     * @return true si los campos son válidos
     */
    private boolean isInputValid() {
        String errorMessage = "";

        if (CampoNombre.getText() == null || CampoNombre.getText().length() == 0) {
            errorMessage += "El campo  nombre está vacío\n"; 
        }
        if (CampoApellido.getText() == null || CampoApellido.getText().length() == 0) {
            errorMessage += "El campo apellido está vacío\n"; 
        }
        if (CampoEmail.getText() == null || CampoEmail.getText().length() == 0) {
            errorMessage += "El campo calle está vacío\n"; 
        }

        if (CampoEdad.getText() == null || CampoEdad.getText().length() == 0) {
            errorMessage += "El campo código postal  está vacío\n"; 
        } else {
            // Se intenta convertir el código postal en entero y si da un error se muestra un mensaje
            try {
                Integer.parseInt(CampoEdad.getText());
            } catch (NumberFormatException e) {
                errorMessage += " Edad no correcta. Debe ser un número entero\n"; 
            }
        }

        if (CampoEdad.getText() == null || CampoEdad.getText().length() == 0) {
            errorMessage += "El campo ciudad está vacío\n"; 
        }

        

        if (errorMessage.length() == 0) {
            return true;
        } else {
        	// Se muestra un alert si no se puede eliminar la fila
    		Alert errorAlert = new Alert(AlertType.ERROR);
        	
    		errorAlert.setTitle("Hay campos incorrectos");
    		errorAlert.setHeaderText("Por favor, rellena correctamente los campos");
    		errorAlert.setContentText(errorMessage);
    		
    		errorAlert.showAndWait();
            return false;
        }
    }
    
   
    public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }

}
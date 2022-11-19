package Validar;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class MainEventosValidar extends Application {
	private VBox rootLayout;	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			// Carga el dise�o del archivo FXML en la variable rootLayout
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainEventosValidar.class.getResource("Control.fxml"));
			rootLayout = (VBox) loader.load();
								
			// Mostramos la escena del VBox de la variable rootLayot
			Scene scene = new Scene(rootLayout);
						
			primaryStage.setScene(scene);
			primaryStage.setTitle("Ejemplo sobre eventos");
			primaryStage.show();
			
			crearDialogo(primaryStage, scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void crearDialogo(Stage primaryStage, Scene scene) {
		// Creamos el input que se mostrar� cuando el usuario haga click en el bot�n
		TextInputDialog textDialog = new TextInputDialog("Texto de ejemplo...");
    	textDialog.initModality(Modality.WINDOW_MODAL); // En ese caso ser� "no modal"
    	textDialog.initOwner(primaryStage);
    	textDialog.setTitle("Ejemplo de di�logo");
    	textDialog.setHeaderText("Di�logo para introducir un texto");
     	    	
    	// Bloqueamos cualquier tecla ENTER o ESC dentro del Pane que se crea en el di�logo
    	textDialog.getDialogPane().addEventFilter(KeyEvent.KEY_PRESSED, (event) -> {
    		KeyCode code = event.getCode();
    		if ((code == KeyCode.ENTER) || (code == KeyCode.ESCAPE)) {
    			System.out.println("Pressed " + code);
    			event.consume();
    		}
    	});
    	
    	textDialog.getDialogPane().addEventFilter(KeyEvent.KEY_TYPED, (event) -> {
    		System.out.println("Evento " + event.getEventType() + " caracter " + event.getCharacter());
    	});
    	
    	textDialog.getEditor().setText("");
    	textDialog.getEditor().setPromptText("Introduzca un texto");
    	
    	// Se puede acceder al TextField con getEditor
    	// Validaci�n para solo introducir teclas de la A a la Z may�scula
    	textDialog.getEditor().addEventHandler(KeyEvent.KEY_TYPED, ((event) -> {
    		int numberCode = (int) event.getCharacter().charAt(0);
    		
    		if ((numberCode < 65) || (numberCode > 90)) {
    			event.consume();
    		}    			    		
    	}));
		
		Button btnMostrar = (Button) scene.lookup("#btnMostrar");
		TextField txtResultado = (TextField) scene.lookup("#txtResultado");
		
		// Cuanto el usuario le da a aceptar, se actualiza el campo de texto
		btnMostrar.setOnAction((event)->{						    	
	    	textDialog.showAndWait().ifPresent(response -> {
	    		txtResultado.setText(response);
    		});
		});
		
		// Al cerrar la ventana, llevamos el foco al texto
    	textDialog.setOnHidden((event) -> {
            txtResultado.requestFocus();            
        });
    	
		// Se cambia el tipo de cursor cuando nos posicionamos por encima
		txtResultado.setOnMouseEntered((event) -> {
			txtResultado.setCursor(Cursor.HAND);
		});	
	}

	public static void main(String[] args) {
		launch(args);
	}
}

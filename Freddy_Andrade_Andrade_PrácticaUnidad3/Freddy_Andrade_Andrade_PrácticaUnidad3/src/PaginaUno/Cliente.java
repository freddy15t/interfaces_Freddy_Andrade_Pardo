package PaginaUno;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;


public class Cliente {
    private final SimpleStringProperty nombre;
    private final SimpleStringProperty apellido;
    private final SimpleStringProperty email;
    private final SimpleIntegerProperty edad;
 
    public Cliente(String fName, String lName, String email, Integer age) {
        this.nombre = new SimpleStringProperty(fName);
        this.apellido = new SimpleStringProperty(lName);
        this.email = new SimpleStringProperty(email);
        this.edad = new SimpleIntegerProperty(age);
    }
 
    public String getNombre() {
        return nombre.get();
    }
    
    public void setNombre(String fName) {
        nombre.set(fName);
    }
        
    public String getApellido() {
        return apellido.get();
    }
    public void setApellidoe(String fName) {
    	apellido.set(fName);
    }
    
    public String getEmail() {
        return email.get();
    }
    
    public void setEmail(String fName) {
        email.set(fName);
    }

	public Integer getEdad() {
		return edad.get();
	}
	public void setEdad(Integer fAge) {
		edad.set(fAge);
    }        
        
}
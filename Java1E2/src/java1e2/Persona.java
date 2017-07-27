
package java1e2;

public class Persona {
    //Atributos de Persona
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean casado;
    private String numeroDocumentoIdentidad;
    
    //Constructor Persona
    public Persona(){}
    
    public Persona(String nombre, String apellidos, int edad, String numeroDocumentoIdentidad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }
    
    //Metodo para mostrar datos de las personas
    public String mostrarDatos(Persona persona){
        String datos="Datos: \n";
        datos+=persona.nombre+"\n";
        datos+=persona.apellidos+"\n";
        datos+=persona.edad+"\n";
        datos+=persona.numeroDocumentoIdentidad+"\n";
        return datos;
    }
    
    //Metodos Get and Set 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String getNumeroDocumentoIdentidad() {
        return numeroDocumentoIdentidad;
    }

    public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad) {
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }
    
}


package java1e2;

public class JugadorFutbol extends Persona{
    private String equipofutbol;

    public JugadorFutbol(String nombre, String apellidos, int edad, String numeroDocumentoIdentidad, String equipofutbol) {
        super(nombre, apellidos, edad, numeroDocumentoIdentidad);
        this.equipofutbol=equipofutbol;
    }
     
    public String toString(Persona persona){
    String datos="Jugador de Futbol es \n";
    datos+=persona.mostrarDatos(persona);
    datos+=equipofutbol+"\n";
        
    return datos;
    } 
}

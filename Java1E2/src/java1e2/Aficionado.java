
package java1e2;

public class Aficionado extends Persona{
    String equipofavorito;
    String jugadorfavorito;
    
   
    public Aficionado(String nombre, String apellidos, int edad, String numeroDocumentoIdentidad, String equipofavorito, String jugadorfavorito) {
        super(nombre, apellidos, edad, numeroDocumentoIdentidad);
        this.equipofavorito=equipofavorito;
        this.jugadorfavorito=jugadorfavorito;
    }
    
    public String toString(Persona persona){
     String datos="Esta persona es un aficionado \n";
     datos+=persona.mostrarDatos(persona);
     datos+=equipofavorito;
     datos+=jugadorfavorito;
     
     return datos;    
    }
}

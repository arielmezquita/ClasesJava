
package java1e2;

/**
 *
 * @author -adm-jmezquita
 */
public class JAVA1E2 {

    public static void main(String[] args) {
               
        Persona persona1 = new Persona("Ariel", "Mezquita Reynoso", 27, "Dominicano");
        Persona persona2 = new Persona("Pedro", "Martinez", 57, "Dominicano");
        Persona persona3 = new Persona("Maria", "Sharapova", 33, "Rusa");
        Persona persona4 = new Persona("Fernando", "Alonso", 27, "Español");
        Persona persona5 = new Persona("Michael", "Jordan", 27, "Americano");
        
        JugadorFutbol jugador = new JugadorFutbol("Cristiano","Ronaldo", 32, "Portugues","Real Madrid");
        
        Aficionado fanatico = new Aficionado(persona1.getNombre(), persona1.getApellidos(), persona1.getEdad(), persona1.getNumeroDocumentoIdentidad(), "", "");
        
        System.out.println("Persona 1 "+persona1.mostrarDatos(persona1));
        System.out.println("Persona 2 "+persona2.mostrarDatos(persona2));
        System.out.println("Persona 3 "+persona3.mostrarDatos(persona3));
        System.out.println("Persona 4 "+persona4.mostrarDatos(persona4));
        System.out.println("Persona 5 "+persona5.mostrarDatos(persona5));
        
        System.out.println(jugador.toString(jugador));
        
        System.out.println(fanatico.toString(fanatico));
    }
    
}

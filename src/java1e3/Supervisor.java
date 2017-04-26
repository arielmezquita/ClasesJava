
package java1e3;

public class Supervisor extends Empleado {
    //Atributos Adicionales para Supervisor
    private int bonoCombustible;
   
    public Supervisor(int id, String nombre, String cargo, int sueldo, boolean status, int bonoCombustible){
            super(id, nombre, cargo, sueldo, status);
            this.bonoCombustible=bonoCombustible;
    }
    public int getBonoCombustible() {
        return bonoCombustible;
    }

    public void setBonoCombustible(int bonoCombustible) {
        this.bonoCombustible = bonoCombustible;
    }
    
    public void mostrarDatosSupervisor(){
    mostrarDatosEmpleado();
    System.out.println("\n Beneficios Combustible: "+getBonoCombustible());
    
    System.out.println("\n Descuento AFP: "+obtenerDescuentoAFP());
    System.out.println(" Descuento ISS: "+obtenerDescuentoISS());
    System.out.println(" Descuento Suelto Neto: "+(getSueldo()-(obtenerDescuentoAFP()+obtenerDescuentoISS())));
    System.out.println(" Total a Pagar: "+((getSueldo() - (obtenerDescuentoAFP() + obtenerDescuentoISS())) + getBonoCombustible()));
    }
    
}

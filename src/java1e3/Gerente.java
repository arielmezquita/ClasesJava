
package java1e3;


public class Gerente extends Supervisor {
    //Atributos Adicionales para un Gerente
    private int dieta;
    private int bonoGerencial;
    
    public Gerente(int id, String nombre, String cargo, int sueldo, boolean status, int bonoCombustible, int dieta, int bonoGerencial) {
        super(id, nombre, cargo, sueldo, status, bonoCombustible);
        this.dieta=dieta;
        this.bonoGerencial=bonoGerencial;
    }

    public int getDieta() {
        return dieta;
    }

    public void setDieta(int dieta) {
        this.dieta = dieta;
    }
    public int getBonoGerencial() {
        return bonoGerencial;
    }

    public void setBonoGerencial(int bonoGerencial) {
        this.bonoGerencial = bonoGerencial;
    }
    
    public void mostrarDatosGerente(){
    
    mostrarDatosEmpleado();
    System.out.println("\n Beneficio Combustible: "+getBonoCombustible());
    System.out.println(" Beneficio Dieta: "+getDieta());
    System.out.println(" Beneficio Gerencial: "+getBonoGerencial());
    
    System.out.println("\n Descuento AFP: "+obtenerDescuentoAFP());
    System.out.println(" Descuento ISS: "+obtenerDescuentoISS());
    System.out.println(" Descuento Suelto Neto: "+(getSueldo()-(obtenerDescuentoAFP() + obtenerDescuentoISS())));
    System.out.println(" Total a Pagar: "+((getSueldo() - (obtenerDescuentoAFP() + obtenerDescuentoISS())) + getBonoCombustible() + getDieta() + getBonoGerencial()));
    }
}

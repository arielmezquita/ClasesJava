
package java1e3;

public class Empleado {
    //Atributos Basicos para cualquier empleado
    private int id;
    private String nombre;
    private String cargo;
    private int sueldo;
    private double descuentoAFP;
    private double descuentoISS;
    private boolean status;
    
    public Empleado(){
    
    }
    public Empleado(int id, String nombre, String cargo, int sueldo, boolean status){
        this.id=id;
        this.nombre=nombre;
        this.cargo=cargo;
        this.sueldo=sueldo;
        this.status=status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getDescuentoAFP() {
        return descuentoAFP;
    }

    public void setDescuentoAFP(double descuentoAFP) {
        this.descuentoAFP = descuentoAFP;
    }

    public double getDescuentoISS() {
        return descuentoISS;
    }

    public void setDescuentoISS(double descuentoISS) {
        this.descuentoISS = descuentoISS;
    }
    
    //Metodos para Obtener Descuentos Basicos
    public double obtenerDescuentoAFP() {
        return getSueldo() * 0.0272;
    }
    
    public double obtenerDescuentoISS() {
        return getSueldo() * 0.0301;
    }
    
    //Metodo para mostrar informaciones generales 
    public void mostrarDatosEmpleado(){
    System.out.println("\n --------------------------------");
    System.out.println(" ID de Empleado : "+getId());
    System.out.println(" Nombre : "+getNombre());
    System.out.println(" Cargo : "+getCargo());
    System.out.println("\n Sueldo Bruto: "+getSueldo());
    }
    
    //Metodo para mostrar Datos del Un Empelado Operador
    public void mostrarDatosOperador(){
    mostrarDatosEmpleado();    
    System.out.println("\n Descuento AFP: "+obtenerDescuentoAFP());
    System.out.println(" Descuento ISS: "+obtenerDescuentoISS());
    System.out.println(" Descuento Suelto Neto: "+(getSueldo()-(obtenerDescuentoAFP() + obtenerDescuentoISS())));
    System.out.println(" Total a Pagar: "+((getSueldo() - (obtenerDescuentoAFP() + obtenerDescuentoISS()))));
    }  
}

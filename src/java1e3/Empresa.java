
package java1e3;

public class Empresa {
    private String nombreEmpresa;
    private String direccion;
    private int cant_empleados;
    
    public Empresa(String nombreEmpresa, String direccion, int cant_empleados){
        this.nombreEmpresa=nombreEmpresa;
        this.direccion=direccion;
        this.cant_empleados=cant_empleados;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCant_empleados() {
        return cant_empleados;
    }

    public void setCant_empleados(int cant_empleados) {
        this.cant_empleados = cant_empleados;
    }
    
    
    //Metodo para Mostrar datos de la empresa
    
    public void mostrarDatosEmpresa(){
    System.out.println("\n //////////////////////////////////////");
    System.out.println("\n Empresa: "+getNombreEmpresa());
    System.out.println("\n Direccion: "+getDireccion());
    System.out.println("\n Empleados Cant: "+getCant_empleados());
    System.out.println("\n //////////////////////////////////////");
    }
    
    
}

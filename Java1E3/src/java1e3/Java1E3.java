package java1e3;

public class Java1E3 {

    public static void main(String[] args) {
    
    //Objeto Empresa 
    Empresa empresa1 = new Empresa("ESCOBAR ASOC.", "Santo Domingo Oeste", 4);
    empresa1.mostrarDatosEmpresa();
      
    //Objetos de Empleados, Supervisor, Gerente
    Empleado juan = new Empleado(110,"Juan Mezquita", "Operario", 10000, true);
    juan.mostrarDatosOperador();
    
    Supervisor pedro = new Supervisor(105,"Pedro Reynoso", "Supervisor", 15000, true, 2000);    
    pedro.mostrarDatosSupervisor();
    
    Gerente pablo = new Gerente(101, "Pablo Escobar", "Gerente General", 30000, true, 3000,  1000, 2000);
    pablo.mostrarDatosGerente();
        
    }  
}

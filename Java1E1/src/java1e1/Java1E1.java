package java1e1;
import java.util.Scanner;
       
public class Java1E1 {

    public static void main(String[] args) {
       
        int suma=0, numero, resultado;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero entero de dos o mas digitos");
        numero = entrada.nextInt();

        while(numero != 0){
            resultado = numero % 10; //3 //2 //1
            numero = numero / 10;  //12  //1   
            suma = suma + resultado; //3 + 2 + 1 
        }                
        System.out.println("La suma total de los numeros es "+suma);
    }    
}

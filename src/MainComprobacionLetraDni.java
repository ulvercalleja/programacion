import validadordni.*;
import java.util.Scanner;
public class MainComprobacionLetraDni {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dni = "";

        while (true) {
            System.out.println("Introduzca su dni");
            dni = sc.nextLine();

            //Comprobamos si el dni es correcto
            if (ValidadorDni.comprobarDni(dni) == false){
                System.out.println("ERROR: Formato incorrecto.");
            }else System.out.println("DNI correcto");

               
        }
        
        
    }
    
}

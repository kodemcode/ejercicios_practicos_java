package ejercicios;
import java.util.Scanner;

/*
Simulador de Cajero Automático (ATM)
Aquí practicarás estructuras de control de flujo (switch y while) y la clase Scanner.

Enunciado: Crea un menú interactivo que permita a un usuario:

-Ver su saldo actual (empieza en $1000).
-Depositar dinero.
-Retirar dinero (validando que tenga saldo suficiente).
-Salir.

Requisitos: El programa no debe cerrarse hasta que el usuario elija la opción "Salir". Usa un do-while para mantener el menú activo.
*/
public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion,saldo=1000;
        do { 
            System.out.println("Ingrese una opcion:");
            System.out.println("1) Ver saldo");
            System.out.println("2) Depositar");
            System.out.println("3) Retirar");
            System.out.println("4) Salir");
            
            opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                    System.out.println("Saldo en tu cuenta:$"+saldo);
                    break;
                case 2:
                    System.out.println("Depositar:");
                    System.out.println("Monto:");
                    
                    if(saldo>0){
                        saldo += sc.nextInt();
                    }else{
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Retirar");
                    System.out.println("Monto:");
                    saldo -= sc.nextInt();
                    break;
                case 4:
                    System.out.println("saliendo...");
                    break;
                default:
                    System.out.println("opcion incorrecta.");
            }
            } while(opcion!=4);
        
    }
}

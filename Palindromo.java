
import java.util.Scanner;

// Enunciado: Crea un programa que reciba una frase por consola 
// y determine si es un palíndromo (se lee igual al derecho que al revés).
public class Palindromo {
    public static void main(String[] args){
        // Crea un programa que reciba una frase por consola 
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una Frase: ");
        String frase = sc.nextLine();//hola:0=h,o=1,2=l,3=a
        String palindromo = "";
        for (int i = frase.length()-1; i >= 0; i--) {
            palindromo += frase.charAt(i);
        }

        if(frase.equals(palindromo)){
            System.out.println("Es palindromo.");
        }else{
            System.out.println("No es palindromo.");
        }

    }
}
package ejercicios;

/*
Enunciado: Declara un arreglo de 10 números 
enteros con valores aleatorios. 

El programa debe:
- Imprimir el arreglo completo.
- Calcular y mostrar el valor máximo y el valor mínimo.
- Calcular el promedio de todos los números.
*/
public class Estadistica {
    public static void main(String[] args) {
        int numeros[] = {6,3,1,5,0,34,120,29,13,5000,27,56};
        
        int max=0, min=1,cont=0,sum=0;
        double prom=0.0;
        for (int elem : numeros) {
           if(elem>max){
                max = elem;
           }else if(elem<=min){
                min = elem;
           }
           sum += elem;
           cont++;
        }
        prom = sum/10;
        System.out.println("Numeros: "+numeros+"\nMaximo:"+max+"\nMin:"+min+"\nPromedio:"+prom);
    }
}

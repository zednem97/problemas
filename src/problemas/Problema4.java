package problemas;

import java.util.Scanner;

/*
4) Escribe un programa que calcule la suma desde un valor inicial n hasta un valor final N, indica el número de términos que fueron sumados.
Ejemplo
Ingresa el valor inicial: 5
Ingrese el valor final: 9
La suma es 35 y se sumaron 5 términos 
 */
public class Problema4 {

    public static void main(String[] args) {
        int sumatoria = 0, valorInicial, valorFinal, contador = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el valor inicial: ");
        valorInicial = sc.nextInt();
        System.out.println("Ingrese el valor final: ");
        valorFinal = sc.nextInt();
        
        int minimo = Math.min(valorInicial, valorFinal);
        int maximo = Math.max(valorInicial, valorFinal);
        
        for (int i = minimo; i <= maximo; i++) {
            sumatoria +=i;
            contador++;
        }
        System.out.println("La suma es: " + sumatoria + " y se sumaron " + contador + " términos");
    }
}

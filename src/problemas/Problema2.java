package problemas;

import java.util.Scanner;

/*
2) Dado un número N, mostrar la siguiente serie: 1-3+5-7+... N
Observa que los signos van alternando
Ejemplo
Ingresa un número entero positivo: 13
1-3+5-7+9-11+13
*/
public class Problema2 {

    public static void main(String[] args) {
        int numeroIngresado,contador = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero positivo: ");
        numeroIngresado = sc.nextInt();
        
        for (int i = 1; i <= numeroIngresado; i++) {
            if (i % 2 == 1) {
                if (contador % 2 == 0) {
                    System.out.print("+");
                }
                else {
                    System.out.print("-");
                }
                System.out.print(i);
                contador++;
            }
        }
        System.out.println("");
    }
}

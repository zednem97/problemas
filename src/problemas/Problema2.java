package problemas;

import java.util.Scanner;


/*
2) Dado un número N, mostrar la siguiente serie: 1-3+5-7+... N
Observa que los signos van alternando
////ejemplo
Ingresa un número entero positivo: 13
1-3+5-7+9-11+13
 */
public class Problema2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int i, N, j;

        System.out.print("Introduce el valor de N: ");
        N = leer.nextInt();
        j = 0;
        for (i = 1; i < N; i++) {
            if (i % 2 == 1) {
                if (j % 2 == 1) {
                    System.out.print("-");
                } else {
                    System.out.print("+");
                }
                System.out.print(i + " ");
                j++;
            }
        }
    }

}

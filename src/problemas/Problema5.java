package problemas;

import java.util.Random;

/*
5) Desarrollar un programa que obtenga 100 números de manera aleatoria en un rango de 0 a 100 y contar cuántos de ellos son impares.
*/
public class Problema5 {

    public static void main(String[] args) {
        int[] valores = new int[100];
        int contadorImpares = 0;
        Random rnd = new Random();
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) (rnd.nextDouble() * 100);
            if (valores[i] % 2 != 0) {
                contadorImpares++;
            }
        }
        System.out.println("La cantidad de números impares son: " + contadorImpares);
    }
}

package problemas;

import java.util.Random;

/*
5) Desarrollar un programa que obtenga 100 números de manera aleatoria en un rango de 0 a 100 y contar cuántos de ellos son impares.
Aa
*/
public class Problema5 {
    public static void main(String[] args) {
        int valores;
        Random rd = new Random();
       valores = (int)(rd.nextDouble() * 10 + 0);
        System.out.println("valores: " + valores);
//        (int)(rnd.nextDouble() * 10 + 0);
    }
}

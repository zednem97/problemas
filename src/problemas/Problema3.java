package problemas;

import java.util.Scanner;

/*
3) Solicitar al usuario un número entero positivo N. Imprimir N veces la cadena "Hola mundo". Utilice WHILE.
Ejemplo :
Ingresa un número positivo: 4
Hola mundo
Hola mundo
Hola mundo
Hola mundo
*/

public class Problema3 {

    public static void main(String[] args) {
        int numero, contador=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo: ");
        numero = sc.nextInt();
        while (contador != numero ) {            
            System.out.println("Hola mundo");
            contador++;
        }
    }
}

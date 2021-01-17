package problemas;

import java.util.Scanner;

/*
1) Visualizar la tarifa de la luz según el gasto de corriente eléctrica.
Para un gasto menor de 1000 Kwxh la tarifa es 1.2, entre 1OOO y 1850 Kwxh es 1.0 y mayor de 185O Kwxh es de 0.9.
Como ayuda necesitas encontrar el lado mayor
Ejemplo
Ingrese su consumo gasto de corriente eléctrica: 1200
Su tarifa de luz es: 1.0
*/
public class Problema1 {
    
    public static void main(String[] args) {
        int consumo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su consumo gasto de corriente eléctrica:");
        consumo = sc.nextInt();
        if(consumo < 1000 ){
            System.out.println("Su tarifa de luz es: " + "1.2");
        }
        else if(consumo >= 1000 && consumo <= 1850){
            System.out.println("Su tarifa de luz es: " + "1.0");
        }
        else{
        System.out.println("Su tarifa de luz es: " + "0.9");
        }
    }

}

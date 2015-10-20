
package boletin53;

import java.util.Scanner;

/**
 *
 * @author agomezcastro
 */
public class Boletin53 {

    
    public static void main(String[] args) {
        double radio, pi =3.14;
        Scanner obx = new Scanner(System.in);
        System.out.println("radio :");
        radio= obx.nextDouble();
        
        Circulo circulo1 = new Circulo(radio, pi);
        System.out.println("area circulo: "+ circulo1.calclularArea());
        System.out.println("lonxitude circulo: "+ circulo1.calcularLonxitude());
        
    }
    
}

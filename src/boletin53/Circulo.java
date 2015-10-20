
package boletin53;

/**
 *
 * @author agomezcastro
 */
public class Circulo {
    private double radio;
    private final double pi=3.14;
    private double radio2;
    
    public Circulo(){
        
    }
    
    public Circulo(double r, double pi){
        radio=r; 
    }
    
    public double calclularArea(){
        radio2= Math.pow(radio,2);
        return pi*radio2;
    }
    
    public double calcularLonxitude(){
        return pi*radio*2;
    }
}    


package ejercicio1;

public class Circulo extends Figura {
    
    // Propiedades
    private double radio;
    
    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    // Método abstracto sobreescrito
    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }
}


package ejercicio1;

public class Principal {

    public static void main(String[] args) {
        
        // Creación de objetos
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(3,6);
        
        // Mostrar el área
        System.out.println("Círculo:");
        circulo.mostrarArea();
        System.out.println("");
        System.out.println("Rectángulo:");
        rectangulo.mostrarArea();
    }
}

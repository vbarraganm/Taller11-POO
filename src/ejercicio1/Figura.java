
package ejercicio1;

public abstract class Figura {
    
    // Método abstracto
    public abstract double calcularArea();
    
    // Método para mostrar área
    public void mostrarArea() {
        System.out.println("El área de la figura es " + calcularArea());
    }
}

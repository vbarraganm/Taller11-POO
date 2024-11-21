
package ejercicio2;

public abstract class Empleado {
    
    // Método abstracto
    public abstract double calcularSalario();
    
    // Método para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("El salario del empleado es de " + calcularSalario());
    }
}

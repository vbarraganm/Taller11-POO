
package ejercicio3;

public class Principal {

    public static void main(String[] args) {
        
        // Intento para instanciar clase abstracta
        Empleado empleado = new Empleado();
        Gerente gerente = new Gerente(27, 120000);
        
        // Llamada al método concreto
        gerente.mostrarDetalles();
    }
}

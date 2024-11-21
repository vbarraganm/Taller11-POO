
package ejercicio2;

public class Principal {

    public static void main(String[] args) {
        
        // Creación de objetos
        Gerente gerente = new Gerente(30, 120000);
        Vendedor vendedor = new Vendedor(30, 85000);
        
        // Mostrar detalles
        System.out.println("Gerente:");
        gerente.mostrarDetalles();
        System.out.println("");
        System.out.println("Vendedor:");
        vendedor.mostrarDetalles();
    }
}

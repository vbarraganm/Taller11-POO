
package ejercicio3;

public class Gerente extends Empleado {
    
    // Propiedades
    private int diasTrabajados;
    private double pagoPorDia;
    
    // Constructor
    public Gerente(int diasTrabajados, double pagoPorDia) {
        this.diasTrabajados = diasTrabajados;
        this.pagoPorDia = pagoPorDia;
    }
    
    // Método abstracto sobreescrito
    @Override
    public double calcularSalario() {
        return diasTrabajados * pagoPorDia;
    }
    
    // Método para mostrar detalles sobreescrito (no necesario)
    @Override
    public void mostrarDetalles() {
        System.out.println("El salario del gerente es: " + calcularSalario());
    }
}


package ejercicio2;

public class Vendedor extends Empleado {
    
    // Propiedades
    private int diasTrabajados;
    private double pagoPorDia;
    
    // Constructor
    public Vendedor(int diasTrabajados, double pagoPorDia) {
        this.diasTrabajados = diasTrabajados;
        this.pagoPorDia = pagoPorDia;
    }
    
    // Método abstracto sobreescrito
    @Override
    public double calcularSalario() {
        return diasTrabajados * pagoPorDia;
    }
}

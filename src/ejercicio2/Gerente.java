
package ejercicio2;

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
}

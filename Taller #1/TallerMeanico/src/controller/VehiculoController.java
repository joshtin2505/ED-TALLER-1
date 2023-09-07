package controller;

/**
 *
 * @author jostinc
 */
import model.Vehiculo;

public class VehiculoController {

    private Vehiculo[] vehiculos;
    private int indice; 

    public VehiculoController(int capacidad) {
        vehiculos = new Vehiculo[capacidad];
        indice = 0;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        if (indice < vehiculos.length) {
            vehiculos[indice] = vehiculo;
            indice++;
        } else {
            System.out.println("No se puede agregar más vehículos, la lista está llena.");
        }
    }

    public void mostrarAntiguedadSuperiorA5() {
        for (int i = 0; i < indice; i++) {
            if (vehiculos[i].getModelYear() > 5) {
                vehiculos[i].andtiguedad();
            }
        }
    }

    public void mostrarAntiguedadEntre2y5() {
        for (int i = 0; i < indice; i++) {
            if (vehiculos[i].getModelYear() > 2 && vehiculos[i].getModelYear() <= 5) {
                vehiculos[i].andtiguedad();
            }
        }
    }

    public void mostrarAntiguedadInferiorA2() {
        for (int i = 0; i < indice; i++) {
            if (vehiculos[i].getModelYear() <= 2) {
                vehiculos[i].andtiguedad();
            }
        }
    }

    public void mostrarMismaMarca(Vehiculo vehiculo) {
        for (int i = 0; i < indice; i++) {
            if (vehiculos[i] != null) {
                vehiculos[i].mismaMarca(vehiculo);
            }
        }
    }

    public void mostrarMarcaEspecifica(String marca) {
        for (int i = 0; i < indice; i++) {
            if (vehiculos[i] != null) {
                vehiculos[i].markValor(marca);
            }
        }
    }

    public Vehiculo[] getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculo[] vehiculos) {
        this.vehiculos = vehiculos;
    }

    
}

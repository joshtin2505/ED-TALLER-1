
package controller;

import model.Asociados;

public class AsociadosController {

    private Asociados[] asociados;
    private int indice;

    public AsociadosController(int capacidad) {
        asociados = new Asociados[capacidad];
        indice = 0;
    }

    public void agregarAsociado(Asociados asociado) {
        if (indice < asociados.length) {
            asociados[indice] = asociado;
            indice++;
        } else {
            System.out.println("No se puede agregar más asociados, la lista está llena.");
        }
    }

    public void mostrarProyeccionPrestamo(int index) {
        if (index >= 0 && index < indice) {
            asociados[index].desembolso();
        } else {
            System.out.println("El índice especificado está fuera de rango.");
        }
    }

    public Asociados[] getAsociados() {
        return asociados;
    }

    public void setAsociados(Asociados[] asociados) {
        this.asociados = asociados;
    }
    
}
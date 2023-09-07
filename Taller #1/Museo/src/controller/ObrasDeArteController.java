package controller;

import model.ObrasDeArte;

public class ObrasDeArteController {

    private ObrasDeArte[] obras;
    private int indice;

    public ObrasDeArteController(int capacidad) {
        obras = new ObrasDeArte[capacidad];
        indice = 0;
    }

    public void agregarObra(ObrasDeArte obra) {
        if (indice < obras.length) {
            obras[indice] = obra;
            indice++;
        } else {
            System.out.println("No se puede agregar más obras, la lista está llena.");
        }
    }

    public void mostrarEspacioRequerido() {
        for (int i = 0; i < indice; i++) {
            if (obras[i] != null) {
                double espacio = obras[i].calculateRequiredSpace();
                System.out.println("Se requiere un espacio de " + espacio + " para la obra " + obras[i].getTitle());
            }
        }
    }

    public void mostrarAntiguedad() {
        for (int i = 0; i < indice; i++) {
            if (obras[i] != null) {
                String categoria = obras[i].determineAgeCategory();
                System.out.println("La obra " + obras[i].getTitle() + " es " + categoria);
            }
        }
    }

    public void mostrarInformacionEspecifica(int index) {
        if (index >= 0 && index < indice) {
            obras[index].displayInformation();
        } else {
            System.out.println("El índice especificado está fuera de rango.");
        }
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
    
}
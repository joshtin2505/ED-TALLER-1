/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Planta;

public class PlantController {

    private Planta[] plantas;
    private int indice;

    public PlantController(int capacidad) {
        plantas = new Planta[capacidad];
        indice = 0;
    }

    public void agregarPlanta(Planta planta) {
        if (indice < plantas.length) {
            plantas[indice] = planta;
            indice++;
        } else {
            System.out.println("No se puede agregar más plantas, la lista está llena.");
        }
    }

    public void mostrarCompletaInformacion() {
        for (int i = 0; i < indice; i++) {
            if (plantas[i] != null) {
                plantas[i].showCompliteInformation();
            }
        }
    }

    public void mostrarParcialInformacion() {
        for (int i = 0; i < indice; i++) {
            if (plantas[i] != null) {
                plantas[i].showParcialInformation();
            }
        }
    }

    public void mostrarTipoPlanta(String tipo) {
        for (int i = 0; i < indice; i++) {
            if (plantas[i] != null && plantas[i].getType().equalsIgnoreCase(tipo)) {
                plantas[i].showCompliteInformation();
            }
        }
    }

    public Planta[] getPlantas() {
        return plantas;
    }

    public void setPlantas(Planta[] plantas) {
        this.plantas = plantas;
    }
    
    
}


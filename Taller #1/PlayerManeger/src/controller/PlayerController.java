package controller;

import model.Player;

public class PlayerController {

    private Player[] players;
    private int indice;

    public PlayerController(int capacidad) {
        players = new Player[capacidad];
        indice = 0;
    }

    public void agregarJugador(Player jugador) {
        if (indice < players.length) {
            players[indice] = jugador;
            indice++;
        } else {
            System.out.println("No se puede agregar más jugadores, la lista está llena.");
        }
    }

    public void mostrarFormaDeAnotar(int index) {
        if (index >= 0 && index < indice) {
            players[index].score();
        } else {
            System.out.println("El índice especificado está fuera de rango.");
        }
    }

    public void mostrarRequisitosDePartido(int index) {
        if (index >= 0 && index < indice) {
            players[index].matchRequirements();
        } else {
            System.out.println("El índice especificado está fuera de rango.");
        }
    }

    public void mostrarInformacionJugador(int index) {
        if (index >= 0 && index < indice) {
            players[index].displayPlayerInfo();
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

/*
    Se requiere un sistema para administrar jugadores de las disciplinas Futbol y Básquet en una
    escuela deportiva, cada jugador de forma genérica posee las características: nombre,
    apellido, fecha de nacimiento, identificación, peso, estatura y velocidad, aunque un jugador
    de futbol posee pierna hábil, potencia tiro, tiene o no dribling, y porcentaje de pases
    acertados, un jugador de básquet tiene número de puntos de 2, número de puntos de 3,
    saltabilidad, numero de faltas, número de asistencias.
    o Se requiere tener un método que de acuerdo al tipo de jugador muestre la forma
    como realiza una anotación y que requiere para anotar en un partido.
    o Se requiere un método que se llame infoJugador() que permita mostrar la siguiente
    información:
    ▪ Si es de futbol: NOMBRE APELLIDO – Pierna Hábil: xxxxxxxxx, Potencia Tiro:
    xxx, Driblin (SI/NO)
    ▪ Si es de básquet: Nombre Apellido – Asistencias: xx, Puntos de 3:xxx, Puntos
de 2 xxx 
 */
package model;

public abstract class Player {
    protected String firstName;
    protected String lastName;
    protected String dateOfBirth;
    protected String identification;
    protected double weight;
    protected double height;
    protected double speed;

    public Player(String firstName, String lastName, String dateOfBirth, String identification,
                  double weight, double height, double speed) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.identification = identification;
        this.weight = weight;
        this.height = height;
        this.speed = speed;
    }
    
    public abstract void score();

    public abstract void matchRequirements();

    public void displayPlayerInfo() {
        System.out.println(firstName + " " + lastName);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playerManager;

/**
 *
 * @author usuario
 */
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


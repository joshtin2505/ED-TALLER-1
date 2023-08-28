/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playerManager;

/**
 *
 * @author usuario
 */
public class SoccerPlayer extends Player {
    private String preferredFoot;
    private int shootingPower;
    private boolean hasDribbling;
    private double passingAccuracy;

    public SoccerPlayer(String firstName, String lastName, String dateOfBirth, String identification,
                          double weight, double height, double speed,
                          String preferredFoot, int shootingPower, boolean hasDribbling, double passingAccuracy) {
        super(firstName, lastName, dateOfBirth, identification, weight, height, speed);
        this.preferredFoot = preferredFoot;
        this.shootingPower = shootingPower;
        this.hasDribbling = hasDribbling;
        this.passingAccuracy = passingAccuracy;
    }

    @Override
    public void score() {
        System.out.println("Scores with a powerful shot");
    }

    @Override
    public void matchRequirements() {
        System.out.println("Soccer player requires ball, teammates, and goal");
    }

    @Override
    public void displayPlayerInfo() {
        super.displayPlayerInfo();
        System.out.println("Preferred Foot: " + preferredFoot + ", Shooting Power: " + shootingPower +
                ", Dribbling: " + (hasDribbling ? "Yes" : "No"));
    }
}

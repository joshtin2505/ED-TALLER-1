/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package playerManager;

/**
 *
 * @author usuario
 */
public class BasketballPlayer extends Player {
    private int points2;
    private int points3;
    private int verticalJump;
    private int fouls;
    private int assists;

    public BasketballPlayer(String firstName, String lastName, String dateOfBirth, String identification,
                            double weight, double height, double speed,
                            int points2, int points3, int verticalJump, int fouls, int assists) {
        super(firstName, lastName, dateOfBirth, identification, weight, height, speed);
        this.points2 = points2;
        this.points3 = points3;
        this.verticalJump = verticalJump;
        this.fouls = fouls;
        this.assists = assists;
    }

    @Override
    public void score() {
        System.out.println("Scores with a layup or jump shot");
    }

    @Override
    public void matchRequirements() {
        System.out.println("Basketball player requires ball, teammates, and hoop");
    }

    @Override
    public void displayPlayerInfo() {
        super.displayPlayerInfo();
        System.out.println("Assists: " + assists + ", 3-Point Points: " + points3 +
                ", 2-Point Points: " + points2);
    }
}

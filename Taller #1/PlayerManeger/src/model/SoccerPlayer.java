package model;

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

    public String getPreferredFoot() {
        return preferredFoot;
    }

    public void setPreferredFoot(String preferredFoot) {
        this.preferredFoot = preferredFoot;
    }

    public int getShootingPower() {
        return shootingPower;
    }

    public void setShootingPower(int shootingPower) {
        this.shootingPower = shootingPower;
    }

    public boolean isHasDribbling() {
        return hasDribbling;
    }

    public void setHasDribbling(boolean hasDribbling) {
        this.hasDribbling = hasDribbling;
    }

    public double getPassingAccuracy() {
        return passingAccuracy;
    }

    public void setPassingAccuracy(double passingAccuracy) {
        this.passingAccuracy = passingAccuracy;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
    
    
}
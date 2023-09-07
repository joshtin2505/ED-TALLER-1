package model;

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

    public int getPoints2() {
        return points2;
    }

    public void setPoints2(int points2) {
        this.points2 = points2;
    }

    public int getPoints3() {
        return points3;
    }

    public void setPoints3(int points3) {
        this.points3 = points3;
    }

    public int getVerticalJump() {
        return verticalJump;
    }

    public void setVerticalJump(int verticalJump) {
        this.verticalJump = verticalJump;
    }

    public int getFouls() {
        return fouls;
    }

    public void setFouls(int fouls) {
        this.fouls = fouls;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
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

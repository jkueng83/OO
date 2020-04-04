package at.cc.jk.OO.Mensch;

public class SoccerPlayer extends Athlete {

    private float maxSpeed; //m/s
    private int power; // 0-100%

    public SoccerPlayer(String firstName, String familyName, String birthday, float weight, float height,
                        int fitnessLevel, int weekTrainingHours, float maxSpeed, int power) {

        super(firstName, familyName, birthday, weight, height, fitnessLevel, weekTrainingHours);

        this.maxSpeed = maxSpeed;
        this.power = power;

    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void printAthleteData() {
        System.out.println("I am a soccer player!!!\t- Father - Child - Child Object");
        super.printAthleteData();
        printSoccerPlayerDetails();

    }

    private void printSoccerPlayerDetails(){
        System.out.println("My max speed is:\t\t" + this.maxSpeed + " m/s");
        System.out.println("My power is:\t\t\t" + this.power + " %");
    }
}

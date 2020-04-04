package at.cc.jk.OO.Mensch;

public class GoalKeeper extends SoccerPlayer {

    private float jumpingHeight;
    private float jumpingWith;

    public GoalKeeper(String firstName, String familyName, String birthday, float weight, float height,
                      int fitnessLevel, int weekTrainingHours, float maxSpeed, int power, float jumpingHeight,
                      float jumpingWith) {

        super(firstName, familyName, birthday, weight, height, fitnessLevel, weekTrainingHours, maxSpeed, power);
        this.jumpingHeight = jumpingHeight;
        this.jumpingWith = jumpingWith;

    }

    public float getJumpingHeight() {
        return jumpingHeight;
    }

    public void setJumpingHeight(float jumpingHeight) {
        this.jumpingHeight = jumpingHeight;
    }

    public float getJumpingWith() {
        return jumpingWith;
    }

    public void setJumpingWith(float jumpingWith) {
        this.jumpingWith = jumpingWith;
    }

    @Override
    public void printAthleteData() {
        System.out.println("I am a goal keeper!!!!\t- Father - Child - Child - Child Object");
        super.printAthleteData();
        System.out.println("Jumping hight:\t\t\t" + this.jumpingHeight + " m");
        System.out.println("Jumping with:\t\t\t" + this.jumpingWith + " m");

    }

}

package at.cc.jk.OO.Mensch;

public class GoalKeeper extends SoccerPlayer {

    private float jumpingHeight;
    private float jumpingWith;


    public GoalKeeper(String firstName, String familyName, String birthday, float weight, float height) {
        super(firstName, familyName, birthday, weight, height);
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
        System.out.println("I am a goal keeper!?!?!");
        super.printAthleteData();
        System.out.println("Jumping hight:\t" + this.jumpingHeight + " m");
        System.out.println("Jumping with:\t" + this.jumpingWith + " m");

    }


}

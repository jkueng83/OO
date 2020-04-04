package at.cc.jk.OO.Mensch;

public class Forward extends SoccerPlayer {

    private int shootGoalsInSeason;
    private int shootGoalsOverAll;

    public Forward(String firstName, String familyName, String birthday, float weight, float height, int fitnessLevel,
                   int weekTrainingHours, float maxSpeed, int power, int shootGoalsInSeason, int shootGoalsOverAll) {

        super(firstName, familyName, birthday, weight, height, fitnessLevel, weekTrainingHours, maxSpeed, power);

        this.shootGoalsInSeason = shootGoalsInSeason;
        this.shootGoalsOverAll = shootGoalsOverAll;

    }

    public int getShootGoalsInSeason() {
        return shootGoalsInSeason;
    }

    public int getShootGoalsOverAll() {
        return shootGoalsOverAll;
    }

    public void shotGoal() {
        this.shootGoalsInSeason += 1;
        this.shootGoalsOverAll += 1;
    }

    public void resetGoalsInSeason() {
        this.shootGoalsInSeason = 0;
    }

    @Override
    public void printAthleteData() {
        System.out.println("I am a forward!!!!\t\t- Father - Child - Child - Child Object");
        super.printAthleteData();
        System.out.println("Goals in season:\t\t" + this.shootGoalsInSeason);
        System.out.println("Goals total:\t\t\t" + this.shootGoalsOverAll);
    }

}

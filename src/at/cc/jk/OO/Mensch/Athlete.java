package at.cc.jk.OO.Mensch;

public class Athlete extends Person {

    private int fitnessLevel;
    private int weekTrainingHours;


    public Athlete(String firstName, String familyName, String birthday, float weight, float height) {
        super(firstName, familyName, birthday, weight, height);
    }

    public int getFitnessLevel() {
        return fitnessLevel;
    }

    public void setFitnessLevel(int fitnessLevel) {
        this.fitnessLevel = fitnessLevel;
    }

    public int getWeekTrainingHours() {
        return weekTrainingHours;
    }

    public void setWeekTrainingHours(int weekTrainingHours) {
        this.weekTrainingHours = weekTrainingHours;
    }

    public void printAthleteData() {
        printPersonData();
        System.out.println("Fitness level:\t" + this.fitnessLevel);
        System.out.println("Training h/week:\t" + this.weekTrainingHours);
    }

}

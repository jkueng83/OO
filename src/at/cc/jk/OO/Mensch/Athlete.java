package at.cc.jk.OO.Mensch;

public class Athlete extends Person {

    private int fitnessLevel;
    private int weekTrainingHours;


    public Athlete(String firstName, String familyName, String birthday, float weight, float height , int fitnessLevel,
                   int weekTrainingHours) {
        super(firstName, familyName, birthday, weight, height);
        this.fitnessLevel = fitnessLevel;
        this.weekTrainingHours = weekTrainingHours;
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
        System.out.println("I am a Athlete!!\t\t- Father - Child Object");
        printPersonData();
        System.out.println("Fitness level:\t\t\t" + this.fitnessLevel + " %");
        System.out.println("Training h/week:\t\t" + this.weekTrainingHours);
    }

}

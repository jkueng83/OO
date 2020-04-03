package at.cc.jk.OO.Mensch;
/*
Aufgabe Mensch

Versucht folgende Vererbung abzubilden:
Torwart || Sportler || Fußballer || Mensch || Stürmer || Büroangestellter

Es gibt noch zwei weitere Klassen, nämlich einen Verein und eine Firma, welche auf entsprechender Ebene eine Zuordnung
finden sollten.
Findet Englische Begriffe dafür
Überlegt euch in welcher Reihenfolge die Vererbung hier stattfinden kann
Findet je Klasse zwei sinnvolle Eigenschaften und Methoden
Achtet auf private/public

 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Aufgabe Mensch");

        Person p1 = new Person("Johannes", "Küng", "3.9.1983", 185, 70);

        p1.printPersonData();
        p1.calculateAge();

        Athlete a1 = new Athlete("Hans", "Grabherr", "4.5.2000", 80, 180);
        a1.setFitnessLevel(88);
        a1.setWeekTrainingHours(15);
        a1.printAthleteData();

        SoccerPlayer soccerPlayer = new SoccerPlayer("Klaus", "Hämmerle", "5.2.2001",
                77, 188);

        soccerPlayer.setMaxSpeed(7.7f);
        soccerPlayer.setPower(91);
        soccerPlayer.printAthleteData();

        GoalKeeper gk = new GoalKeeper("Martin", "Maier", "3.3.2004",
                78, 185);

        gk.setJumpingHeight(1.12f);
        gk.setJumpingWith(2.5f);
        gk.printAthleteData();

        Forward forward = new Forward("Toni","Polster", "10.3.1964",77,190);
        for (int i = 0; i < 15 ; i++) {
            forward.shotGoal();
        }
        forward.printAthleteData();
        forward.resetGoalsInSeason();
        for (int i = 0; i < 19 ; i++) {
            forward.shotGoal();
        }
        forward.printAthleteData();


    }
}

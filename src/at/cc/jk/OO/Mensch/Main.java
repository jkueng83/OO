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
        System.out.println("############################");
        System.out.println("###### Aufgabe Mensch ######");
        System.out.println("############################");

        Person p1 = new Person("Johannes", "Küng", "3.9.1983", 185, 70);

        p1.printPersonData();
        p1.calculateAge();

        Athlete a1 = new Athlete("Hans", "Grabherr", "4.5.2000", 80, 180,
                70, 22);

        a1.printAthleteData();

        SoccerPlayer soccerPlayer = new SoccerPlayer("Klaus", "Hämmerle", "5.2.2001",
                77, 188, 56, 36, 7.7f, 91);

        soccerPlayer.printAthleteData();

        GoalKeeper gk = new GoalKeeper("Martin", "Maier", "3.3.2004",
                78, 185, 88, 34, 6.9f, 88,
                1.2f, 2.5f);

        gk.printAthleteData();

        Forward toniPolster = new Forward("Toni", "Polster", "10.3.1964",
                77, 188, 55, 8, 6.5f, 67,
                33, 200);

        for (int i = 0; i < 15; i++) {
            toniPolster.shotGoal(); // Toni Polster schießt Tore
        }
        toniPolster.printAthleteData(); // Daten von Toni Polster werden gedruckt
        toniPolster.resetGoalsInSeason(); // Am Ende der Saision werden die Tore der Saison zurückgesetzt.
        for (int i = 0; i < 19; i++) {
            toniPolster.shotGoal();  // Dann beginnt die neue Saison und es werden wieder Tore Geschossen! Tor Tor ...
        }
        toniPolster.printAthleteData(); // Tore der aktuellen Saison und die Gesemtore stehen in den Daten!!! Super!

        OfficeWorker officeWorker1 = new OfficeWorker("Paul", "Kaffeeliebhaber",
                "6.11.1962", 85, 177, "Buchhaltung", 1718);

        officeWorker1.printOfficeWorkerData();

        Company company = new Company("Spar", "Dornbirn Wallenmahd", 1930);

        company.addOfficeWorker(officeWorker1);

        OfficeWorker officeWorkerFranz = new OfficeWorker("Franz", "Habsburg", "12.12.1970",
                66, 150.5f, "Disposition", 1516);
        OfficeWorker officeWorkerKlaus = new OfficeWorker("Klaus", "Habsburg", "12.12.1970",
                88, 152.f, "HR", 2216);

        company.addOfficeWorker(officeWorkerFranz);
        company.addOfficeWorker(officeWorkerKlaus);

        company.printCompanyData();

        SportsClub sportsClubFcHauDaneben = new SportsClub("FC Hau Daneben", "Lange Strasse", 1999);

        Forward Arnautovic = new Forward("Marco", "Arnautovic", "19. April 1989",
                80, 192, 91, 32, 9, 88,
                10, 66);

        SoccerPlayer Alaba = new SoccerPlayer("David", "Alaba", "24. Juni 1992",
                75, 180, 99, 34, 8.8f, 88);

        /*
        Der "sportsClubFcHauDaneben" ist ein SportsClub.
        Dem SportsClub können alle Athleten und alle Vererbungen von "Athlete" angefügt werden. (Athlete, SoccerPlayer,
        Forward, GoalKeeper)
         */

        sportsClubFcHauDaneben.addAthlete(Alaba);  // Alaba ist von der Klasse Fußballspieler -- Vererbt von Athlete
        sportsClubFcHauDaneben.addAthlete(Arnautovic); /* Arnautovic ist von der Klasse Forward -- Vererbt von
                                                            SoccerPlayer  */
        sportsClubFcHauDaneben.addAthlete(toniPolster);
        sportsClubFcHauDaneben.addAthlete(gk);
        sportsClubFcHauDaneben.addAthlete(soccerPlayer);

        sportsClubFcHauDaneben.addAthlete(a1); // auch der Athlete kann dem Sportsclub angefügt werden.

        sportsClubFcHauDaneben.printSporsClubData();

    }
}

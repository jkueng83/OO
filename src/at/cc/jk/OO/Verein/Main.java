package at.cc.jk.OO.Verein;
/*
Aufgabe Verein

Ein Verein hat Mitglieder, Vorstände, Kassiere, Schriftführer und dergleichen. In Summe sind alles Personen aber mit
jeweils unterschiedlichen Funktionen im Verein. Versucht euch hierfür eine Vererbungshierarchie auszuarbeiten.
Jeder Vereinsangehörige hat andere Modalitäten bei der Bezahlung des Mitgliedsbeitrages.
Angenommen der Jahresmitgliedsbeitrag beträgt 200 €, der Vorstand zahlt aber nichts, alle anderen je nach Funktion
einen gewissen Betrag. Versucht somit je Klasse diese Berechnungen zu implementieren.
Zusätzlich gibt es noch eine Klasse Verein, welche natürlich zugeordnet werden muss.

 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Aufgabe Verein");

        SportsClup2 fcKoblach = new SportsClup2("FC Koblach", "Siedlung X",1955) ;

        ClubManagement managerKlausBolter = new ClubManagement("Klaus","Bolter",
                "7.7.1970",75,182);

        Cashier cashierManuelaSpar = new Cashier("Manuele", "Spar", "9.5.1985",60,
                175);
        Reporter reporterFranzWillberichten = new Reporter("Franz", "Willberichten",
                "6.6.2000", 110,180);

        ClubMember c1 = new ClubMember("Manuel", "Bösch","7.4.1995", 80,
                184);

        ClubMember c2 = new ClubMember("Josef", "Hammerer", "19.11.1994",
                73,179);

        fcKoblach.addClubMember(managerKlausBolter);
        fcKoblach.addClubMember(cashierManuelaSpar);
        fcKoblach.addClubMember(reporterFranzWillberichten);
        fcKoblach.addClubMember(c1);
        fcKoblach.addClubMember(c2);

        fcKoblach.printAllClubMembers();

        System.out.println("Der gesamt Jahresbeitrag beträgt: " + fcKoblach.getTotalMembershipFee());



    }
}

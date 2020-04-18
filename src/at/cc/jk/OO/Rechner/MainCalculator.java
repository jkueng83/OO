package at.cc.jk.OO.Rechner;

/*
Aufgabe Rechner

Gegeben sind folgende Klassen, überlegt euch hierzu eine mögliche Vererbungshierarchie

Geo Rechner		⇒ rechnet Umfänge, Flächeninhalte und ähnliches von Formen
Reichweiten Rechner	⇒ rechnet die restliche Reichweite eines Autos aus
Rechner 			⇒ rechnet die Grundrechnungsarten
Währungsrechner	⇒ rechnet an Hand einer Währung den Betrag um
MWST Rechner		⇒ rechnet an Hand eines Länderkürzels die MWST aus

Hierbei ist es auch wichtig euch vorab Gedanken über die Methoden zu machen,
was bekommen diese dann übermittelt und was lässt sich in weiterer Folge über die Mutterklasse abbilden.



 */
public class MainCalculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.getResult(2, CALCULATIONTYPE.ADDITION, 4));
        System.out.println(calculator.getResult(2, CALCULATIONTYPE.SUBTRACTION, 4));
        System.out.println(calculator.getResult(2, CALCULATIONTYPE.MULTIPLICATION, 4));
        System.out.println(calculator.getResult(2, CALCULATIONTYPE.DIVISION, 4));
        System.out.println(calculator.getResult(2, CALCULATIONTYPE.DIVISION, 0));

        GeoCalculator geoCalculator = new GeoCalculator();

        System.out.println("Umfang 10 Seitenlängen: " + geoCalculator.getCircumferentialLength(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        // Tests Rechteck
        System.out.println("Umfang Rechteck: " +
                geoCalculator.getRectangleResult(5, 2, GEOCALCULATIONTYPE.CIRCUMFERENTIALLENGTH));
        System.out.println("Fläche Rechteck: " +
                geoCalculator.getRectangleResult(5, 2, GEOCALCULATIONTYPE.AREA));

        // Tests Quadrat
        System.out.println("Umfang Quadrat: " +
                geoCalculator.getQuadratResult(5, GEOCALCULATIONTYPE.CIRCUMFERENTIALLENGTH));
        System.out.println("Fläche Quadrat: " +
                geoCalculator.getQuadratResult(5, GEOCALCULATIONTYPE.AREA));

        //Reichweitenrechner
        RangeCalculator rangeCalculator = new RangeCalculator();
        System.out.println("Reichweite: " + rangeCalculator.getRange(40, 10));
        System.out.println("Reichweite: " + rangeCalculator.getRange(40, 5.3));

        // Währungsrechner
        CurrencyCalculator currencyCalculator = new CurrencyCalculator(1.087131,
                1.801973, 7.458732, 0.869018,
                1.051037, 1.0);

        System.out.println("Währungsrechner: " + currencyCalculator.getOtherCurrencyAmount(100,
                CURRENCYCODE.EUR, CURRENCYCODE.CHF));
        System.out.println("Währungsrechner: " + currencyCalculator.getOtherCurrencyAmount(100,
                CURRENCYCODE.EUR, CURRENCYCODE.CHF));

        // 100 in alle Währungen umrechnen
        for (CURRENCYCODE currencyCodeAmount : CURRENCYCODE.values()) {
            for (CURRENCYCODE currencyCodeResult : CURRENCYCODE.values()) {
                currencyCalculator.printOtherCurrencyAmount(100, currencyCodeAmount, currencyCodeResult);
            }
        }

        // Mehrwertssteuererechner
        TaxCalculator taxCalculator = new TaxCalculator(20, 19, 7.7);

        for (COUNTRYCODE countryCode : COUNTRYCODE.values()) {
            System.out.println("Die Mehrwertsteuerun in " + countryCode + " beträgt: " +
                    taxCalculator.getTaxValue(countryCode) + " %");

            double amount = 100;
            System.out.println("Die Steuern für den Betrag von  " + amount + " betragen in " + countryCode + " " +
                    taxCalculator.getTex(amount, countryCode));

            System.out.println("Der Gesamtpreis für " + amount + " betragen in " + countryCode + " " +
                    taxCalculator.getTotalPrice(amount, countryCode));


        }

    }
}

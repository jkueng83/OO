package at.cc.jk.OO.Rechner;

public class TaxCalculator extends Calculator {

    private double taxAt;
    private double taxDe;
    private double taxCh;

    public TaxCalculator(double taxAt, double taxDe, double taxCh) {
        this.taxAt = taxAt;
        this.taxDe = taxDe;
        this.taxCh = taxCh;
    }

    public double getTaxValue(COUNTRYCODE countryCode) {
        double tax = 0;

        switch (countryCode) {
            case AT:
                tax = this.taxAt;
                break;
            case CH:
                tax = this.taxCh;
                break;
            case DE:
                tax = this.taxDe;
                break;
        }

        return tax;
    }

    public double getTex(double amount, COUNTRYCODE countryCode) {
        double taxFaktor = getResult(getTaxValue(countryCode), CALCULATIONTYPE.DIVISION, 100);
        return getResult(amount, CALCULATIONTYPE.MULTIPLICATION, taxFaktor);
    }

    public double getTotalPrice(double amount, COUNTRYCODE countryCode) {
        return getResult(amount, CALCULATIONTYPE.ADDITION, getTex(amount, countryCode));
    }
}

package at.cc.jk.OO.Rechner;

public class CurrencyCalculator extends Calculator {

    private double exchangeRateEurUsd;
    private double exchangeRateEurNzd;
    private double exchangeRateEurDkk;
    private double exchangeRateEurGbp;
    private double exchangeRateEurChf;
    private double exchangeRateEurEur;

    public CurrencyCalculator(double exchangeRateEurUsd, double exchangeRateEurNzd,
                              double exchangeRateEurDkk, double exchangeRateEurGbp,
                              double exchangeRateEurChf, double exchangeRateEurEur) {

        this.exchangeRateEurUsd = exchangeRateEurUsd;
        this.exchangeRateEurNzd = exchangeRateEurNzd;
        this.exchangeRateEurDkk = exchangeRateEurDkk;
        this.exchangeRateEurGbp = exchangeRateEurGbp;
        this.exchangeRateEurChf = exchangeRateEurChf;
        this.exchangeRateEurEur = exchangeRateEurEur;
    }

    private double getTotalExchangeRate(CURRENCYCODE currencyCodeAmount, CURRENCYCODE currencyCodeResult) {
        double exchangeRate;

        exchangeRate = getExchangeRate(currencyCodeAmount);

        double exchangeRateToEur = getResult(1, CALCULATIONTYPE.DIVISION, exchangeRate);

        exchangeRate = getExchangeRate(currencyCodeResult);

        double totalExchangeRateToResult = getResult(exchangeRateToEur, CALCULATIONTYPE.MULTIPLICATION, exchangeRate);

        return totalExchangeRateToResult;

    }

    private double getExchangeRate(CURRENCYCODE currencyCode) {
        double exchangeRate = 1.0;

        switch (currencyCode) {
            case CHF:
                exchangeRate = this.exchangeRateEurChf;
                break;
            case EUR:
                exchangeRate = this.exchangeRateEurEur;
                break;
            case DKK:
                exchangeRate = this.exchangeRateEurDkk;
                break;
            case GBP:
                exchangeRate = this.exchangeRateEurGbp;
                break;
            case NZD:
                exchangeRate = this.exchangeRateEurNzd;
                break;
            case USD:
                exchangeRate = this.exchangeRateEurUsd;
                break;
            default:
                exchangeRate = 1.0;
                break;
        }

        return exchangeRate;
    }


    public double getOtherCurrencyAmount(double amount, CURRENCYCODE currencyCodeAmount, CURRENCYCODE currencyCodeResult) {
        double totalExchangeRate = getTotalExchangeRate(currencyCodeAmount, currencyCodeResult);
        return getResult(amount, CALCULATIONTYPE.MULTIPLICATION, totalExchangeRate);
    }

    public void printOtherCurrencyAmount(double amount, CURRENCYCODE currencyCodeAmount,
                                         CURRENCYCODE currencyCodeResult) {

        System.out.println(amount + " " + currencyCodeAmount + " sind " +
                getOtherCurrencyAmount(amount,currencyCodeAmount,currencyCodeResult) + " " + currencyCodeResult);



    }
}

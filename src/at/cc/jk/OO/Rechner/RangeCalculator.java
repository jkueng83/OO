package at.cc.jk.OO.Rechner;

public class RangeCalculator extends Calculator {

    public double getRange(double fuelAmount, double fuelConsumption){
        double result = getResult(fuelAmount, CALCULATIONTYPE.DIVISION, fuelConsumption);
        result = getResult(result,CALCULATIONTYPE.MULTIPLICATION,100);
        return  result;
    }
}

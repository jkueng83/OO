package at.cc.jk.OO.Rechner;

public class Calculator {
    private double number1;
    private double number2;
    private double result;
    private CALCULATIONTYPE calculationType;

    private void addition(){
        this.result = this.number1 + this.number2;
    }

    private void subtraction(){
        this.result = this.number1 - this.number2;
    }

    private void multiplication(){
        this.result = this.number1 * this.number2;
          }

    private void division(){
        try {
            this.result = this.number1 / this.number2;
        } catch (Exception e) {
            System.out.println("error division");
            this.result = 0.0;
        }
    }

    public double getResult(double number1, CALCULATIONTYPE calculationType, double number2){
        this.number1 = number1;
        this.number2 = number2;
        this.calculationType = calculationType;

        switch (this.calculationType){
            case ADDITION:
                addition();
                break;
            case SUBTRACTION:
                subtraction();
                break;
            case MULTIPLICATION:
                multiplication();
                break;
            case DIVISION:
                division();
                break;
        }

        return this.result;

    }


}

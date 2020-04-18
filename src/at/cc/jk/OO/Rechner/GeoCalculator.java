package at.cc.jk.OO.Rechner;

public class GeoCalculator extends Calculator {
    private double[] length = new double[10];

    public double getCircumferentialLength(double length1, double length2, double length3, double length4,
                                           double length5, double length6, double length7, double length8,
                                           double length9, double length10) {

        this.length[0] = length1;
        this.length[1] = length2;
        this.length[2] = length3;
        this.length[3] = length4;
        this.length[4] = length5;
        this.length[5] = length6;
        this.length[6] = length7;
        this.length[7] = length8;
        this.length[8] = length9;
        this.length[9] = length10;

        double circumferentialLength = 0;

        for (int i = 0; i < this.length.length; i++) {
            circumferentialLength += this.length[i];
        }

        return circumferentialLength;

    }

    private double getRectangleCircumferentalLength(double lengthA, double lengthB) {
        double result = getResult(lengthA, CALCULATIONTYPE.ADDITION, lengthB); // Summe Seite A + 2
        result = getResult(result, CALCULATIONTYPE.MULTIPLICATION, 2); // da wir ein Rechteck haben * 2
        return result;
    }

    private double getRectangleArea(double lengthA, double lengthB) {
        return getResult(lengthA, CALCULATIONTYPE.MULTIPLICATION, lengthB);
    }

    public double getRectangleResult(double lengthA, double lengthB, GEOCALCULATIONTYPE geoCalculationType) {
        double result = 0.0;

        switch (geoCalculationType) {
            case CIRCUMFERENTIALLENGTH:
                result = getRectangleCircumferentalLength(lengthA, lengthB);
                break;
            case AREA:
                result = getRectangleArea(lengthA, lengthB);
                break;
        }

        return result;
    }

    public double getQuadratResult(double sideLength, GEOCALCULATIONTYPE geoCalculationType) {
        double result = 0.0;

        switch (geoCalculationType) {
            case CIRCUMFERENTIALLENGTH:
                result = getRectangleCircumferentalLength(sideLength, sideLength);
                break;
            case AREA:
                result = getRectangleArea(sideLength, sideLength);
                break;
        }

        return result;
    }


}

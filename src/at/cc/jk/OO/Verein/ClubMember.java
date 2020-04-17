package at.cc.jk.OO.Verein;

import at.cc.jk.OO.Mensch.Person;

public class ClubMember extends Person {

    protected double membershipFee;

    public ClubMember(String firstName, String familyName, String birthday, float weight, float height) {
        super(firstName, familyName, birthday, weight, height);
        this.membershipFee = 200.00;
    }

    public double getMembershipFee(boolean printMembershipFee) {
        if (printMembershipFee) {
            System.out.println("My membership fee is: " + this.membershipFee);
        }
        return this.membershipFee;
    }

    public void setMembershipFee(double membershipFee) {
        this.membershipFee = membershipFee;
    }

    public void functionOfMember() {
        System.out.println("I am am club member.");
        printName();
    }


}

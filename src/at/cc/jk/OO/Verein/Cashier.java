package at.cc.jk.OO.Verein;

public class Cashier extends ClubMember {

    public Cashier(String firstName, String familyName, String birthday, float weight, float height) {
        super(firstName, familyName, birthday, weight, height);
        this.membershipFee = 100.00;
    }

    @Override
    public void functionOfMember() {
        super.functionOfMember();
        System.out.println("I am a cashier.");
    }
}

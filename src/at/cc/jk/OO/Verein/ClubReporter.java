package at.cc.jk.OO.Verein;

public class ClubReporter extends ClubMember {

    public ClubReporter(String firstName, String familyName, String birthday, float weight, float height) {
        super(firstName, familyName, birthday, weight, height);
        this.membershipFee = 70.00;
    }

    @Override
    public void functionOfMember() {
        super.functionOfMember();
        System.out.println("I am a reporter.");
    }
}

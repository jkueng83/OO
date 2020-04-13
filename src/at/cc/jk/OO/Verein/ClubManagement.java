package at.cc.jk.OO.Verein;

public class ClubManagement extends ClubMember {

    public ClubManagement(String firstName, String familyName, String birthday, float weight, float height) {
        super(firstName, familyName, birthday, weight, height);
        this.membershipFee = 0.00;
    }

    @Override
    public void functionOfMember() {
        super.functionOfMember();
        System.out.println("I am a Manager!");
    }
}

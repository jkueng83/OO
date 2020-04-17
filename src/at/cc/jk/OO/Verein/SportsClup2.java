package at.cc.jk.OO.Verein;

import at.cc.jk.OO.Mensch.CompanyDefault;

import java.util.ArrayList;
import java.util.List;

public class SportsClup2 extends CompanyDefault {

    private List<ClubMember> clubMembers;

    private double totalMembershipFee;

    public SportsClup2(String name, String address, int foundingYear) {
        super(name, address, foundingYear);

        this.clubMembers = new ArrayList<>();

    }

    public void addClubMember(ClubMember clubMember) {

        this.clubMembers.add(clubMember);

    }

    public void printAllClubMembers() {

        printTitleSportsClubMember();

        for (ClubMember clubMember : this.clubMembers) {
            clubMember.functionOfMember();
            System.out.println("-------------------------------------------");
        }

    }

    private void printTitleSportsClubMember() {
        for (int i = 0; i < 3; i++) {

            System.out.print("######");

            if (i % 2 == 0) {

                System.out.print("################");

                for (int j = 0; j < this.getName().length(); j++) {
                    System.out.print("#");
                }

            } else {

                System.out.print(" Club Member - " + this.getName() + " ");

            }

            System.out.println("######");
        }

    }

    private void calculateTotalMembershipFee() {
        double totalMembershipFee = 0.0;
        for (ClubMember clubMember : this.clubMembers) {
            totalMembershipFee += clubMember.getMembershipFee(false);
        }
        //System.out.println("The total membership fee is: " + totalMembershipFee);
        this.totalMembershipFee = totalMembershipFee;
    }

    public double getTotalMembershipFee() {
        calculateTotalMembershipFee();
        return this.totalMembershipFee;
    }

    public void printMembershipFee() {
        System.out.println("#### Membership Fee is: " + getTotalMembershipFee() + " ####");

    }

}

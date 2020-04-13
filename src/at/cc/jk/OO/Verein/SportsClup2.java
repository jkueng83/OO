package at.cc.jk.OO.Verein;

import at.cc.jk.OO.Mensch.CompanyDefault;

import java.util.ArrayList;
import java.util.List;

public class SportsClup2 extends CompanyDefault {
    /*
        private List<ClubManagement> clubManagers;
        private List<Reporter> reporters;
        private List<Cashier> cashiers;

     */
    private List<ClubMember> clubMembers;

    private double totalMembershipFee;

    public SportsClup2(String name, String address, int foundingYear) {
        super(name, address, foundingYear);

        // this.clubManagers = new ArrayList<>();
        // this.reporters = new ArrayList<>();
        // this.cashiers = new ArrayList<>();
        this.clubMembers = new ArrayList<>();

    }

    public void addClubMember(ClubMember clubMember) {
        this.clubMembers.add(clubMember);

    }

    public void printAllClubMembers() {
        for (ClubMember clubMember : this.clubMembers) {
            clubMember.functionOfMember();

        }
    }

    private void calculateTotalMembershipFee() {
        double totalMembershipFee = 0.0;
        for (ClubMember clubMember : this.clubMembers) {
            totalMembershipFee += clubMember.getMembershipFee();
        }
        //System.out.println("The total membership fee is: " + totalMembershipFee);
        this.totalMembershipFee = totalMembershipFee;
    }

    public double getTotalMembershipFee() {
        calculateTotalMembershipFee();
        return this.totalMembershipFee;
    }
}

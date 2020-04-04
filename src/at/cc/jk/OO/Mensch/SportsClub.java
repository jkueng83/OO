package at.cc.jk.OO.Mensch;

import java.util.ArrayList;
import java.util.List;

public class SportsClub extends CompanyDefault {

    private List<Athlete> athletes;

    public SportsClub(String name, String address, int foundingYear) {

        super(name, address, foundingYear);

        this.athletes = new ArrayList<>();
    }

    public void addAthlete(Athlete athlete){
        this.athletes.add(athlete);
    }

    public void printSportsClubData(){
        System.out.println("####################################");
        System.out.println("###### Print sports club data ######");
        System.out.println("####################################");
        printCompanyData();
        for (Athlete athlete:this.athletes) {
            athlete.printAthleteData();
        }
    }
}

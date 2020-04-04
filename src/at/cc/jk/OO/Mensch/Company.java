package at.cc.jk.OO.Mensch;

import java.util.ArrayList;
import java.util.List;

public class Company extends CompanyDefault {

    private List<OfficeWorker> officeWorkers;

    public Company(String name, String address, int foundingYear) {

        super(name, address, foundingYear);

        this.officeWorkers = new ArrayList<>();

    }

    public void addOfficeWorker(OfficeWorker officeWorker) {
        this.officeWorkers.add(officeWorker);
    }

    @Override
    public void printCompanyData() {
        System.out.println("################################");
        System.out.println("###### Print company data ######");
        System.out.println("################################");

        super.printCompanyData();

        System.out.println("Office workers in the company:");

        for (OfficeWorker officeWorker : this.officeWorkers) {
            officeWorker.printOfficeWorkerData();
        }

    }
}

package at.cc.jk.OO.Mensch;

public class CompanyDefault {
    private String name;
    private String address;
    private int foundingYear;

    public CompanyDefault(String name, String address, int foundingYear) {
        this.name = name;
        this.address = address;
        this.foundingYear = foundingYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void printCompanyData() {
        System.out.println("Name:\t\t\t\t\t" + this.name);
        System.out.println("Address:\t\t\t\t" + this.address);
        System.out.println("Founding Year:\t\t\t" + this.foundingYear);
    }
}

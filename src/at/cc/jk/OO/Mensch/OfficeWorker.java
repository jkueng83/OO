package at.cc.jk.OO.Mensch;

public class OfficeWorker extends Person {

    private String department;
    private int personalNumber;

    public OfficeWorker(String firstName, String familyName, String birthday, float weight, float height,
                        String department, int personalNumber) {

        super(firstName, familyName, birthday, weight, height);

        this.personalNumber = personalNumber;
        this.department = department;

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(int personalNumber) {
        this.personalNumber = personalNumber;
    }

    public void printOfficeWorkerData() {
        System.out.println("I am a office Worker!!  - Father - Child Object");
        super.printPersonData();
        System.out.println("Department:\t\t\t\t" + this.department);
        System.out.println("Personal number:\t\t" + this.personalNumber);
    }
}

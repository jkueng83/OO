package at.cc.jk.OO.Mensch;

public class Person {

    private String firstName;
    private String familyName;
    private String birthday;
    private float weight;
    private float height;

    public Person(String firstName, String familyName, String birthday, float weight, float height) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.birthday = birthday;
        this.weight = weight;
        this.height = height;
    }

    public void printName() {
        System.out.println("First name:\t\t\t\t" + this.firstName);
        System.out.println("Family name:\t\t\t" + this.familyName);

    }

    public void printPersonData() {
        System.out.println("I am a Person!\t\t\t- Father Object");
        printName();
        System.out.println("Height:\t\t\t\t\t" + this.height + " cm");
        System.out.println("Weight:\t\t\t\t\t" + this.weight + " kg - My weight is great!");
        System.out.println("Birthday:\t\t\t\t" + this.birthday);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}

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

    public void calculateAge() {
        System.out.println("The age is:" + "------------------ Calculaton is missing!!!!");
    }
}

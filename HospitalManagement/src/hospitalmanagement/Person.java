package hospitalmanagement;

public class Person {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String zipCode;
    private String phoneNumber;

    public Person() {}

    public void setPersonInfo() {
        // implement dialog boxes to set each data field
    }

    public void displayPersonInfo() {
        System.out.println(firstName + " " + lastName + ", " + streetAddress + ", " + zipCode + ", " + phoneNumber);
    }
}

//REFERENCES
//Farell, J, 2019. Java Programming, 9th edition. Cengage Learning

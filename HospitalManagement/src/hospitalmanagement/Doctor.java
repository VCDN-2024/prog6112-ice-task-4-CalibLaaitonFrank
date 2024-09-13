package hospitalmanagement;

public class Doctor extends HospitalStaff {
    private boolean isSpecialist;

    public Doctor() {}

    @Override
    public void setPersonInfo() {
        super.setPersonInfo();
        // implement dialog box to set isSpecialist
    }

    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo();
        System.out.println("Is Specialist: " + (isSpecialist ? "Yes" : "No"));
    }
}

//REFERENCES
//Farell, J, 2019. Java Programming, 9th edition. Cengage Learning

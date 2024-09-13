package hospitalmanagement;

public class HospitalStaff extends Person {
    private int staffID;
    private double annualSalary;
    private String departmentName;

    public HospitalStaff() {}

    @Override
    public void setPersonInfo() {
        super.setPersonInfo();
        // implement dialog boxes to set staffID, annualSalary, and departmentName
    }

    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo();
        System.out.println("Staff ID: " + staffID + ", Annual Salary: " + annualSalary + ", Department: " + departmentName);
    }
}

//REFERENCES
//Farell, J, 2019. Java Programming, 9th edition. Cengage Learning

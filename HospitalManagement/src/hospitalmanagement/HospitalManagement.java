package hospitalmanagement;

import java.util.Scanner;

public class HospitalManagement {
    private HospitalStaff[] hospitalStaff;
    private Doctor[] doctors;
    private Patient[] patients;
    private int hospitalStaffCount = 0;
    private int doctorCount = 0;
    private int patientCount = 0;

    public HospitalManagement() {
        hospitalStaff = new HospitalStaff[4];
        doctors = new Doctor[3];
        patients = new Patient[7];
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter type of person (H for HospitalStaff, D for Doctor, P for Patient, or Q to quit): ");
            char choice = scanner.next().toUpperCase().charAt(0);
            switch (choice) {
                case 'H':
                    if (addHospitalStaff()) {
                        System.out.println("HospitalStaff added successfully.");
                    } else {
                        System.out.println("Error: Maximum number of HospitalStaff reached.");
                    }
                    break;
                case 'D':
                    if (addDoctor()) {
                        System.out.println("Doctor added successfully.");
                    } else {
                        System.out.println("Error: Maximum number of Doctors reached.");
                    }
                    break;
                case 'P':
                    if (addPatient()) {
                        System.out.println("Patient added successfully.");
                    } else {
                        System.out.println("Error: Maximum number of Patients reached.");
                    }
                    break;
                case 'Q':
                    displayReport();
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private boolean addHospitalStaff() {
        if (hospitalStaffCount >= hospitalStaff.length) {
            return false;
        }
        HospitalStaff staff = new HospitalStaff();
        staff.setPersonInfo();  // Assuming you have this method to set staff details
        hospitalStaff[hospitalStaffCount++] = staff;
        return true;
    }

    private boolean addDoctor() {
        if (doctorCount >= doctors.length) {
            return false;
        }
        Doctor doctor = new Doctor();
        doctor.setPersonInfo();  // Assuming you have this method to set doctor details
        doctors[doctorCount++] = doctor;
        return true;
    }

    private boolean addPatient() {
        if (patientCount >= patients.length) {
            return false;
        }
        Patient patient = new Patient();
        patient.setPersonInfo();  // Assuming you have this method to set patient details
        patients[patientCount++] = patient;
        return true;
    }

    private void displayReport() {
        System.out.println("\nHospital Staff:");
        if (hospitalStaffCount == 0) {
            System.out.println("No Hospital Staff entered.");
        } else {
            for (int i = 0; i < hospitalStaffCount; i++) {
                hospitalStaff[i].displayPersonInfo();  // Assuming this method prints staff details
            }
        }

        System.out.println("\nDoctors:");
        if (doctorCount == 0) {
            System.out.println("No Doctors entered.");
        } else {
            for (int i = 0; i < doctorCount; i++) {
                doctors[i].displayPersonInfo();  // Assuming this method prints doctor details
            }
        }

        System.out.println("\nPatients:");
        if (patientCount == 0) {
            System.out.println("No Patients entered.");
        } else {
            for (int i = 0; i < patientCount; i++) {
                patients[i].displayPersonInfo();  // Assuming this method prints patient details
            }
        }
    }

    public static void main(String[] args) {
        HospitalManagement management = new HospitalManagement();
        management.run();
    }
}

//REFERENCES
//Farell, J, 2019. Java Programming, 9th edition. Cengage Learning
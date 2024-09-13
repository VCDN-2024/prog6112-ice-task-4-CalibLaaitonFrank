package hospitalmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Patient extends Person {
    private int medicalRecordNumber;
    private List<String> currentAilments;

    // Constructor to initialize the ailments list
    public Patient() {
        currentAilments = new ArrayList<>();
    }

    @Override
    public void setPersonInfo() {
        super.setPersonInfo();  // Call parent method to set Person data
        
        Scanner scanner = new Scanner(System.in);
        
        // Get medical record number
        System.out.print("Enter Medical Record Number: ");
        medicalRecordNumber = scanner.nextInt();
        scanner.nextLine();  // Clear the newline character
        
        // Get current ailments
        System.out.print("Enter number of current ailments: ");
        int numberOfAilments = scanner.nextInt();
        scanner.nextLine();  // Clear the newline
        
        for (int i = 0; i < numberOfAilments; i++) {
            System.out.print("Enter Ailment " + (i + 1) + ": ");
            currentAilments.add(scanner.nextLine());
        }
    }

    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo();  // Call parent method to display Person data
        System.out.println("Medical Record Number: " + medicalRecordNumber);
        System.out.println("Current Ailments: ");
        
        if (currentAilments.isEmpty()) {
            System.out.println("No ailments recorded.");
        } else {
            for (String ailment : currentAilments) {
                System.out.println("- " + ailment);
            }
        }
    }
}


//REFERENCES
//Farell, J, 2019. Java Programming, 9th edition. Cengage Learning

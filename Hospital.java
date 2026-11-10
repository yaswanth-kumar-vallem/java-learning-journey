package Uniflow;

import java.util.Scanner;

class Patient {
    int patientId;
    String patientName;

    void displayPatient() {
        System.out.println("Patient ID   : " + patientId);
        System.out.println("Patient Name : " + patientName);
    }
}

class PatientDetails extends Patient {
    int patientAge;
    String patientDisease;

    void displayPatientDetails() {
        System.out.println("Patient Age  : " + patientAge);
        System.out.println("Disease      : " + patientDisease);
    }
}

class Treatment extends PatientDetails {
    String doctorName;
    double treatmentCost;

    void displayTreatment() {
        System.out.println("Doctor Name  : " + doctorName);
        System.out.println("Treatment Cost: " + treatmentCost);
    }
}

public class Hospital {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Treatment t = new Treatment();

        System.out.print("Enter the Patient ID: ");
        t.patientId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the Patient Name: ");
        t.patientName = sc.nextLine();

        System.out.print("Enter the Patient Age: ");
        t.patientAge = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the Patient Disease: ");
        t.patientDisease = sc.nextLine();

        System.out.print("Enter the Doctor Name: ");
        t.doctorName = sc.nextLine();

        System.out.print("Enter the Treatment Cost: ");
        t.treatmentCost = sc.nextDouble();

        System.out.println("\n----- Patient Report -----");

        t.displayPatient();
        t.displayPatientDetails();
        t.displayTreatment();

        sc.close();
    }
}
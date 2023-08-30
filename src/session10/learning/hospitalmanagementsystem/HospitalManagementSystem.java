package session10.learning.hospitalmanagementsystem;

import javax.print.Doc;

public class HospitalManagementSystem {

    public static void main(String[] args) {
        Patient patient1 = new Patient("John",60);
        Patient patient2 = new Patient("Luap",15);
        Patient patient3 = new Patient("Alice",27);

        Doctor doctor1 = new Doctor("Ciomu","Urology");
        Doctor doctor2 = new Doctor("Stone","Ophthamology");
        Doctor doctor3 = new Doctor("Jones","Surgery");

        Hospital arcadia = new Hospital();
        Hospital judetean = new Hospital();

        arcadia.admitPatientToList(patient1);
        judetean.admitPatientToList(patient2);
        arcadia.admitPatientToList(patient3);

        for(Patient patient : arcadia.getPatients()) {
            System.out.println("Patients of Arcadia: " + patient.getName());
        }

    }
}
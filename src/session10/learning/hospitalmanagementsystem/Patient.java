package session10.learning.hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Patient {

    private String name;

    private int age;

    private List<String> medicalHistory;

    private UUID patientID;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.patientID = UUID.randomUUID();
        this.medicalHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(List<String> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public UUID getPatientID() {
        return patientID;
    }

    public void setPatientID(UUID patientID) {
        this.patientID = patientID;
    }

    public void addToMedicalHistory(String medicalEvent) {
        medicalHistory.add(medicalEvent);
    }
}
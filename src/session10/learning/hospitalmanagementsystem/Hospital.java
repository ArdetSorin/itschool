package session10.learning.hospitalmanagementsystem;

import java.util.List;
import java.util.ArrayList;

public class Hospital {

    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors;

    public void admitPatientToList(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> getPatients() {
        return patients;
    }
}
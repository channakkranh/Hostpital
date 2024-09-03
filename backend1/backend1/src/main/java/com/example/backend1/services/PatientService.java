package com.example.backend1.services;

import com.example.backend1.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface PatientService {

    public Patient addPatient(Patient patient);

    public Patient getPatientById(Long id);

    public List<Patient> getPatients();

    public void deletePatient(Long id);

    public Patient updatePatient(Patient patient);
}

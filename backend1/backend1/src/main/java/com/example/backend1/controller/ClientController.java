package com.example.backend1.controller;

import com.example.backend1.model.Patient;
import com.example.backend1.services.PatientService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    //service
    @Autowired
    private PatientService patientService;

    @RequestMapping("/")
    public String helloword(){
        return "helloword";
    }
    //add patient
    @PostMapping("/addpatient")
    public String addPatient(@RequestBody Patient patient){
        patientService.addPatient(patient);
        return ("Add Patient Success ...! ");
    }
    //getPatientById
    @RequestMapping("/patient/{id}")
    public Patient getPatientById(@PathVariable("id") Long id ){
        return patientService.getPatientById(id);
    }
    //getPatients
    @RequestMapping("/patients")
    public List<Patient> getPatients(){
        return patientService.getPatients();
    }
    //UpdatePatient
//    @PutMapping("/patient/{id}")
//    public Patient updatePatient(@RequestBody Patient patient){
//        return patientService.updatePatient(patient);
//    }
    @PutMapping("patient/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody @NotNull Patient patient) {
        patient.setId(id);  // Ensure the patient ID is set before updating
        return patientService.updatePatient(patient);
    }
    @DeleteMapping("/patient/{id}")
    public String deletePatient(@PathVariable("id")Long id){
        patientService.deletePatient(id);
        return "Patient Deleted";
    }

}


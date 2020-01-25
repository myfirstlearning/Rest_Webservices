package com.rest.service;

import com.rest.model.Patient;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PatientServiceImpl implements PatientService {

    Map<Long, Patient> patients = new HashMap<>();
    long currentId = 123;

    public PatientServiceImpl(){
        init();
    }

    void init(){
        Patient patient = new Patient();
        patient.setId(currentId);
        patient.setName("Jhon");
        patients.put(patient.getId(), patient);
    }

}

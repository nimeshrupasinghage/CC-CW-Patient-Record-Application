package cw.cloud.patientrecord.service;

import cw.cloud.patientrecord.entity.Patient;
import cw.cloud.patientrecord.repository.PatientRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientRecordService {
    @Autowired
    private PatientRecordRepository patientRepository;

    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElseThrow(() -> new RuntimeException("Patient not found"));
    }

    public Patient updatePatient(Long id, Patient patient) {
        Patient existingPatient = getPatientById(id);
        existingPatient.setName(patient.getName());
        existingPatient.setAge(patient.getAge());
        return patientRepository.save(existingPatient);
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }
}
package cw.cloud.patientrecord.repository;

import cw.cloud.patientrecord.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRecordRepository extends JpaRepository<Patient, Long> {
}

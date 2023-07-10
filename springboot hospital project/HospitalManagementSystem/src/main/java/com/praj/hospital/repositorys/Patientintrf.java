package com.praj.hospital.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praj.hospital.entities.Patient;

public interface Patientintrf extends JpaRepository<Patient, Integer>{

	List<Patient> findById(int id);

}

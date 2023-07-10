package com.praj.hospital.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praj.hospital.entities.Doctor;

public interface Doctorintrf extends JpaRepository<Doctor, Integer> {

	List<Doctor> findById(int id);

}

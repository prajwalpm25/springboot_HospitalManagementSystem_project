package com.praj.hospital.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.praj.hospital.entities.Appoinment;

public interface Appoinmentintrf extends JpaRepository<Appoinment, Integer>{
	
	List<Appoinment> findById(int id);

}

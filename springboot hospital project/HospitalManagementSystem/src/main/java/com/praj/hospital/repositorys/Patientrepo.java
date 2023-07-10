package com.praj.hospital.repositorys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.praj.hospital.entities.Patient;

@Repository
public class Patientrepo {
	
	@Autowired
	private Patientintrf patntintrf;

	public Patient patntsave(Patient patenti) {
		
		return patntintrf.save(patenti);
	}

	public Patient patntupdate(Patient patenti) {
		
		return patntintrf.save(patenti);
	}

	public void patntdelete(int id) {
		patntintrf.deleteById(id);
		
	}

	public List<Patient> findbyid(int id) {
		return patntintrf.findById(id);
	}

}

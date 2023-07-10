package com.praj.hospital.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praj.hospital.entities.Patient;
import com.praj.hospital.repositorys.Patientrepo;

@Service
public class Patientserv {
	
	@Autowired
	private Patientrepo patntrepo;

	public Patient patntsave(Patient patenti) {
		return patntrepo.patntsave( patenti);
	}

	public Patient patntupdate(Patient patenti) {
		return patntrepo.patntupdate( patenti);
	}

	public void patntdelete(int id) {
		patntrepo.patntdelete( id);
	}

	public List<Patient> findbyid(int id) {
		return patntrepo.findbyid( id);
	}

}

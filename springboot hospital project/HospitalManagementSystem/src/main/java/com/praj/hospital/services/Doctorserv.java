package com.praj.hospital.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praj.hospital.entities.Doctor;
import com.praj.hospital.repositorys.Doctorrepo;

@Service
public class Doctorserv {
	
	@Autowired
	private Doctorrepo docrepo;

	public Doctor doctsave(Doctor docenti) {
		return docrepo.doctosave(docenti);
	}

	public Doctor doctupdate(Doctor docenti) {
		return docrepo.doctupdate(docenti);
	}

	public void doctdelete(int id) {
		docrepo.doctodelete(id);
		
	}

	public List<Doctor> findbyid(int id) {
		return docrepo. findbyid(id);
	}

}

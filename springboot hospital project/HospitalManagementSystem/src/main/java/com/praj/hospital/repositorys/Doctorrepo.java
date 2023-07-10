package com.praj.hospital.repositorys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.praj.hospital.entities.Doctor;

@Repository
public class Doctorrepo {
	
	@Autowired
	private Doctorintrf docintrf;

	public Doctor doctosave(Doctor docenti) {		
		return docintrf.save(docenti);
	}

	public Doctor doctupdate(Doctor docenti) {		
		return docintrf.save(docenti);
	}

	public void doctodelete(int id) {
		docintrf.deleteById(id);
	}

	public List<Doctor> findbyid(int id) {	
		return docintrf.findById(id);
	}

}

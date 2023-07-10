package com.praj.hospital.repositorys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.praj.hospital.entities.Appoinment;

@Repository
public class Appoinmentrepo {
	
	@Autowired
	private Appoinmentintrf appointrf;

	public Appoinment appoisave(Appoinment appoenti) {
		return appointrf.save(appoenti);
	}

	public Appoinment appoiupdate(Appoinment appoenti) {
		return appointrf.save(appoenti);
	}

	public void appoidelete(int id) {
		appointrf.deleteById(id);
	}

	public List<Appoinment> findbyid(int id) {
		return appointrf.findById(id);
	}

}

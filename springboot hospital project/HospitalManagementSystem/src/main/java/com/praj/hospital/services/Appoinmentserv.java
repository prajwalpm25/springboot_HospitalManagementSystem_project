package com.praj.hospital.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.praj.hospital.entities.Appoinment;
import com.praj.hospital.repositorys.Appoinmentrepo;

@Service
public class Appoinmentserv {
	
	@Autowired
	private Appoinmentrepo appoinrep;

	public Appoinment appoisave(Appoinment appoenti) {
		return appoinrep.appoisave(appoenti);
	}

	public Appoinment appoiupdate(Appoinment appoenti) {
		return appoinrep.appoiupdate(appoenti);
	}

	public void appoidelete(int id) {
		appoinrep.appoidelete(id);
	}

	public List<Appoinment> findbyid(int id) {
		return appoinrep.findbyid(id);
	}

}

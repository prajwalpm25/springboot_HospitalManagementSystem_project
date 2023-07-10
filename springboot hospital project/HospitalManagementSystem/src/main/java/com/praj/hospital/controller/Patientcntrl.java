package com.praj.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.praj.hospital.entities.Patient;
import com.praj.hospital.services.Patientserv;

@RestController
public class Patientcntrl {
	
	@Autowired
	private Patientserv patntserv;
	
	@PostMapping("/patnt/save")
	public @ResponseBody Patient patntsave(@RequestBody Patient patenti) {
		return patntserv.patntsave(patenti);
		
	}
	
	@PutMapping("/patnt/update")
	public @ResponseBody  Patient doctoupdate(@RequestBody Patient patenti) {
		return patntserv.patntupdate(patenti);
		
	}
	
	@PostMapping("/patnt/delete")
	public @ResponseBody  void appoiidelete(@RequestParam ("id")  int id) {
		patntserv.patntdelete(id);
		
	}
	
	@GetMapping("/patnt/findbyid/{ide}")
	public @ResponseBody  List<Patient> findbyid(@PathVariable ("ide") int id ) {
		return patntserv.findbyid(id);
		
	}

}

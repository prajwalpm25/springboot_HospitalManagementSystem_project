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

import com.praj.hospital.entities.Doctor;
import com.praj.hospital.services.Doctorserv;

@RestController
public class Doctorcntrl {

	@Autowired
	private Doctorserv doctorserv;
	
	@PostMapping("/doc/save")
	public @ResponseBody Doctor doctosave(@RequestBody Doctor docenti) {
		return doctorserv.doctsave(docenti);
		
	}
	
	@PutMapping("/doc/update")
	public @ResponseBody  Doctor doctoupdate(@RequestBody Doctor docenti) {
		return doctorserv.doctupdate(docenti);
		
	}
	
	@PostMapping("/doc/delete")
	public @ResponseBody  void appoiidelete(@RequestParam ("id")  int id) {
		doctorserv.doctdelete(id);
		
	}
	
	@GetMapping("/doc/findbyid/{ide}")
	public @ResponseBody  List<Doctor> findbyid(@PathVariable ("ide") int id ) {
		return doctorserv.findbyid(id);
		
	}
}

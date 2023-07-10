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

import com.praj.hospital.entities.Appoinment;
import com.praj.hospital.services.Appoinmentserv;

@RestController
public class Appoinmentcntrl {
	
	@Autowired
	private Appoinmentserv appoinmentserv;
	
	@PostMapping("/appo/save")
	public @ResponseBody Appoinment appoiisave(@RequestBody Appoinment appoenti) {
		return appoinmentserv.appoisave(appoenti);
		
	}
	
	@PutMapping("/appo/update")
	public @ResponseBody  Appoinment appoiiupdate(@RequestBody Appoinment appoenti) {
		return appoinmentserv.appoiupdate(appoenti);
		
	}
	
	@PostMapping("/appo/delete")
	public @ResponseBody  void appoiidelete(@RequestParam ("id")  int id) {
		appoinmentserv.appoidelete(id);
		
	}
	
	@GetMapping("/appo/findbyid/{ide}")
	public @ResponseBody  List<Appoinment> findbyid(@PathVariable ("ide") int id ) {
		return appoinmentserv.findbyid(id);
		
	}
	

}

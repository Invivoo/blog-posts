package com.invivoo.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.invivoo.webapp.model.Developer;
import com.invivoo.webapp.service.DeveloperService;

@RestController
public class DeveloperController {

	@Autowired
	DeveloperService developerService;

	@RequestMapping(path = "/findByAgeAndProjectName", method = RequestMethod.GET)
	public List<Developer> findByAgeAndProjectName(@RequestParam("age") int age,
			@RequestParam("projectName") String projectName) {
		
		return developerService.findByAgeAndProjectName(age, projectName);
		
	}
}
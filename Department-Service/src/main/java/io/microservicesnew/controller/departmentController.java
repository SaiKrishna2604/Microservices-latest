package io.microservicesnew.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.microservicesnew.entities.Department;
import io.microservicesnew.service.departmentService;

@RestController
@RequestMapping("/departments")
public class departmentController {
	
	@Autowired
	private departmentService departmentservice;
	
	static final Logger log = 
	        LoggerFactory.getLogger(departmentController.class);
	  
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("inside save department method of DepartmentController");
		return departmentservice.saveDepartment(department);
		}
	
	@GetMapping("/{departmentId}")
	public Department findDepartmentById(@PathVariable Long departmentId) {
		log.info("inside findbydepartmentid method of DepartmentController");
		return departmentservice.findDepartmentById(departmentId);

	}
}

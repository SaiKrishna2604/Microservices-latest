package io.microservicesnew.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.microservicesnew.entities.Department;
import io.microservicesnew.repository.DepartmentRepository;

@Service
public class departmentService {
	
	@Autowired
	private DepartmentRepository departmentrepository;
	
	static final Logger log = 
	        LoggerFactory.getLogger(departmentService.class);
	
	public Department saveDepartment(Department department) {
		log.info("inside save menthod of DepartmentService");
		return departmentrepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("inside finddepartmentbyid menthod of DepartmentService");

		return departmentrepository.findByDepartmentId(departmentId);
	}
	
	
}

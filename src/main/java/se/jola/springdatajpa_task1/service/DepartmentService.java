package se.jola.springdatajpa_task1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.jola.springdatajpa_task1.repo.DepartmentRepository;

@Service
public final class DepartmentService {

	@Autowired
	private final DepartmentRepository departmentRepository;

	public DepartmentService(DepartmentRepository departmentRepository) {
		this.departmentRepository = departmentRepository;
	}

}

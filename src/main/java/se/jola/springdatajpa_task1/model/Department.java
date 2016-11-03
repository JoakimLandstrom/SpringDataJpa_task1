package se.jola.springdatajpa_task1.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public final class Department {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;

	@ManyToMany(mappedBy = "departments")
	private Collection<Employee> employees;

	protected Department() {
	}

	public Department(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Collection<Employee> getEmployees() {
		return employees;
	}

}

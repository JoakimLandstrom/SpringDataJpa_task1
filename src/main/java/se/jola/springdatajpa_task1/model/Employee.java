package se.jola.springdatajpa_task1.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public final class Employee {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String firstName;

	@Column(nullable = false)
	private String lastName;

	@Column
	private String employeeNumber = "1";

	@ManyToMany
	private Collection<Department> departments;

	@OneToOne
	@JoinColumn(unique = true)
	private ParkingSpot parkingSpot;

	protected Employee() {
	}

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public Collection<Department> getDepartments() {
		return departments;
	}

	public ParkingSpot getParkingSpot() {
		return parkingSpot;
	}

	public Employee setParkingSpot(ParkingSpot parkingSpot) {
		this.parkingSpot = parkingSpot;
		return this;
	}
}

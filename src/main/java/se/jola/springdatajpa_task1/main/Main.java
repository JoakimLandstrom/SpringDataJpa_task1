package se.jola.springdatajpa_task1.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import se.jola.springdatajpa_task1.model.Employee;
import se.jola.springdatajpa_task1.model.ParkingSpot;
import se.jola.springdatajpa_task1.repo.EmployeeRepository;
import se.jola.springdatajpa_task1.repo.ParkingSpotRepository;

public class Main {

	public static void main(String[] args) {
		Employee employee;

		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {

			context.scan("se.jola.springdatajpa_task1");
			context.refresh();

			EmployeeRepository repository = context.getBean(EmployeeRepository.class);

			ParkingSpotRepository parkingSpotRepository = context.getBean(ParkingSpotRepository.class);
			ParkingSpot parkingSpot = new ParkingSpot("parking spot");

			parkingSpotRepository.save(parkingSpot);
			employee = repository.save(new Employee("Joakim", "Landström").setParkingSpot(parkingSpot));

			System.out.println(employee.getParkingSpot().getId());
		}
	}

}

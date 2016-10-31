package se.jola.springdatajpa_task1.repo;

import org.springframework.data.repository.CrudRepository;

import se.jola.springdatajpa_task1.model.ParkingSpot;

public interface ParkingSpotRepository extends CrudRepository<ParkingSpot, Long> {

}

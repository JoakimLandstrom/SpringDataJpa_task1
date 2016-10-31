package se.jola.springdatajpa_task1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public final class ParkingSpot {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private Long parkingSpotId;

    @Column
    private String label;

    protected ParkingSpot() {

    }

    public ParkingSpot(String label, Long id) {
	this.label = label;
	this.parkingSpotId = id;
    }

    public Long getId() {
	return id;
    }

    public Long getParkingSpotId() {
	return parkingSpotId;
    }

    public String getLabel() {
	return label;
    }

}

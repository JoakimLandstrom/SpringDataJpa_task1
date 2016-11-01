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

    @Column
    private String label;

    protected ParkingSpot() {

    }

    public ParkingSpot(String label) {
	this.label = label;
    }

    public Long getId() {
	return id;
    }

    public String getLabel() {
	return label;
    }

}

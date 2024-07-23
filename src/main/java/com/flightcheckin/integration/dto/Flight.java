package com.flightcheckin.integration.dto;

import java.sql.Date;
import java.sql.Timestamp;

import lombok.Data;

@Data
//@Table(name = "flight")
public class Flight  {

//	private static final long serialVersionUID = 1L;

	private Long id;

	private String flightNumber;

	private String operatingAirlines;

	private String departureCity;

	private String arrivalCity;

	private Date dateOfDeparture;

	private Timestamp estimatedDepartureTime;

}

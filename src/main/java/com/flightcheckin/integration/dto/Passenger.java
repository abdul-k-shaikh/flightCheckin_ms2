package com.flightcheckin.integration.dto;

import java.io.Serializable;

import lombok.Data;

@Data

public class Passenger implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String firstName;

	private String lastName;

	private String middleName;

	private String email;

	private String phone;

}

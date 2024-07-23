package com.flightcheckin.integration;

import com.flightcheckin.integration.dto.Reservation;
import com.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	public Reservation findReservation(Long id);

	public Reservation updateReservation(ReservationUpdateRequest request);
}

package de.carpark;

import java.time.LocalDateTime;

public class Car implements CarIF {
	private static int carCount;
	private LocalDateTime arrivalTime;
	private LocalDateTime departureTime;
	private int price;
	private int number;
	private boolean hasMonthlyTicket;
	
	public Car() {
		this.number = ++carCount;
	}
	
	@Override
	public void arrive() {
		
	}
	
	@Override
	public void depart() {
		
	}

	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

}

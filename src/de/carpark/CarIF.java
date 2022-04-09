package de.carpark;

import java.time.LocalDateTime;

public interface CarIF {
	void arrive();
	void depart();
	LocalDateTime getArrivalTime();
	
	
}

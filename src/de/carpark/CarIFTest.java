package de.carpark;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarIFTest {
	
	CarIF c1, c2, c3;

	@BeforeEach
	void setUp() throws Exception {
		c1 = new Car();
		c2 = new Car();
		c3 = new Car();
	}

	@Test
	@DisplayName("Variables arrivalTime and number are set correctly.")
	void testArrive() {
		c1.arrive();
		assertNotNull(c1.getArrivalTime());
	}

	@Test
	@Disabled
	void testDepart() {
		fail("Not yet implemented");
	}

}

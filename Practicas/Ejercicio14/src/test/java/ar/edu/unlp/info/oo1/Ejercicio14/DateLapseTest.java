package ar.edu.unlp.info.oo1.Ejercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.Ejercicio15.DateLapseDos;


public class DateLapseTest {

	DateLapseDos date1;
	
	DateLapse date2;
	
	@BeforeEach
	void setUp() throws Exception {
		date1 = new DateLapseDos(LocalDate.now(),10);
		date2 = new DateLapse(LocalDate.now(), LocalDate.of(2023, 10, 30));
	}
	
	@Test
    public void testSizeInDays() {
        assertEquals(10,this.date1.sizeInDays());
        assertEquals(10, this.date2.sizeInDays());
    }
	
	@Test
	public void testIncludesDate() {
		assertTrue(this.date1.includesDate(LocalDate.of(2023, 10, 24)));
		assertFalse(this.date1.includesDate(LocalDate.of(1900, 10, 10)));
		
		assertTrue(this.date2.includesDate(LocalDate.of(2023, 10, 24)));
		assertFalse(this.date2.includesDate(LocalDate.of(1, 1, 1)));
	}	

	
}


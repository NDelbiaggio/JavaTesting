package com.delbiaggio.haagahelia.delbiaggioTesting;

import static org.junit.Assert.*;

public class TimeZoneTest {

	/**
	 * Testing the local time with the time zone Eastern European Time (GMT +2)
	 */

	@Test
	public void testCurrentTimezone() {

		TimeSource ts = new SystemTimeSource();

		Watch w = new FinnishWatch(ts);

		String expected = w.getTimeInTimeZoneX("two");
		String actual = w.getTime();

		assertEquals(expected, actual);

	}
	
	@Test
	public void testDifferentTimeZone(){
		
		TimeSource ts = new SystemTimeSource();
		Watch w = new FinnishWatch(ts);
		String expected = w.getTimeInTimeZoneX("zero");
		String actual = w.getTime();
		boolean check = expected.equals(actual);
		
		assertFalse("The times are different", check);
	}

}

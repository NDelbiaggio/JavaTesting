package com.delbiaggio.haagahelia.delbiaggioTesting;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MockTimeSourceTest {
	   
	private Date date;
	
	@Before
	public void init(){
		Calendar calendar = new GregorianCalendar();
		calendar.set(2016, 10, 2, 20, 36, 17);
		date = calendar.getTime();
	}
	
	@Test
	public void testGetTimeMoment(){
		/*// problems to solve about final result..
		MockTimeSource mts = new MockTimeSource();
		org.junit.Assert.assertEquals(mts.getTimeMoment(), date);
		*/
		// Old version
	   TimeSource mockedTimeSource = Mockito.mock(SystemTimeSource.class);
	   Watch w = new FinnishWatch(mockedTimeSource);
	   Calendar calendar = new GregorianCalendar();
	   calendar.set(2016, 10, 2, 20, 36, 17);		   
	   Mockito.when(mockedTimeSource.getTimeMoment()).thenReturn(calendar.getTime());
	   TimeSource mock2 = new MockTimeSource();		   
	   String expected =  w.getDay();
	   String actual = new FinnishWatch(mock2).getDay();
	   org.junit.Assert.assertTrue(actual.equals(expected));
	}

}

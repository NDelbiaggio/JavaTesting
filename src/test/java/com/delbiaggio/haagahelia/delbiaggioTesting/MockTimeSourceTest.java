package com.delbiaggio.haagahelia.delbiaggioTesting;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import junit.framework.Assert;

public class MockTimeSourceTest {
	   
	private Date dateTest;
	
	@Before
	public void init(){
		Calendar calendar = new GregorianCalendar();
		calendar.set(2016, 10, 2, 20, 36, 17);
		dateTest = calendar.getTime();
	}
	
	@Test
	public void testGetTimeMoment(){
		// problems to solve about final result..
		//MockTimeSource mts = new MockTimeSource();		
		//Assert.assertEquals(mts.getTimeMoment(), dateTest);
		
		// Old version
	   TimeSource mockedTimeSource = Mockito.mock(SystemTimeSource.class);
	   Watch w = new FinnishWatch(mockedTimeSource);
	   Calendar calendar = new GregorianCalendar();
	   calendar.set(2016, 10, 2, 20, 36, 17);		   
	   Mockito.when(mockedTimeSource.getTimeMoment()).thenReturn(calendar.getTime());
	   TimeSource mock = new MockTimeSource();		   
	   org.junit.Assert.assertTrue(w.getDate().equals(new FinnishWatch(mock).getDate()));
	}

}

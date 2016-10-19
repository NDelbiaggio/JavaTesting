package com.delbiaggio.haagahelia.delbiaggioTesting;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class TestJunit {
	   @Test		
	   public void testSystem() {
	      Date expected =  new SystemTimeSource().getTimeMoment();
		  Date actual = new Date();
	      assertEquals(actual, expected);
	   }
	   
	   @Test
	   public void testInternetTime(){
		   TimeSource mock = new InternetTimeSource();
		   Watch test = new FinnishWatch(mock);		   
		   Watch test2 = new FinnishWatch(new SystemTimeSource());
		   String expected =  test.getDate();
		   String actual = test2.getDate();
		   assertEquals(actual, expected);
	   }
	   
	   @Test
	   public void testMock(){
		   TimeSource mock = new SystemTimeSource();
		   TimeSource mock2 = new MockTimeSource();		   
		   String expected =  new FinnishWatch(mock).getDay();
		   String actual = new FinnishWatch(mock2).getDay();
		   assertEquals(actual, expected);
	   }
	   
	   @Test
	   public void testDayInFinnish(){
		   TimeSource mock = new MockTimeSource();
		   Watch test = new FinnishWatch(mock);	
		   String expected =  "Keskiviikko";
		   String actual = test.getFinnishDay();
		   assertEquals(actual, expected);		   
	   }
	   
	   
}

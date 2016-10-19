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
		   String expected =  EnumarationDays.mercredi.getFinnish();
		   String actual = test.getFinnishDay();
		   assertEquals(actual, expected);		   
	   }
	   
	   @Test
	   public void testDayInGerman(){
		   TimeSource mock = new MockTimeSource();
		   Watch test = new FinnishWatch(mock);	
		   String expected =  EnumarationDays.mercredi.getGerman();
		   String actual = test.getGermanDay();
		   assertEquals(actual, expected);		   
	   }
	   
	   @Test
	   public void testDayInEnglish(){
		   TimeSource mock = new MockTimeSource();
		   Watch test = new FinnishWatch(mock);
		   String expected =  EnumarationDays.mercredi.getEnglish();
		   String actual = test.getEnglishDay();
		   assertEquals(actual, expected);		   
	   }
	   
	   @Test
	   public void testTodayFinnish(){
		   TimeSource mock = new SystemTimeSource();
		   Watch test = new FinnishWatch(mock);
		   String expected =  EnumarationDays.vendredi.getFinnish();
		   String actual = test.getFinnishDay();
		   assertEquals(actual, expected);		   
	   }
	   
	   
	   
}

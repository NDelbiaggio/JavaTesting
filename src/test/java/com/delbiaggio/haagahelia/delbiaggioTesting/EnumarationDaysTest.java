package com.delbiaggio.haagahelia.delbiaggioTesting;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class EnumarationDaysTest {
	   
	@Test		
	   public void testSystem() {
	      Date expected =  new SystemTimeSource().getTimeMoment();
		  Date actual = new Date();
	      assertEquals(actual, expected);
	   }
	   
	   @Test
	   public void testDayInFinnish(){
		   TimeSource mock = new MockTimeSource();
		   Watch test = new FinnishWatch(mock);	
		   String expected =  EnumarationDays.mercredi.getFinnish();
		   String actual = test.getDay(Languages.Finnish);
		   assertEquals(actual, expected);		   
	   }
	   
	   @Test
	   public void testDayInGerman(){
		   TimeSource mock = new MockTimeSource();
		   Watch test = new FinnishWatch(mock);	
		   String expected =  EnumarationDays.mercredi.getGerman();
		   String actual = test.getDay(Languages.German);
		   assertEquals(actual, expected);		   
	   }
	   
	   @Test
	   public void testDayInEnglish(){
		   TimeSource mock = new MockTimeSource();
		   Watch test = new FinnishWatch(mock);
		   String expected =  EnumarationDays.mercredi.getEnglish();
		   String actual = test.getDay(Languages.English);
		   assertEquals(actual, expected);		   
	   }
	   
	   @Test
	   public void testTodayFinnish(){
		   TimeSource mock = new SystemTimeSource();
		   Watch test = new FinnishWatch(mock);
		   String expected =  EnumarationDays.vendredi.getFinnish();
		   String actual = test.getDay(Languages.Finnish);
		   assertEquals(actual, expected);		   
	   }
	   
}

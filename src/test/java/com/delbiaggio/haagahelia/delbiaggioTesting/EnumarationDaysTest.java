package com.delbiaggio.haagahelia.delbiaggioTesting;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class EnumarationDaysTest {
	   /**
            * Testing if the systemtimesource is working properly
            */
	@Test		
	   public void testSystem() {
	      Date expected =  new SystemTimeSource().getTimeMoment();
		  Date actual = new Date();
	      assertEquals(actual, expected);
	   }
	   /**
            * Testing if the translations to Finnish works properly
            */
	   @Test
	   public void testDayInFinnish(){
		   TimeSource mock = new MockTimeSource();
		   Watch test = new FinnishWatch(mock);	
		   String expected =  EnumarationDays.mercredi.getFinnish();
		   String actual = test.getDay(Languages.Finnish);
		   assertEquals(actual, expected);		   
	   }
	   /**
            * Testing if the translations to German works properly
            */
	   @Test
	   public void testDayInGerman(){
		   TimeSource mock = new MockTimeSource();
		   Watch test = new FinnishWatch(mock);	
		   String expected =  EnumarationDays.mercredi.getGerman();
		   String actual = test.getDay(Languages.German);
		   assertEquals(actual, expected);		   
	   }
	   /**
            * Testing if the translations to English works properly
            */
	   @Test
	   public void testDayInEnglish(){
		   TimeSource mock = new MockTimeSource();
		   Watch test = new FinnishWatch(mock);
		   String expected =  EnumarationDays.mercredi.getEnglish();
		   String actual = test.getDay(Languages.English);
		   assertEquals(actual, expected);		   
	   }
	   /**
            * Testing if the translations of today to Finnish works properly
            */
	   @Test
	   public void testTodayFinnish(){
		   TimeSource mock = new SystemTimeSource();
		   Watch test = new FinnishWatch(mock);
		   String expected =  EnumarationDays.vendredi.getFinnish();
		   String actual = test.getDay(Languages.Finnish);
		   assertEquals(actual, expected);		   
	   }
	   
}

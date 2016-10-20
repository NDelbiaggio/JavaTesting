package com.delbiaggio.haagahelia.delbiaggioTesting;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.apache.taglibs.standard.tag.common.xml.WhenTag;
import org.junit.Test;
import org.mockito.Mockito;

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
		   TimeSource mockedTimeSource = Mockito.mock(SystemTimeSource.class);
		   Watch w = new FinnishWatch(mockedTimeSource);
		   Calendar calendar = new GregorianCalendar();
		   calendar.set(2016, 10, 2, 20, 36, 17);		   
		   Mockito.when(mockedTimeSource.getTimeMoment()).thenReturn(calendar.getTime());
		   TimeSource mock2 = new MockTimeSource();		   
		   String expected =  w.getDay();
		   String actual = new FinnishWatch(mock2).getDay();
		   assertTrue(actual.equals(expected));
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
		   String actual = test.getDay(Languages.Finnish);
		   assertEquals(actual, expected);		   
	   }
	   
	   
	   
}

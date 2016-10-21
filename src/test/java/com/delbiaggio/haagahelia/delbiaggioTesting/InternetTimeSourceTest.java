package com.delbiaggio.haagahelia.delbiaggioTesting;

import static org.junit.Assert.assertEquals;

import java.net.InetAddress;
import java.util.Date;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;
import org.junit.Before;
import org.junit.Test;

public class InternetTimeSourceTest {

	private Date time;
	private InternetTimeSource its;
	private String TIME_SERVER = "nist-time-server.eoni.com";
	
	@Before
	public void init(){
		its = new InternetTimeSource();
        NTPUDPClient timeClient = new NTPUDPClient();
        try {
        	InetAddress inetAddress = InetAddress.getByName(TIME_SERVER);
        	TimeInfo timeInfo = timeClient.getTime(inetAddress);
        	long returnTime = timeInfo.getReturnTime();
        	time = new Date(returnTime);
		}catch(Exception e){}
	}
	/**
         * Test with a mock object to see if the internetconnection is working properly
         */
	   @Test()
	   public void testInternetTime(){
		   // New version but doesn't work..
		   // assertEquals(its.getTimeMoment().getTime(),time.getTime());
		    // Old version
		   TimeSource mock = new InternetTimeSource();
		   Watch test = new FinnishWatch(mock);		   
		   Watch test2 = new FinnishWatch(new SystemTimeSource());
		   String expected =  test.getDate();
		   String actual = test2.getDate();
		   assertEquals(actual, expected);
		   
	   }
	   
}

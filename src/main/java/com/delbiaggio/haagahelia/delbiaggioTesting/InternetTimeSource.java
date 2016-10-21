package com.delbiaggio.haagahelia.delbiaggioTesting;
/**
 * @author NicolasDelbiaggio
 * @version 18.10.2016
 *
 */
import java.util.Date;
import java.net.InetAddress;
import org.apache.commons.net.ntp.NTPUDPClient; 
import org.apache.commons.net.ntp.TimeInfo;

public class InternetTimeSource implements TimeSource {

	//private String TIME_SERVER = "time-a.nist.gov";
	/*This is the name of a server*/
	private String TIME_SERVER = "nist-time-server.eoni.com";
	/**
         * Method to get the current timezone based on a connection with an ntpudpclient, to take the source. returns in a dateformat.
         * @return 
         */
	public Date getTimeMoment() {
		Date time;          
        NTPUDPClient timeClient = new NTPUDPClient();
        try {
        	InetAddress inetAddress = InetAddress.getByName(TIME_SERVER);
        	TimeInfo timeInfo = timeClient.getTime(inetAddress);
        	long returnTime = timeInfo.getReturnTime();
        	time = new Date(returnTime);
		} catch (Exception e) {
			System.out.println("I'm not able to use the date of the server, so I used the runtime Date");
			time = new Date();
		}
		return time;
	}
}

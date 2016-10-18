package com.delbiaggio.haagahelia.delbiaggioTesting;
import java.util.Calendar;
/**
 * @author NicolasDelbiaggio
 * @version 18.10.2016
 *
 */
import java.util.Date;
import java.util.GregorianCalendar;

public class MockTimeSource implements TimeSource {

	private int YEAR = 2016;
	private int MONTH = 10;
	private int DAY = 2;
	private int HOURS = 20;
	private int MINUTES = 36;
	private int SECONDS = 17;
		
	public Date getTimeMoment() {
		Calendar calendar = new GregorianCalendar();
		calendar.set(YEAR, MONTH, DAY, HOURS, MINUTES, SECONDS);
		return calendar.getTime();
	}



}

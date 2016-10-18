package com.delbiaggio.haagahelia.delbiaggioTesting;
/**
 * @author NicolasDelbiaggio
 * @version 18.10.2016
 *
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class FinnishWatch implements Watch{

	private TimeSource source;
	private SimpleDateFormat timeFormatter = new SimpleDateFormat("m:s");
	private SimpleDateFormat dateFormatter = new SimpleDateFormat("d.M.Y");
	private TimeZone easternEuropeanTime;
	

	@Override
	public String getTime() {
		Date d = new SystemTimeSource().getTimeMoment();
		return timeFormatter.format(d);
	}

	@Override
	public String getDate() {
		Date d = new SystemTimeSource().getTimeMoment();				
		return dateFormatter.format(d);
	}

}

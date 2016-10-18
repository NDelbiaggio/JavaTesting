package com.delbiaggio.haagahelia.delbiaggioTesting;
/**
 * @author Nicolas Delbiaggio
 * @version 18.10.2016
 *
 */
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class FinnishWatch implements Watch{

	private TimeSource source;
	private SimpleDateFormat timeFormatter;
	private SimpleDateFormat dateFormatter;
	private TimeZone easternEuropeanTime;
	

	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDate() {
		// TODO Auto-generated method stub
		return null;
	}

}
